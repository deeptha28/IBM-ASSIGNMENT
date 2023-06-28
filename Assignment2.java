import java.util.*;
class Bank{
    int accNo;
    String name=null;
    int balance;
    
    void setData(int a, String n, int b){
        accNo=a;
        name=n;
        balance=b;
    }
    void deposit(int amt){
        balance=balance+amt;
    }
    void withdraw(int amt){
        if(amt>balance){
            System.out.println("Amount cannot be withdrawn");
        }
        else{
            balance=balance-amt;
        }
    }
    void display(){
        System.out.println("Account no: "+accNo);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    } 
}

public class Assignment2 {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setData(1234,"Riya",10000);
        b1.deposit(5000);
        b1.withdraw(2000);
        b1.display();
    }
}