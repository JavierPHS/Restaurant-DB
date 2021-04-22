import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

    public class DBMS {
        static String c = ",";
        static int ID = 0;
        static void print(String s) {
        	System.out.println(s);
        }
        
        public static void main(String[] args) {
            boolean flag = true;
            while(flag) {

            	String[] options = {"1. Create Contact", "2. Edit Contact", "3. Search Contact", "4. Delete Contact", "5. Exit"};
                int choice = JOptionPane.showOptionDialog(null, "Select an option", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
                switch(choice) {
                    case 0: // Create Contact
                        createContact();
                        break;
                    case 1: // Edit Contact
                        editContact();
                        break;
                    case 2: // Search Contact
                        searchContact();
                        break;
                    case 3: // Delete Contact
                        deleteContact();
                        break;
                    default: // Exit
                        JOptionPane.showMessageDialog(null, "Exiting Database Management System...");
                        flag = false;
                        System.exit(0);
                } //end swtich
            } //end while   
        } // end main method


        static void createContact() {
        		ID++; //increase ID count
            	String data;
            	createFile("contact");
            	createFile("address");
            	createFile("phone");
            	print("");
            	//Take Name info
            	String firstName = JOptionPane.showInputDialog("Enter First Name");
                String lastName = JOptionPane.showInputDialog("Enter Last Name");
                String gender = JOptionPane.showInputDialog("Enter Gender"); 
            	data = (ID+c+firstName+c+lastName+c+gender+"\n");
            	writeToFile(data, "contact.txt");
            	//Take Address info
            	String address1 = JOptionPane.showInputDialog("Enter Address 1"); 
                String address2 = JOptionPane.showInputDialog("Enter Address 2 (Leave empty if it does not exist"); 
                String apt = JOptionPane.showInputDialog("Enter Apartment Number (Leave empty if it does not exist"); 
                String city = JOptionPane.showInputDialog("Enter City"); 
                String state = JOptionPane.showInputDialog("Enter State"); 
                String country = JOptionPane.showInputDialog("Enter Country"); 
            	data = (ID+c+address1+c+address2+c+apt+c+city+c+state+c+country+"\n");
            	writeToFile(data, "address.txt");
            	//Take Phone info
            	String type = JOptionPane.showInputDialog("Enter Phone Type (Work/Home/Personal)"); 
            	String number = JOptionPane.showInputDialog("Enter Phone Number"); 
            	data = (ID+c+type+c+number+"\n");
            	writeToFile(data, "phone.txt");
            return;
        }
        
        static void editContact() {
        	//ask user for ID
        	displayFile("contact.txt", "0");
        	print("");
        	String edit = JOptionPane.showInputDialog("Please enter the ID number of the contact you would like to edit.");
        	if (edit.length() == 0) return;
        	String data;
        	try {
        		
        	//Edit Info in contact.txt
            	File contact = new File("contact.txt");
            	Scanner input = new Scanner(contact);
            	List<String> list = new ArrayList<String>();
            	while(input.hasNextLine()) {
            		list.add(input.nextLine());
            	}//end while contact.txt has text
            	input.close();
            	FileWriter writerC = new FileWriter("contact.txt");
            	for (String str: list) {
            		if(str.charAt(0) == edit.charAt(0)) {
            			String firstName = JOptionPane.showInputDialog("Enter First Name");	
                		String lastName = JOptionPane.showInputDialog("Enter Last Name"); 
                		String gender = JOptionPane.showInputDialog("Enter Gender"); 
                		data = (edit+c+firstName+c+lastName+c+gender+"\n");
            			writerC.write(data);
            		}//end if ID is found
            		else {
            			writerC.write(str+"\n");
            		}//end else ID is not found
            	}
            	writerC.close();
            	
            	//Edit ID from "address.txt"
            	File address = new File("address.txt");
            	input = new Scanner(address);
            	List<String> list2 = new ArrayList<String>();
            	while(input.hasNextLine()) {
            		list2.add(input.nextLine());
            	}//end while contact.txt has text
            	input.close();
            	FileWriter writerA = new FileWriter("address.txt");
            	for (String str: list2) {
            		if(str.charAt(0) == edit.charAt(0)) {
            			String address1 = JOptionPane.showInputDialog("Enter Address 1"); 
                		String address2 = JOptionPane.showInputDialog("Enter Address 2 (Leave blank if it does not exist"); 
                		String apt = JOptionPane.showInputDialog("Enter Apartment Number (Leave blank if it does not exist"); 
                		String city = JOptionPane.showInputDialog("Enter City"); 
                		String state = JOptionPane.showInputDialog("Enter State"); 
                		String country = JOptionPane.showInputDialog("Enter Country"); 
                		data = (edit+c+address1+c+address2+c+apt+c+city+c+state+c+country+"\n");
            			writerA.write(data);
            		}//end if ID is found
            		else {
            			writerA.write(str+"\n");
            		}//end if ID is not found
            	}
            	writerA.close();
            	
            	//Edit ID from "phone.txt"
            	File phone = new File("phone.txt");
            	input = new Scanner(phone);
            	List<String> list3 = new ArrayList<String>();
            	while(input.hasNextLine()) {
            		list3.add(input.nextLine());
            	}//end while contact.txt has text
            	input.close();
            	FileWriter writerP = new FileWriter("phone.txt");
            	for (String str: list3) {
            		if(str.charAt(0) == edit.charAt(0)) {
            			String type = JOptionPane.showInputDialog("Enter Phone Type (Work/Home/Personal)"); 
        				String number = JOptionPane.showInputDialog("Enter Phone Number"); 
        				data = (edit+c+type+c+number+"\n");
            			writerP.write(data);
            		}//end if ID is not found
            		else {
            			writerP.write(str+"\n");
            		}
            	}
            	writerP.close();
        	}//end try
        	
        	catch (IOException e) {
        		System.out.println("An error has occurred");
        		e.printStackTrace();
        	} //end catch
        }
        
        
        static void searchContact() {
        	try {
            	displayFile("contact.txt", "0");
            	print("");
            	String search = JOptionPane.showInputDialog("Please enter the ID number of the contact you would like to view further info on.");
            	if(search.length() == 0) return;
            	String row;
            	//compare ID typed to ID in file
            	BufferedReader contact = new BufferedReader(new FileReader("contact.txt"));
            	while ((row = contact.readLine()) != null) {
            	    String[] line = row.split(",");
            	    if (Arrays.asList(line).contains(search)) {
            	    	System.out.print("Contact Info: ");
            	    	displayFile("contact.txt", search); print("");
            	    	System.out.print("Address Info: ");
            	    	displayFile("address.txt", search); print("");
            	    	System.out.print("Phone Info: ");
            	    	displayFile("phone.txt", search); print("");
            	    }
            	}//end while
            	contact.close();
        	} //end try
        	
        	catch (IOException e) {
        		System.out.println("An error has occurred");
        		e.printStackTrace();
        	} //end catch
        }
        
        static void deleteContact() {
        	//prompt user for ID to delete
        	displayFile("contact.txt", "0");
        	print("");
        	String delete = JOptionPane.showInputDialog("Please enter the ID number of the contact you would like to delete.");
        	if(delete.length() == 0) return;
        	//Delete contact ID from "contact.txt"
        	try {
        	File contact = new File("contact.txt");
        	Scanner input = new Scanner(contact);
        	List<String> list = new ArrayList<String>();
        	while(input.hasNextLine()) {
        		list.add(input.nextLine());
        	}//end while contact.txt has text
        	input.close();
        	FileWriter writerC = new FileWriter("contact.txt");
        	for (String str: list) {
        		if(str.charAt(0) != delete.charAt(0)) {
        			writerC.write(str);
        			writerC.write("\n");
        		}//end if ID is not found
        	}
        	writerC.close();
        	
        	//Delete ID from "address.txt"
        	File address = new File("address.txt");
        	input = new Scanner(address);
        	List<String> list2 = new ArrayList<String>();
        	while(input.hasNextLine()) {
        		list2.add(input.nextLine());
        	}//end while address.txt has text
        	input.close();
        	FileWriter writerA = new FileWriter("address.txt");
        	for (String str: list2) {
        		if(str.charAt(0) != delete.charAt(0)) {
        			writerA.write(str);
        			writerA.write("\n");
        		}//end if ID is not found
        	}
        	writerA.close();
        	
        	//Delete ID from "phone.txt"
        	File phone = new File("phone.txt");
        	input = new Scanner(phone);
        	List<String> list3 = new ArrayList<String>();
        	while(input.hasNextLine()) {
        		list3.add(input.nextLine());
        	}//end while phone.txt has text
        	input.close();
        	FileWriter writerP = new FileWriter("phone.txt");
        	for (String str: list3) {
        		if(str.charAt(0) != delete.charAt(0)) {
        			writerP.write(str);
        			writerP.write("\n");
        		}//end if ID is not found
        	}
        	writerP.close();
        	
        	} //end try
        	catch (IOException e) {
        		System.out.println("An error has occurred");
        		e.printStackTrace();
        	}
        } //end deleteFile
        
        static void displayFile(String file, String flag) {
        	try {
        	BufferedReader reader = new BufferedReader(new FileReader(file));
        	String row;
        	if (flag == "0") {
	        	while ((row = reader.readLine()) != null) {
	        	    String[] info = row.split(",");
	        	    System.out.println(Arrays.toString(info));
	        	}
        	} //end if flag is 0
        	else {
        		while ((row = reader.readLine()) != null) {
	        	    String[] info = row.split(",");
	        	    if (Arrays.asList(info).contains(flag)) {
	        	    	System.out.println(Arrays.toString(info));
	        	    }
        		}
        	} //end else flag is not 0
        	reader.close();
        	} //end try
        	catch (IOException e) {
        		System.out.println("An error has occurred");
        		e.printStackTrace();
        	}
        } // end displayFile
        
        static void writeToFile(String data, String file) {
        	try {
        	FileWriter csvWriter = new FileWriter(file, true);
        	csvWriter.write(data);
        	csvWriter.flush();
        	csvWriter.close();
        	}
        	catch (IOException e) {
        		System.out.println("An error occurred");
        		e.printStackTrace();
        	}
        } // end writeToFile

        static void createFile(String fileName) {
            try {
                File myObj = new File(fileName + ".txt");
                if (myObj.createNewFile()) {
                	System.out.println("File created: " + myObj.getName());
                	if (fileName == "contact") {
                    	FileWriter csvWriter = new FileWriter("contact.txt", true);
                    	String data = ("ID,First Name,Last Name,Gender\n");
                    	csvWriter.write(data);
                    	csvWriter.flush();
                    	csvWriter.close();
                    } //end if "contact.txt"
                	else if (fileName == "address") {
                    	FileWriter csvWriter = new FileWriter("address.txt", true);
                    	String data = ("ID,Address 1,Address 2,Apt,City,State,Country\n");
                    	csvWriter.write(data);
                    	csvWriter.flush();
                    	csvWriter.close();
                    } //end if "address.txt"
                	else if (fileName == "phone") {
                    	FileWriter csvWriter = new FileWriter("phone.txt", true);
                    	String data = ("ID,Type,Number\n");
                    	csvWriter.write(data);
                    	csvWriter.flush();
                    	csvWriter.close();
                    } //end if "phone.txt"
                }//end if file is created
            } //end try 
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } // end createFile
        
} //end DBMS class