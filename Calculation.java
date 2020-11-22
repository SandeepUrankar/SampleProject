import Multiplication.*;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum, quotient, product, remainder;
        System.out.println("Enter two values:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        Add a = new Add();
        Substract s = new Substract();
        Division d = new Division();
        Multiply m = new Multiply();
        System.out.println("The Sum of those two numbers is: "+a.add(num1, num2));
        System.out.println("The Remainder of those two numbers is: "+s.substract(num1, num2));
        System.out.println("The Product of those two numbers is: "+m.multiply(num1, num2));
        System.out.println("The Quotient of those two numbers is: "+d.division(num1, num2));
        

    }
    


    
}
