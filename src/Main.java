public class Main {
    public static void main(String[] args) {
        int price = 3_350_000;
        int amount = 3;
        int criterion = 2_000;

                // расчитываем бонус
        int bonus = price * amount / criterion ;
        System.out.println(bonus);
    }
}
