public class Main {
    public static void main(String[] args) {
        long price = 3_231;
        long criterion = 20;
                // расчитываем бонус за 1 билет
        long bonus = price / criterion;
        System.out.println(bonus);
    }
}
