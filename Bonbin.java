class Binatang {

	void tidur(){
		System.out.println("Tidur...");
	}
}
class Gajah extends Binatang{
	void makan(){
		System.out.println("Gajah Makan...");
	}
	void tidur(){
		System.out.println("Gajah Tidur...");
	}
}
class Kerbau extends Binatang{
	void makan(){
		System.out.println("Kerbau Makan...");
	}
	void tidur(){
		System.out.println("Kerbau Tidur...");
	}
}
public class Bonbin {
	static void test(Binatang x){
		x.makan();
		x.tidur();
	}

	public static void main(String[] args){
		Gajah g = new Gajah();
		Kerbau k = new Kerbau();

		test(g);
		test(k);
	}
}
