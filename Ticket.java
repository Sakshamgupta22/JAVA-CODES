import java.util.Scanner;
public class Ticket{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
     int age,category,discount;
     System.out.println("Enter the age of Member");
     age = sc.nextInt();
      System.out.println("Do you have a membership card(true/false)");
     boolean isMember = sc.nextBoolean();
if(age < 12){
category = 5;
}
else if (age > 65){
category = 7;
}
else{
category = 10;
}
    switch(category)
{
 case 5: System.out.println("Children pay $5");
break;
 case 10: System.out.println("Adults pay $10");
break;
 case 7: System.out.println("Elders $7");
break;
}
if( isMember==true){
    discount = category-2;
    System.out.println("Your discounted ticket price is: " + discount);
}
else if(isMember==false){
    discount = category;
    System.out.println("Your ticket price is: " + discount);
  
//System.out.println("You get a 10% discount on your ticket");
}
}
 }
