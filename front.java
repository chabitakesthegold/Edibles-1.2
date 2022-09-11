import java.util.Scanner;

public class front {
    
 public void log_in(){
    System.out.println(" Powered by =District=");
    System.out.print(" which view do you wish to see?(Student/Staff):");
    Scanner Sc= new Scanner(System.in);
    String extraOrder=Sc.next();
    if(extraOrder.equalsIgnoreCase("Student"))
    {   
        studentMenu studentMenu1= new studentMenu();
        studentMenu1.display(); 
        
        studentBill studentBill1= new studentBill();
        studentBill1.order();}
    else if(extraOrder.equalsIgnoreCase("Staff"))
    {       staffMenu staffMenu1= new staffMenu();
            staffMenu1.display();
            staffBill staffBill1= new staffBill();
            staffBill1.order();
    }
    else{System.out.println("Invalid choice in your selection!");}





 }   
}
