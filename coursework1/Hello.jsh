import java.util.Scanner;


Scanner myObj = new Scanner(System.in);  // Create a Scanner object
System.out.println("Enter Student Number");

String userName = myObj.nextLine();
System.out.println("Hello, student " + userName);