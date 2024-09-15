import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        int year = 100;
        int len =5;
        int initialValue = 8;
        String str = "Aston";
        System.out.println(method1(a, b));
        method2(a);
        System.out.println(method3(a));
        method4(a, str);
        System.out.println(method5(year));
        mass();
        massLength();
        massSix();
        doubleArray();

        System.out.println(Arrays.toString(method10(len, initialValue)));
    }

    public static boolean method1(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void method2(int a) {
        if (a >= 0) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

    public static boolean method3(int a) {
        return a >= 0;
    }

    public static void method4(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean method5(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

    public static void mass() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void massLength() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length + 1; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void massSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newArr = Arrays.stream(arr).map(n -> {
                    if (n < 6) return n * 2;
                    else return n;
                }
        ).toArray();
        System.out.println(Arrays.toString(newArr));
    }

    public static void doubleArray() {
        int n = 5;
        int[][] doubleArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || n - i - 1 == j) doubleArr[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(doubleArr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] method10(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

}
