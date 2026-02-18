import java.util.Scanner;
public class Factorial {
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long fact = 1;
    System.out.println("Enter a number to find its factorial: ");
    long num = sc.nextLong();
    if(num<0){
        System.out.println("Factorial is not defined for negative numbers.");
    }
    else if(num==0||num==1){
        System.out.println("Factorial is 1");
    }
    else{
    for(int i =1;i<=num;i++){
        fact *= i;
    }
    }
    System.out.println("Factorial of "+num+" is:"+fact);

}
}