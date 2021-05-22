/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class SchoolManagementSystem {
    public static void main (String args[]){
        String name,cl;
        Scanner sc =new Scanner (System.in);
        School obj =new School();
        
        int ch=0;
        
        while(ch<=3){
            System.out.println("Press The following according to your choice: \n1: Student Module \n2:Teacher Module \n3:Fees Submission \n4:Exit");
        
            System.out.print("\nEnter Your Choice : ");
            ch=sc.nextInt();
            
            if(ch==1){
        
                System.out.println("\n\n\t\t ---------->STUDENT MODULE<---------\n\n");
                System.out.print("Enter Student Name : ");
                String studentName[]=new String[10];
                String rollNum[]= {"2021-1A-001","2021-1A-002"};
                for(int i=0; i< studentName.length; i++){
                    studentName[i]= sc.nextLine();
                    studentName[i]= sc.nextLine();
                    break;  
                }
                
                System.out.println("The roll number of " + studentName[0]+ " = "+rollNum[0]);
        
                System.out.print("Enter Father Name : ");
                String fname=sc.nextLine();
        
                System.out.print("Enter Student's Gender : ");
                String gender=sc.nextLine();
        
                System.out.print("Enter Student's age : ");
                String age=sc.nextLine();
        
                System.out.print("Enter Student's address : ");
                String add=sc.nextLine();
//                add=sc.nextLine();
        
                System.out.print("Enter Student CNIC/B-Form number : ");
                String nic=sc.nextLine();
      
                System.out.print("Enter Contact Number : ");
                String con=sc.nextLine();
            
                System.out.print("Enter Father's profession : ");
                String fo=sc.nextLine();
        
                System.out.print("Enter Student Previuos Class : ");
                String pc=sc.nextLine();
        
                System.out.print("Enter Student Prevoius Percentage : ");
                String pp=sc.nextLine();
        
                System.out.print("Enter the name of Previous School : ");
                String ps=sc.nextLine();
//                ps=sc.nextLine();
            
                obj.student(fname, gender, age, add, con, nic, fo, pc, pp, ps);
                obj.student();
            }
        
        
        
            else if(ch==2){
                
                System.out.println("\n\n\t\t ---------->TEACHER MODULE<---------\n\n");
        
                System.out.print("Enter Teacher Name : ");   
                String tname=sc.nextLine();
                sc.nextLine();
            
                System.out.print("Enter Teacher Experience : ");   
                String texp=sc.nextLine();
            
                System.out.print("Enter Teacher's preferred class : ");   
                String prcl=sc.nextLine();
            
                System.out.print("Enter Expected Salary : ");   
                String sal=sc.nextLine();
            
                obj.teacher(tname, texp, prcl, sal);
                obj.teacher();
            }
        
        
        
            else if(ch==3){
                
                System.out.println("\n\n\t\t ---------->FEES SUBMIT MODULE<---------\n\n");
                System.out.println("Choose Method Of Payment: \n1:Cash \n2:Online Payment");
                System.out.print("\nEnter your Choice : ");
                int choice=sc.nextInt();
                switch(choice){
                
                    case 1:
                        System.out.println("\n\n\t\t ---------->CASH PAYMENT<---------\n\n");
                        System.out.print("Enter student Name: ");
                        name=sc.nextLine();
                        name=sc.nextLine();
               
                        System.out.print("Enter Student Class:");
                         cl=sc.nextLine();
                        
                        
                        
                        obj.feesubmit(name,cl);
                        obj.feesubmit();
                    break;
                    
                    case 2:
                        System.out.println("\n\n\t\t ---------->ONLINE PAYMENT<---------\n\n");
                        System.out.print("Enter student Name: ");
                        name=sc.nextLine();name=sc.nextLine();
               
                        System.out.print("Enter Student Class:");
                        cl=sc.nextLine();
                        obj.onlinepayment();
                    break;
                        
                    default:
                        System.out.println("none");
                     
                        
                        
                }
            }
        }
    }
}
