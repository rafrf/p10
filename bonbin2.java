class Binatang {
	void makan(){
		System.out.println("Makan...");
	}
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
	void duduk(){
		System.out.println("Gajah Duduk...");
	}
}
public class Bonbin {
	public static void main(String[] args){
		Binatang g = new Gajah();
		g.makan();
		g.tidur();
		((Gajah)g).duduk();
	}
}
