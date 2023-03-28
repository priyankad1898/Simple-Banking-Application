package BankAp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAppliction 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int amount;
		int accno;
		ArrayList<Account>list=new ArrayList();
		list.add(new Account(" Priyanka Daware "," Pune ",           10000));
		list.add(new Account(" Chetan Landge "  ," Mumbai ",         50000));
		list.add(new Account(" Pratima Dhole "  ," Mumbai Boriwali", 7000));
		list.add(new Account(" Pratibha Jadhav "," Mumbai Ghatkoper",9000));
		list.add(new Account(" Smit Jadhav "    ," Mumbai Badlapur", 9000));
		list.add(new Account(" Jija Dhole "     ," Mumbai Ghatkoper",9000));

		
		System.out.println("--*--  Select Oprations --*-- ");
		System.out.println("1. Open New Account");
		System.out.println("2. Money  Deposite");
		System.out.println("3. Money Withdrow ");
		System.out.println("4. View Account Details ");
		System.out.println("5. List of all Accounts Details");
		System.out.println("6. Exit ");
		
		int choice;
		boolean found;
		do {
		System.out.println("Enter Your Choice ----> ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Open Account ----> ");
			System.out.println("Enter The Name");
			name=sc.next();
			System.out.println("Enter The City");
			city=sc.next();
			System.out.println("Enter The Amount");
			amount=sc.nextInt();
			Account acc=new Account(name,city,amount);
			System.out.println("Account Open Succesfully ....!");
			list.add(acc);
			break;
		case 2:
			System.out.println("Money Deposite ----> ");
			found=false;
			System.out.println("Enter The Account Number ");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("Customer Name "+ac.getName());
				System.out.println("City Name "+ac.getCity());
				System.out.println("Account Balence "+ac.getBal());
				
				System.out.println("Enter Ammount To Deposite The Money ");
				amount=sc.nextInt();
				ac.setBal(ac.getBal()+amount);
				System.out.println("Deposite Succesfully ......!");
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account Number .... ");
			}
			break;
			
		case 3:
			System.out.println("Money Withdrow ----> ");
			found=false;
			System.out.println("Enter The Account Number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("Customer Name "+ac.getName());
				System.out.println("City Name"+ac.getCity());
				System.out.println("Account Balence "+ac.getBal());
				
				System.out.println("Enter Ammount To Withdrow The Money ");
				amount=sc.nextInt();
				if(amount<=ac.getBal()) 
				{
				    ac.setBal(ac.getBal()-amount);
				    System.out.println("Withdrow Succesfully .....! ");
				}
				else 
				{
					System.out.println("Insufficient Balance ....! ");
				}
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account Number ..... ");
			}
			break;
			
		case 4:
			System.out.println("View Account Details ---->");
			found=false;
			System.out.println("Enter The Account Number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("Customer Name "+ac.getName());
				System.out.println("City Name "+ac.getCity());
				System.out.println("Account Balence "+ac.getBal());
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account Number ....");
			}
			break;
		
		case 5:
			System.out.println("List Of All Accounts Details ...");
			for(Account ac:list)
				{
					System.out.println(ac);
				}
			break;
			
		case 6:
			System.out.println("Thanks For Visiting...");
			break;
			default:
				System.out.println("Invalid Choice .....");
				break;
		}
		}while(choice!=6);


	}

}

