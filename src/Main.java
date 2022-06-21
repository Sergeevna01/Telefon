public class Main {
    public static void main(String[] args) {
        int x, y, s, f;
        x = 1200;
        y = 100;

        if (x >= 1000) {
            s = x / y;
            f = s + x;
            System.out.println("Сумма счета равна: " + f + " Начислено бонусов: " + s);
        } else {
          System.out.println("Сумма счета равна: " + x + " Начислено бонусов: 0");
        }
    }
}
