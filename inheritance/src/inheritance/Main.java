package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer sefa = new IndividualCustomer();
		sefa.setIdentityNumber(399612966);
		sefa.setName("Sefa");
		sefa.setSurname("Yilmaz");
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setcompanyName("Hepsi Burada");
		hepsiBurada.settaxNumber(12345678);
		
		System.out.print(sefa.getName() + sefa.getSurname());
	}

}
