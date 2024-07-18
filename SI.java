package simpleinterest;

public class SI {
	public static void main(String[] args) {
		int principal=30000;
		float rate=3.5f;
		int time=3;
		double simpleIntrest= (principal * rate * time)/100;
		System.out.println("SimpleIntrest:"+simpleIntrest);

}
}