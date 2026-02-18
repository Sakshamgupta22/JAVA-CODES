import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float area,l,b,r,side;
    float pi = 3.14f;
    int option;
    char ch = 'y';
    do{
    System.out.println("\t \t Welcome to menu driven program for area calculator");
    System.out.println("1. Cricle Area");
    System.out.println("2. Rectangle Area");
    System.out.println("3. Square Area");
    System.out.println("Enter your option");
    option = sc.nextInt();
    switch(option){
       case 1:
       System.out.println("Enter the radius of circle");
         r = sc.nextFloat();
            area = pi*r*r;
        System.out.println("Area of circle is "+area);
        break;
        case 2:
            System.out.println("Enter the length of rectangle");
            l = sc.nextFloat();
            System.out.println("Enter the breath of rectangle");
            b = sc.nextFloat();
            area = l*b;
            System.out.println("Area of rectangle is "+area);
        
        break;
        case 3:
        System.out.println("Enter the side of square");
        side =sc.nextFloat();
        area = side*side;
        System.out.println("Area of sqaure is "+area);
        break;
default:
    System.out.println("Invaild Option");
    }
    System.out.println("Do you want to continue y/n");
    ch = sc.next().charAt(0);
    }while(ch=='y');
}

}
