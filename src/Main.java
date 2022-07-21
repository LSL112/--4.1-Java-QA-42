public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int mile = service.calculate(price);
        System.out.println("Начислено " + mile + " миль.");
    }
}
