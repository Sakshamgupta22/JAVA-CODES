import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0;
   
    for(int i= 2;i<=(a-1);i++){
        if(a%i==0){
            count++;
            break;
        }
    }
    if(count==0){
     System.out.println("Number is prime");
    }
    else{
        System.out.println("Number is not prime");
    }
}

}