import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть п'ять окремих слів:");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        String word4 = sc.next();
        String word5 = sc.next();
        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        System.out.println("Результат: " + sentence);
    }
}
// 2
import java.util.Scanner;

    public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть п'ять слів:");
            String word1 = sc.next();
            String word2 = sc.next();
            String word3 = sc.next();
            String word4 = sc.next();
            String word5 = sc.next();
            System.out.println("Перші літери слів: " + word1.substring(0, 1) + word2.substring(0, 1) + word3.substring(0, 1) + word4.substring(0, 1) + word5.substring(0, 1));
        }
    }
// 3
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть три дробові числа:");
        double num1, num2, num3;
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (sc.hasNextDouble()) {
            num2 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (sc.hasNextDouble()) {
            num3 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " є найбільшим з введених чисел.");
        } else if (num2 > num3) {
            System.out.println(num2 + " є найбільшим з введених чисел.");
        } else {
            System.out.println(num3 + " є найбільшим з введених чисел.");
        }
    }
}
// 4

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }
    }
}
// 5
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший рядок: ");
        String str1 = scanner.nextLine();

        System.out.print("Введіть другий рядок: ");
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println("Перший рядок є більшим за кількістю символів.");
        } else if (str2.length() > str1.length()) {
            System.out.println("Другий рядок є більшим за кількістю символів.");
        } else {
            System.out.println("Рядки мають однакову довжину.");
        }
    }
}
