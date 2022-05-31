
public class Calculator {
	public int add(int a, int b) {
		int total = a+b;
		if(total >=0 && a< 10000 && a>0 && b<10000 && b>0) {
			total =a+b;
		}
		return total;
	}

	public int subtract(int a, int b) {
		
		int total = a-b;
		if(total >=0 && a< 10000 && a>0 && b<10000 && b>0) {
			total =a-b;
		}
		return total;
	}

	public int multiple(int a, int b) {
		int total = a*b;
		if(total >=0 && a< 10000 && a>0 && b<10000 && b>0) {
			total =a*b;
		}
		return total;
	}

	public int divide(int a, int b) {
		int total = a/b;
		if (b == 0) {
			if(total >=0 && a< 10000 && a>0 && b<10000 && b>0) {
				total =a/b;
			}
			new IllegalArgumentException();

		}
		
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return total;
	}
}
