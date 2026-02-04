import java.util.Scanner;
public class Calculator1{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
     float num1,num2,result;
     char operation;
     System.out.println("Welcome to Menu Driven Calculator");
     System.out.println("Addition of Numbers");
     System.out.println("Differences of Numbers");
     System.out.println("Product of Numbers");
     System.out.println("Division of Numbers");
     System.out.println("Enter your option:(+,-,*,/)");
     operation = sc.next().charAt(0);
     System.out.println("Enter First Number");
     num1 = sc.nextInt();
     System.out.println("Enter Second Number");
     num2 = sc.nextInt();
     
     switch(operation)
{
case '+': result = num1 + num2;
System.out.println("Addition of Two Numbers is "+ result);
break;
case '-': result = num1 - num2;
System.out.println("Difference of Two Numbers is "+ result);
break;
case '*': result = num1 * num2;
System.out.println("Products of Two Numbers is "+ result);
break;
case '/': result = num1 / num2;
System.out.println("Addition of Two Numbers is "+ result);
break;

default:
System.out.println("Invaild Option");
} 
    
 }
}