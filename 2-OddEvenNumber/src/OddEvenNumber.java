import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Sayı Çifttir");
        } else {
            System.out.println("Sayı Tektir");
        }
    }
}
