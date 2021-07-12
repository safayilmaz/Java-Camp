package inheritance;

public class CorporateCustomer extends Customer {
	
	 private int taxNumber;
	 private String companyName;
	 
	 public int gettaxNumber() {
		 return this.taxNumber;
	 }
	 
	 public void settaxNumber(int taxNumber) {
		 this.taxNumber = taxNumber;
	 }
	 
	 public String getcompanyName() {
		 return this.companyName;
	 }
	 
	 public void setcompanyName(String companyName) {
		 this.companyName = companyName;
	 }
}
