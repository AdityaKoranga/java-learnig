// import java.io.*;
class LowBalanceException extends Exception{
    public String getMessage(){
        return "Less Balance unable to withdraw";
    }
    public String toString(){
        return "you have less balance";
    }
}

class Customer{
    String name;
    int balance;
    public Customer(String name, int amount){
        this.name=name;
        balance=amount;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void display(){
        System.out.println("the total amount you have "+balance);
    }
    public void withdraw(int money) throws LowBalanceException {
        if (money>balance)
            throw new LowBalanceException();
        balance-=money;
    }

}
public class SBI {
    public static void main(String[] args) {
        Customer c1= new Customer("aditya", 1200);
        c1.display();
        c1.deposit(2345);
        // c1.display();

        try{
            c1.withdraw(31423);
        }catch(LowBalanceException ex)
        {
            System.out.println(ex.getMessage()); 
        }
        c1.display();
        // finally{
        //     System.out.println("have a great day");
        // }
    }
}

// class LowBalanceException extends Exception
// {
// 	public String getMessage()
// 	{
// 		return "Sorry! Low Balance. Unable to Withdraw";
// 	}
// 	public String toString()
// 	{
// 		return "LowBalanceException: Sorry! Low Balance. Unable to Withdraw";
//     }
	
// }

// class Customer
// {
// 	String name;
// 	int balance;
// 	public Customer(String name, int opamt)
// 	{
// 		this.name=name;
// 		balance=opamt;
// 	}
// 	public void deposit(int amount)
// 	{
// 		balance+=amount;
// 	}
// 	public void withdraw(int amount) throws LowBalanceException
// 	{
// 		if(amount>balance)
// 			throw new LowBalanceException();
// 		balance-=amount;	
// 	}
// 	public void showBalance()
// 	{
// 		System.out.println("Current Balance is "+balance);
// 	}
// }

// class SBI
// {
// 	public static void main(String args[])
// 	{
// 		Customer c1=new Customer("Amit",8000);
// 		c1.deposit(5000);
// 		c1.showBalance();
// 		try
// 		{
// 			c1.withdraw(30000);
// 		}catch(LowBalanceException ex)
// 		{
// 			System.out.println(ex.getMessage());
// 		}
// 		c1.showBalance();
// 	}
// }