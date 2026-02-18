import java.util.Scanner;
public class Methods2{
     int empid,y_experience;
     String empname;
     float basic_salary,y_increment,bonus,gross_salary;
     Scanner sc = new Scanner(System.in);
     void Getdata(){
     System.out.println("Enter employee id");
     empid = sc.nextInt(); 
     System.out.println("Enter employee name");
     empname =  sc.next();
     System.out.println("Enter employee basic salary");
     basic_salary = sc.nextFloat();
     System.out.println("Enter employee year experience");
     y_experience = sc.nextInt();
     }
     boolean IsEligible(){
      if(y_experience%5==0){
        return(true);
      }
      else{
        return(false);
      }
     }
     float Gross_salary(){
       bonus = IsEligible() ? (15/100f * basic_salary) : 0;
        y_increment = (6/100f) * basic_salary;
        gross_salary = basic_salary + bonus + y_increment;
        return gross_salary;    
     }  
     void  DisplayData(){
        System.out.println("Employee id "+empid);
        System.out.println("Employee name "+empname);
        System.out.println("Employee basic salary "+basic_salary);
        System.out.println("Employee year experience "+y_experience);
        System.out.println("Employee y_increment "+y_increment);
        System.out.println("Employee bonus "+bonus);
        System.out.println("Employee gross salary "+ gross_salary);
     }
     public static void main(String[] args){
        Methods obj = new Methods();
        obj.Getdata();
        obj.Gross_salary();
        obj.DisplayData();

     }
}
