public class BonusMilesService {
    public int calculate(int price) {
           int criterion = 20;
        // расчитываем бонус за 1 билет
        int bonus = price / criterion;
        return bonus;
    }
   }
