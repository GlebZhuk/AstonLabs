public class MathFunc {
/*    int calls;

    public int getCalls() {
        return calls;
    }

    public long factorial(int number) {
        calls++;
        if (number < 0) throw new IllegalArgumentException();
        long result = 1;
        if (number > 1) {
            for (int i = 1; i < number; i++) result = result * i;
        }
        return result;
    }

    public long plus(int num1, int num2) {
        calls++;
        return num1 + num2;
    }*/

    public long getFactorial(int f) {
        if (f < 0) {
            System.out.println("IllegalArgumentException");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Factorial: " + result);
        return result;
    }
}
