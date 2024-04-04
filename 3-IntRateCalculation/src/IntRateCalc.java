import java.util.Scanner;

public class IntRateCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para Miktarını Giriniz ");
        int moneyAmount = scanner.nextInt();
        System.out.println("Yıllık Faiz Oranını Giriniz");
        int intRate = scanner.nextInt();
        System.out.println("Yıllık Süreyi giriniz");
        int duration = scanner.nextInt();
        int intAmount = (moneyAmount * intRate) * duration;
        System.out.println(intAmount);
    }
}
