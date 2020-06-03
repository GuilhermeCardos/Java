package run;

public class runTime {

	public static void main(String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		
		r.exec("shutdown -r");

	}

}
