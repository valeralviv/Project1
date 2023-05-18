public class Cycle {
    public static void main(String[] args) {
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        //while
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }

        //do-while
        int k = 500;
        do {
            System.out.print(k + " ");
            k += 10;
        } while (k <= 650);
    }
}

public class Equation  {
    public static void main(String[] args) {

        int a = 2;
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }
    }
}

public class Numbers {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
