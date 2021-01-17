public class Main {
    public static void main(String[] args) {
        int price = 3_250;
        int amount = 3;
        int criterion = 20;

                // расчитываем бонус
        int bonus = price * amount / criterion ;
        System.out.println(bonus);
    }
}
