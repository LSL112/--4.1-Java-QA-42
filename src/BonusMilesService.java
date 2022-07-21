public class BonusMilesService {
    public int calculate (int cost) {
        int oneMilesPrice = 20;
        int mile = cost / oneMilesPrice;
        return mile;
    }
}
