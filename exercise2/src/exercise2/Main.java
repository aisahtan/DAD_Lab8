package exercise2;

public class Main {
	public static void main(String args[]) {
		Runnable text = new TextThread();
		Thread  t = new Thread(text, "text");
		t.start();
		
		
		Runnable text1 = new TextThread();
		Thread t1 = new Thread(text1, "word1");
		t1.start();
	}
}