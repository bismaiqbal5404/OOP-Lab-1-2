
package java_3;
import java.util.Scanner;


public class Java_3 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number");
        int num2 = input.nextInt();
        
        int sum = num1+ num2;
        int diff = num1-num2;
        int prod = num1*num2;
        
        System.out.println("Sum =" + sum);
        System.out.println("difference =" + diff);
        System.out.println("Product =" + prod);
        
        
        
    }
    
}
