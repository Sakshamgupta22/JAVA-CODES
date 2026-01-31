import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int java;
int dbms;
int stats;
int gd;
int verbala;
System.out.println("Enter the marks of java :");       
java = sc.nextInt();
System.out.println("Enter the marks of dbms :");       
dbms = sc.nextInt();
System.out.println("Enter the statistic :");       
stats = sc.nextInt();
System.out.println("Enter the group discusstion :");       
gd = sc.nextInt();
System.out.println("Enter the verbal ability of student :");       
verbala = sc.nextInt();
float total = java + dbms + stats + gd + verbala ;
float percentage = (total/500)*100; 

if(percentage > 70){
System.out.println("Passed with Excellent grade");
} 
if(percentage >60 && percentage <= 70){
System.out.println("Passed with Frist grade");
} 
if(percentage >50 && percentage <= 60){
System.out.println("Passed with Second grade");
}   
if(percentage >40 && percentage <= 50){
System.out.println("Passed with Third grade");
} 
if(percentage <40){
System.out.println("Fail");
}                      
 }
}