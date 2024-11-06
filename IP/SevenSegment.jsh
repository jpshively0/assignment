void display(int n){


int length = String.valueOf(n).length();
System.out.println(length);
int[] x = new int[length];

for(int i = 0; i<length; i++){

x[i] = n % 10;
n =  n / 10;
}
System.out.println(x[1]);


for(int i = 0; i < x.length / 2; i++)
{
    int temp = x[i];
    x[i] = x[x.length - i - 1];
    x[x.length - i - 1] = temp;
}



for(int j = 0; j<x.length; j++){
switch(x[j])  
{  
      case 0:  
        System.out.println(" _ \n| | \n|_|");  
        break;
		
		case 1:  
        System.out.println(" \n  |\n  |");  
        break;  
		
		
		case 2:  
        System.out.println(" _ \n  |\n _ \n|\n _");  
        break;  
		
		case 3:  
        System.out.println(" _\n  |\n _ \n  |\n _");  
        break;  
		
		case 4:  
    System.out.println("   \n|_|\n  |");  
        break;  
		
		case 5:  
      System.out.println(" _ \n|_ \n _|");    
        break;  
		
		case 6:  
     System.out.println(" _ \n|_ \n|_|");    
        break;  
		
		 case 7:  
        System.out.println(" _ \n  |\n  |");  
        break;  
     
	 case 8:  
        System.out.println(" _ \n|_|\n|_|");  
        break;  
     
	 case 9:  
        System.out.println(" _ \n|_|\n _|");  
        break;  





}



}

}