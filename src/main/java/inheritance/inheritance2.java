package inheritance;

public class inheritance2 extends inheritance {
	String baba;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arfunagiri");
		inheritance2 a = new inheritance2();
		a.getname();

	}

	public String getText1() {
		this.baba = "Kutty";
		return baba;
	}

	public void getname() {
		getText();

		System.out.println("Nana");
	}
}
