class Singleton{
	private static Singleton singleton;

	static{
		singleton = new Singleton();
	}

	private Singleton(){
		System.out.println("inside constructor...");
	}

	public static Singleton getSingleton() {
		return singleton;
	}

	

}

public class Main3 {

	 public static void main(String[] args) {
		Singleton.getSingleton();
		Singleton.getSingleton();
		Singleton.getSingleton();
		Singleton.getSingleton();
	 }
}