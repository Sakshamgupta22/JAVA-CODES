import java.util.Scanner;
public class MenuDriven{
    public static void main(String[] agrs){
float a,b;
int option;
char ch = 'y';
Scanner sc = new Scanner(System.in);
do{
    System.out.println("Welcome to menu driven program");
    System.out.println("1. Addtion");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Modolus");
    System.out.println("Enter the first number");
    a = sc.nextFloat();
    System.out.println("Enter the Second number");
    b = sc.nextFloat();
    System.out.println("Enter your option");
    option = sc.nextInt();
    switch(option){
        case 1:
          float  add = a+b;
            System.out.println("Addition is "+add);
            break; 
            case 2:
            float sub =a-b;
            System.out.println("Subtraction is "+sub);
            break;
            case 3:
            float mul = a*b;
            System.out.println("Multiplication is "+mul);
            break;
            case 4:
            float div = a/b;
            System.out.println("Division is "+div);
            break;
            case 5:
            float mod = a%b;
            System.out.println("Modolus is "+mod);
            break;
            default:
                System.out.println("Invaild Option");    
    }
    System.out.println("Do you want to continue y/n");
    ch = sc.next().charAt(0);
}while(ch=='y');
    }
}
