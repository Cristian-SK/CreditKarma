
public class Creditcard {
	
	private String accountHolder; 
	private int accountNumber;
	private int creditScore;
	private int rate;
	private double balance;
	private int creditLimit;
	
	
		public Creditcard(String aH,int aN, int cS) {
			accountHolder= aH;
			creditScore= cS;
		}
		//Setters
			public void setAccountHolder(String aH) {
				accountHolder= aH;
		}
			public void setAccountNumber(int aN) {
				accountNumber= aN;
		}
		
			public void setcreditScore(int cS) {
				if(cS>= 0 && cS>= 300) {
					(baseRate + .10);
					creditLimit=1000;
				}
				if(cS<= 300 && cS>= 500) {
					(baseRate + .07);
					creditLimit=3000;
				}
				if(cS<= 500 && cS>= 700) {
					(baseRate + .04);
					creditLimit=7000;
				}
				if(cS>700 ) {
					(baseRate + .01);
					creditLimit=15000;
				}
				creditScore= cS;
		}
			public void setRate(int R) {
				rate=R;
		}
			
			public void setBalance(double b) {
				balance=b;
		}
			
			public void setCreditLimit(int cL) {
				creditLimit= cL;
		}
			
		//Getters
			
				public String getAccountHolder() {
					return accountHolder;
			}
				public int getAccountNumber() {
					return accountNumber;
			}
			
				public int getcreditScore() {
					return creditScore;			
			 }	
				public int getRate() {
					return rate;
			}
				
				public double getBalance() {
					return balance;
			}
				
				public double getCreditLimit() {
					return creditLimit;
			}
		
		
		//Methods
		public double makePurchase() {
			
			return 
		}
		
		public double makePayment() {
			
			return
		}
		
		public double raiseRate() {
			
			return
		}
		
		public double raiseLimit() {
			
			return
		}
		
		public double calculateBalance() {
			
			return
		}
		
		public String toString() {
			
			return
		}
}
