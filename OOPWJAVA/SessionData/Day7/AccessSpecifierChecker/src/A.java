import com.acts.B;

public class A {
	private String aPri;
	protected String aPro;
	String aDef;
	public String aPub;
	
	public void aMethod() {
		B b = new B();
		System.out.println(b.bPub);
		System.out.println(b.bPri);
		System.out.println(b.bPro);
		System.out.println(b.bDef);
	}
}
