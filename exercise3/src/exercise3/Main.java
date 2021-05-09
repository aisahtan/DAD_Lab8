package exercise3;

public class Main {
	public static void main(String args[]) {
		Runnable text = new TextThread();
		Runnable text1 = new TextThread();
		Runnable text2 = new TextThread();
		
		Thread  t = new Thread(text, "text");
		Thread t1 = new Thread(text1, "word1");
		Thread t2 = new Thread(text2, "word2");
		
		t.start();
		t1.start();
		t2.start();
	}
}
