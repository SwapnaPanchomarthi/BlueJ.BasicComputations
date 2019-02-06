 
import java.util.Scanner;

public class IntegerPrinter {
    
        
       // Scanner n = new Scanner(System.in);
        
        //int i = n.nextLine();
        
        
    public String printIntegerAsBinary(int value){
        return Integer.toString(value,2);
    }

    public String printIntegerAsOctal(int value){
        
        return Integer.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in); 
       System.out.printf("Enter Number:  ");
       int value = in.nextInt();
        
    }
}
