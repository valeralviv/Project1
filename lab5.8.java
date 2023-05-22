public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int n = 70;
        if (n > 50 && n <= 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");

        }
        System.out.println("\n");
        System.out.println("Завдання 2");
        int n1 = 656;
        int a = n1 / 100;
        int b = n1 / 10 % 10;
        int c = n1 % 10;
        System.out.println(n1);

        if ((a > b) & (a > c)) {
            System.out.println("найбільше число " + a);
        }
        else if((b > a) & (b > c)) {
            System.out.println("найбільше число " + b);
        }
        else if((c > a) & (c > b)) {
            System.out.println("найбільше число " + c);
        }
        else if((c == a) & (a == b)) {
            System.out.println("всі числа рівні");
        }
        else if((a == b) || (b == c)) {
            System.out.println("найбільше число " + b);
        }
        else if((a == b) || (a == c)) {
            System.out.println("найбільше число " + a);
        }
        System.out.println("\n");

        System.out.println("Завдання 3");

        int g = 1;
        int h = 2;
        if ((g == 2) & (h == 2)){
            System.out.println("Ви залишились на " + g + "поверху");
        }
        else if (h == 2){
            if (g < h){
                h += 1;
                System.out.println("Ви піднялися на " + h + "поверх");
            }
            else if(g > h){
                h -= 1;
                System.out.println("Ви спустилися на " + h + "поверх");
            }
        }
        else if (h != 2) {
            if (g < h){
                h += 1;
                System.out.println("Ви піднялися на " + h + "поверх");
            }
            else if(g > h){
                System.out.println("Ви спустилися на " + h + "поверх");
            }
        }
        System.out.println("\n");
        System.out.println("Завдання 4");

        String yes_no ="Так";
        switch (yes_no){
            case "Так":
                System.out.println("Я погоджуюсь");
                break;
            case "OK":
                System.out.println("Я погоджуюсь");
                break;
            case "Yes":
                System.out.println("Я погоджуюсь");
                break;
            case "+":
                System.out.println("Я погоджуюсь");
                break;
            case "Y":
                System.out.println("Я погоджуюсь");
                break;
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "Hi":
                System.out.println("Я відмовляюсь");
                break;
            case "NO":
                System.out.println("Я відмовляюсь");
                break;
            case "N":
                System.out.println("Я відмовляюсь");
                break;
            case "-":
                System.out.println("Я відмовляюсь");
                break;
            case "No":
                System.out.println("Я відмовляюсь");
                break;

        }
    }
}
