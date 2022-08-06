// import java.util.*;
// import java.io.*;

class Customer{

    String name;
    double balance;
    //cunstructor
    public Customer( String name,double newamount){
        this.name=name;
        balance= newamount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void showAmount(){
        System.out.println("your amount is : "+balance);
    }
    public static void calcInt(double p, double r,int t){
        double interest= (p*r*t)/100;
        System.out.println("the interest you will get: ");
        System.out.println(interest);
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1= new Customer("aditya", 23353);
        c1.deposit(5454);
        c1.showAmount();
        Customer.calcInt(25345, 2, 5);
    }
}
