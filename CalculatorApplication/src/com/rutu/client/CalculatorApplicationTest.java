package com.rutu.client;

import java.util.Scanner;
import com.rutu.controller.CalculatorApplication;

public class CalculatorApplicationTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("<-------------- Welcome to Calculator Application ---------->");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Factorial");
            System.out.println("9. Square");
            System.out.println("10. Cube");
            System.out.println("11.Percentage");
            System.out.println("12. Exit");
            
            System.out.print("Enter Your choice: ");

            int choice = sc.nextInt();

           
            if (choice == 12) {
                System.out.println("Exiting... Thank you for using the Calculator Application.");
                flag = false;
                break;
            }

          
            int a = 0, b = 0;
            double result;

            
            if (choice == 7 || choice == 8 || choice == 9 || choice == 10) {
                System.out.print("Enter the number: ");
                a = sc.nextInt();
            } else {
                System.out.print("Enter the first number: ");
                a = sc.nextInt();
                System.out.print("Enter the second number: ");
                b = sc.nextInt();
            }

            
            switch (choice) {
                case 1:
                	result = CalculatorApplication.addition(a, b); 
                	System.out.println("Addition Result: " + result); 
                	break;
                case 2: 
                	result = CalculatorApplication.subtraction(a, b); 
                	System.out.println("Subtraction Result: " + result); 
                	break;
                case 3:
                	result = CalculatorApplication.multiplication(a, b); 
                	System.out.println("Multiplication Result: " + result);
                	break;
                case 4: 
                	result = CalculatorApplication.division(a, b); 
                	if (b != 0) 
                		System.out.println("Division Result: " + result); 
                		break;
                case 5: 
                	result = CalculatorApplication.modulus(a, b); 
                	System.out.println("Modulus Result: " + result);
                	break;
                case 6: 
                	result = CalculatorApplication.power(a, b); 
                	System.out.println("Power Result: " + result);
                	break;
                case 7: 
                	result = CalculatorApplication.squareRoot(a); 
                	System.out.println("Square Root Result: " + result); 
                	break;
                case 8: 
                	System.out.println("Factorial Result: " + CalculatorApplication.factorial(a));
                	break;
                case 9: 
                	System.out.println("Square Result: " + CalculatorApplication.square(a)); 
                	break;
                case 10: 
                	System.out.println("Cube Result: " + CalculatorApplication.cube(a));
                	break;
                case 11:
                    result = CalculatorApplication.percentage(a, b);
                    System.out.println("Percentage Result -----> " + result);
                    break;
                default: 
                	System.out.println("Invalid choice! Please try again.");
            }
        }
        
        sc.close();
    }
}
