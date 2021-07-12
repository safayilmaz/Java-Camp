package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] krediler = {
				"İhtiyaç Kredisi","Emeklilik Kredisi","MSB kredisi","Kültür Bakanlığı Kredisi"
		};
		
		for (int i = 0; i<krediler.length; i++) {
			System.out.print(i+1 + " - "  + krediler[i]+" ");
		}
	}

}
