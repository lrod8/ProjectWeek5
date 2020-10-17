package Project;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("");
	}

	@Override
	public void error(String str) {
		System.out.print("ERROR: ");
		for (int i = 0; i < str.length(); i++ ) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("");
	}

}
