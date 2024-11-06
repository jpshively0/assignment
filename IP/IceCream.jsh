import java.util.Scanner;

Scanner myObj = new Scanner(System.in); // Create a Scanner object
System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavor = myObj.nextLine();

if(flavor.equals("v")|| flavor.equals("c")|| flavor.equals("s")) 
{
System.out.println("How many scoops would you like?");
int q = myObj.nextInt();

if(q>3 && q!=0){
	System.out.println("That's too many scoops to fit in a cone.");

}else if(q == 0){
	System.out.println("We don't sell just a cone."); 
}

//student id number: 33015648

double price = 0.100;
switch(flavor) {
	case "v":
		 price += 0.48*q;
		break;
	case "c":
		 price += 0.56*q;
		break;
	case "s":
		 price += 0.01*q;
		break;
	

}
if(q>0 && q<4){
System.out.println("That will be " + price + " please.");
	}

}else{System.out.println("We don't have that flavour.");}