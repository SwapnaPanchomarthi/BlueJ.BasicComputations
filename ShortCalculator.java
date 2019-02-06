 import java.util.Scanner;


public class ShortCalculator {
        
        public short unassignedsum(short a, short b){
            System.out.println("Sum of Short is");
            return (short)(a+b);
        }
        
        public short difference(short a, short b){
            System.out.println("Difference of Short is");
            return (short)(a-b);
        }
        
        public short quotient(short a, short b){
            System.out.println("Quotient of Short is");
            return (short)(a/b);
        }
        
        public short remainder(short a, short b){
            System.out.println("Remainder of Short is");
            return (short)(a%b);
        }
    
    public static void main(String[] args){
        ShortCalculator c = new ShortCalculator();
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter number1.");
        short a = dd.nextShort();
        System.out.println("Enter number2.");
        short b = dd.nextShort();
        //c.unassignedsum(a,b);
        System.out.println(c.unassignedsum(a,b));
        System.out.println(c.difference(a,b));
        System.out.println(c.quotient(a,b));
        System.out.println(c.remainder(a,b));
        
}}
