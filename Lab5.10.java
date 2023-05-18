public class Main {
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

public class Main2  {
    public static void main(String[] args) {

        int a = 2;
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        int num = 10;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

public class Main5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i / 10 == j % 10 && i % 10 == j / 10) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
