import java.util.Scanner;
 public class DetailStudent{
    public static void main(String[] args){ 
           Scanner sc = new Scanner(System.in);
           String Name;
           String Course;
           int semister;
           String section;
           int rollno;
           int java;
           int dbms;
           int stats;
           int gd;
           int verbal;
           int total = java + dbms + stats + gd + verbal;
           float percentage = (total /500) * 100;
           System.out.println("Enter the name of student :");
           Name = sc.next();
           System.out.println("Enter the course of student :");
           Course = sc.next();
           System.out.println("Enter the semister of student :");
           semister = sc.nextInt();
           System.out.println("Enter the section of student :"); 
           section = sc.next();
           System.out.println("Enter the rollno of student :");       
           rollno = sc.nextInt();
           System.out.println("Enter the marks of java :");       
           java = sc.nextInt();
           System.out.println("Enter the marks of dbms :");       
           dbms = sc.nextInt();
           System.out.println("Enter the statistic :");       
           stats = sc.nextInt();
           System.out.println("Enter the group discusstion :");       
           gd = sc.nextInt();
           System.out.println("Enter the verbal ability of student :");       
           rollno = sc.nextInt();
         
           System.out.println("Nmae of student :"+Name);
           System.out.println("Course of student :"+Course);
           System.out.println("Semister of student :"+semister);
    ]      System.out.println("Section of student :"+section);
           System.out.println("Rollno of student :"+rollno);
           System.out.println("Marks of java :"+java);
           System.out.println("Marks of dbms :"+dbms);
           System.out.println("Marks of statistics :"+stats);
           System.out.println("Marks of group discussion :"+gd);
           System.out.println("Marks of verbal ability :"+verbal);
           System.out.println("Total marks :"+total);
           System.out.println("Percentage :"+percentage);
               
           
           
}
}