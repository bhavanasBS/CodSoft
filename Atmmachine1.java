package codsoft;
import java.util.*;
class BankAccount {
	double balance;
	public BankAccount(double initialbal) {
	  this.balance=initialbal;
	}
	void checkbalance() {
		if(balance>0)
		System.out.println("Current balance is : " +balance);
	
	else 
		System.out.println("Balance is invalid");
	}
	
	void deposit(int amount) {
		if(amount>0) {
		balance+=amount;
		System.out.println("After deposited : " +balance );

	}
		else {
			System.out.println("Please enter valid amount to deposit");
		}
		
	}
	void withdraw(int withdrawamt) {
		if(withdrawamt>0 && balance>withdrawamt) {
		balance-=withdrawamt;
		System.out.println("Current balance after withdrawing" +balance);
	}
		else {
			System.out.println("Insufficient balance or invalid number");
		}
	}
	
}


public class Atmmachine1 {
	   public static void main(String args[]) {
		   BankAccount object=new BankAccount(1000);
		   
		   Scanner s = new Scanner(System.in);
	    
	    	
	    	while(true) {
	    		  System.out.println("Enter number 1-4. 1.Check balance \n 2.Deposit amount\n 3.Withdraw \n 4.Exit");
	    	    	int choice=s.nextInt();
	    		if(choice==1) {
	    			object.checkbalance();
	    		}
	    		else if(choice==2) {
	    			System.out.println("Enter the amount to be deposited");
	    			int amount=s.nextInt();
	    			object.deposit(amount);
	    		}
	    		else if(choice==3) {
	    			System.out.println("Enter the amount to be withdrawed : ");
	    			int withdrawAmt=s.nextInt();
	    			object.withdraw(withdrawAmt);
	    		}
	    		else if(choice==4) {
	    			System.out.println("Thank you ");
	    			break;
	    		}
	    		else {
	    			System.out.println("Please enter correct choice");
	    		}
	    	}
	    	s.close();
			
	   }
	}

