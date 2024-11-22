public class Example {

	public static void main(String[] args) {
		long n = 9999999990L;
		float f = 234.333F;
		
	}

}

class Math {
    public int add(int x, int y) {
        return x+y;
    }
    public int subtract(int x, int y) {
        return x-y;
    }
    public double multiply(int x, int y) {
        return x*y;
    }
    public double divide(int x, int y) {
        return x/y;
    }
}

class Working extends Math {
    Working() {
        System.out.println(divide(36,5));
    }

    public static void main(String[] args) {
        new Working();
    }
}
