package Project;

public class AsterickLogger implements Logger{

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		System.out.println("******************" + "\n***ERROR: " + str + "***" + "\n******************");
	}
	
}
