import java.util.*;
import java.lang.*;

class balance{
	public static void main(String[] args) {
		int wallet_balance,card_balance,bill_amt;
		boolean iswallet,isdone = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter bill amount");
		bill_amt = s.nextInt();
		System.out.println("Enter Wallet balance amount");
		wallet_balance = s.nextInt();
		System.out.println("Enter card balance amount");
		card_balance = s.nextInt();
		System.out.println("Do you wat to take money from wallet");
		iswallet = s.nextBoolean();
		if(iswallet)
		{
			if(wallet_balance>=bill_amt)
			{
				wallet_balance -= bill_amt;
				bill_amt =0;
				isdone = true;
			}else {
				bill_amt-=wallet_balance;
				wallet_balance=0;
				isdone = true;
			}
		}
		while(bill_amt!=0)
		{
			if(card_balance<bill_amt)
			{
				System.out.println("Insufficient balance");
				isdone = false;
				break;
			}else {
				card_balance -=bill_amt;
				bill_amt=0;
				isdone = true;
			}
		}
		if(isdone)
		{
			System.out.println("Purchase completed");
			System.out.println("Available balances are\ncard:\t"+card_balance+"\nwallet:\t"+wallet_balance);
		}
	}
}