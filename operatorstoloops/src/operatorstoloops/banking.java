package operatorstoloops;

public class banking {
			public static void main(String[] args) {
				int AccountNumber=1;
				String Bankname="punjab";
				String AccountholderName="nanda";
				double Balance=10000;
				String IFSC="VVIP005";
				int amount=500;
				String Salary="deposit";
//				System.out.println(AccountName);
//				System.out.println(AccountNumber);
				if (AccountNumber==1) {
				
				switch (Salary) {
				case "withdraw":
					if (Balance>=amount) {
						Balance-=amount;
						System.out.println("withraw :"+ amount);}
					else
						System.out.println("not surficent balance");
					break;
				case "deposit":
				    Balance+=amount;
					System.out.println("amount created "+amount);
					break;
				case "enquary":
					System.out.println("Account Holder name : "+AccountholderName);
					System.out.println("AccountNumber : "+ AccountNumber);
					System.out.println("IFSC Code : "+IFSC);
					
				
				}
					
				System.out.println("Available balance : "+Balance);

			}
				else
					System.out.println("enter valid bank details");
			}
		
		// TODO Auto-generated method stub

	}


