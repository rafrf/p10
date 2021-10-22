class Gajah {
	void makan(){
		System.out.println("Gajah Makan...");
	}
	void tidur(){
		System.out.println("Gajah Tidur...");
	}
}
class Kerbau {
	void makan(){
		System.out.println("Kerbau Makan...");
	}
	void tidur(){
		System.out.println("Kerbau Tidur...");
	}
}
public class Bonbin1 {
	static void test(Gajah x){
		x.makan();
		x.tidur();
	}
	static void test(Kerbau x){
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
