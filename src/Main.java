public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}















//        long price = 3_231;
//        long criterion = 20;
//                // расчитываем бонус за 1 билет
//        long bonus = price / criterion;
//        System.out.println(bonus);

