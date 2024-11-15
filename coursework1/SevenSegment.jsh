void display(int n) {

String[] segments = new String[5]; 

    
for (int i = 0; i < 5; i++) {
        segments[i] = "";
}

    
    String Str = String.valueOf(n);

    
    for (int j = 0; j < Str.length(); j++) {
        int digit = Character.getNumericValue(Str.charAt(j));
        
       
        for (int i = 0; i < 5; i++) {
            segments[i] += ssd(digit, i + 1);
        }
    }

   
    for (String line : segments) {
        System.out.println(line);
    }
}






//given a digit d and a line number n (from 1 to 5), returns a String representing line n of digit d.


String ssd(int d, int n) {
    switch ((d * 10) + n) {

        case 11: case 41:
            return "    |"; 
        
      
        case 21: case 25:
            return " -- "; 
        case 22:
            return "   |"; 
        case 23:
            return " -- "; 
        case 24:
            return "|   "; 

        case 31: case 35:
            return " -- "; 
        case 32: case 34:
            return "   |"; 
        case 33:
            return " -- ";


        case 51: case 55:
            return " -- "; 
        case 52:
            return "|   "; 
        case 53:
            return " -- "; 
        case 54:
            return "   |"; 

      
        case 81: case 83: case 85:
            return " -- "; 
        case 82: case 84:
            return "|  |"; 

        default:
            return "    ";
    }
}
