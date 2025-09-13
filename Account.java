package Encapsulation;

class Bank_Acc_Holder{
	private String Bank_Account_Holder_Name;
	private long Bank_Acc_No;
	private String Bank_IFSC_code;
	private String Bank_branch;
	public String getBank_Acount_Holder_Name() {
		return Bank_Account_Holder_Name;
		
	}
	public String getBank_Account_Holder_Name() {
		return Bank_Account_Holder_Name;
	}
	public void setBank_Account_Holder_Name(String bank_Account_Holder_Name) {
		Bank_Account_Holder_Name = bank_Account_Holder_Name;
	}
	public long getBank_Acc_No() {
		return Bank_Acc_No;
	}
	public void setBank_Acc_No(long bank_Acc_No) {
		Bank_Acc_No = bank_Acc_No;
	}
	public String getBank_IFSC_code() {
		return Bank_IFSC_code;
	}
	public void setBank_IFSC_code(String bank_IFSC_code) {
		Bank_IFSC_code = bank_IFSC_code;
	}
	public String getBank_branch() {
		return Bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		Bank_branch = bank_branch;
	}
   	
}

public class Account {
 public static void main(String[] args) {
	Bank_Acc_Holder b1 = new Bank_Acc_Holder();
	b1.setBank_Account_Holder_Name("Pooja");
	b1.setBank_Acc_No(244586);
	b1.setBank_IFSC_code("S934H8");
	b1.setBank_branch("sangamner");
	System.out.println(b1.getBank_Acc_No()+"\n"+b1.getBank_Account_Holder_Name()+"\n"+b1.getBank_IFSC_code());
}
}
