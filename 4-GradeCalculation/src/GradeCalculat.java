import java.util.Scanner;

public class GradeCalculat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int note = scanner.nextInt();

        if (100 >= note && 95 <= note) {
            System.out.println("Dereceniz A  = 4.00 ");
        } else if (94 >= note && 90 <= note) {
            System.out.println("Dereceniz A-  = 3.70");
        } else if (89 >= note && 85 <= note) {
            System.out.println("Dereceniz B+  = 3.30");
        } else if (84 >= note && 80 <= note) {
            System.out.println("Dereceniz B  = 3.00");
        } else if (79 >= note && 75 <= note) {
            System.out.println("Dereceniz B-  = 2.70");
        } else if (74 >= note && 70 <= note) {
            System.out.println("Dereceniz C+  = 2.30");
        } else if (69 >= note && 65 <= note) {
            System.out.println("Dereceniz C  = 2.00");
        } else if (64 >= note && 60 <= note) {
            System.out.println("Dereceniz C-  = 1.70");
        } else if (59 >= note && 55 <= note) {
            System.out.println("Dereceniz D+  = 1.30");
        } else if (54 >= note && 50 <= note) {
            System.out.println("Dereceniz D  = 1.00");
        } else if (49 >= note && 0 <= note) {
            System.out.println("Dereceniz F  = 0.00");
        } else {
            System.out.println("Yanlış Sayı Girişi Yaptınız");
        }
    }
}





