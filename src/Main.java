public class Main {
    public static void main(String[] args) {
        int money, divider, bonus, score;
        money = 1200;
        divider = 100;

        if (money >= 1000) {
            bonus = money / divider;
            score = bonus + money;
            System.out.println("Сумма счета равна: " + score + " Начислено бонусов: " + bonus);
        } else {
            System.out.println("Сумма счета равна: " + money + " Начислено бонусов: 0");
        }
    }
}
