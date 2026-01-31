import java.util.Scanner;
public class Greatest{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num1;
int num2;
int num3;
 System.out.println("Enter the Frist number: ");
 num1 = sc.nextInt();
 System.out.println("Enter the Second number: ");
 num2 = sc.nextInt();
 System.out.println("Enter the Third number: ");
 num3 = sc.nextInt();
 if(num1>num2 && num1>num3){

 System.out.println(num1+" is greatest"); 
}
else if(num2>num1 && num2>num3){

 System.out.println(num2+" is greatest"); 
}

 else{
 System.out.println(num3+" is greatest"); 
}      
 }
}