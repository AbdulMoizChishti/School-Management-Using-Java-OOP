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

public class School implements Student,Teacher,Feesubmit {
 Scanner sc =new Scanner (System.in);
 
      
    
 

    
    
String fname,gender,nic,fo,ps,add,con,pc,age,pp;
        public void student( String fname,String gender,String age,String add,String con, String nic,String fo,String pc,String pp,String ps){
    
        
            this.fname=fname;
            this.gender=gender;
            this.age=age;
            this.add=add;
            this.con=con;
            this.nic=nic;
            this.fo=fo;
            this.pc=pc;
            this.pp=pp;
            this.ps=ps;
        
        }
    
    
        @Override
        public void student(){
        
            System.out.println("\n********************************************************\n");
        
            System.out.println("Student's Father name : "+fname);
            System.out.println("Student's Gender : "+gender);
            System.out.println("Student's Age : "+age);
            System.out.println("Student's Address : "+add);
            System.out.println("NIC/B-form Number : "+nic);
            System.out.println("Contact Number : "+con);
            System.out.println("Father occupation : "+fo);
            System.out.println("Student's previous Class : "+pc);
            System.out.println("Student's previous %  : "+pp);
            System.out.println("Student's Previous School: "+ps);
            System.out.println("\n*******************************************\n");        
    }
    
        String tname,sal,texp,prcl;
        public void teacher(String tname,String texp,String prcl,String sal){
            this.tname=tname;
            this.texp=texp;
            this.prcl=prcl;
            this.sal=sal;
        
        }
    
        @Override
        public void teacher(){
            System.out.println("\n********************************************************\n");
            System.out.println("Teacher Name : "+tname);
            System.out.println("Teacher Experience : "+texp);
            System.out.println("Teacher Preffered Class : "+prcl);
            System.out.println("Salary : "+sal);
            System.out.println("\n*******************************************\n");
    }
    
    String name,cl;
        public void feesubmit(String name,String cl){
            this.name=name;
            this.cl=cl;
        
}
    @Override
    public void feesubmit(){
        System.out.println("\n*******************************************\n");
        System.out.println("Your Reciept has Been generated which u Have to Deposit in Meezan Bank.\n\n");
        System.out.println("Student name "+name+ "\n class= "+cl);
        System.out.println("\nTution Fees = 2340 Rs\n");
        System.out.println("Library Fees = 70 Rs\n");
        System.out.println("Transport Fees = 1600 Rs\n");
        System.out.println("Total Amount = 4010 /- Rs");
        System.out.println("\n*******************************************\n");
    }
    
 private int bankaccount;   
public void onlinepayment(){

    System.out.println("Enter Bank Account");
    bankaccount=sc.nextInt();
    int b = bankaccount%10000000;
    System.out.println("******************************");
    System.out.println("\nRs 4010/- Has been Deducted from account No. = "+"*******"+b+"\n");
    System.out.println("*******************************************************");
    
    
    
}    
    
    
    
   
    
}
