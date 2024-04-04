import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("1. Sayı : ");
            int a = scan.nextInt();
            System.out.print("2. Sayı : ");
            int b = scan.nextInt();

            System.out.println("işlem seçiniz : ");
            System.out.println("1 - Toplama");
            System.out.println("2 - Çıkarma");
            System.out.println("3 - Çarpma");
            System.out.println("4 - Bölme");
            System.out.print("İşleminiz : ");
            int select = scan.nextInt();
//        if (select == 1) {
//            System.out.println("Toplam : " + (a + b));
//        } else if (select == 2) {
//            System.out.println("Çıkarma : " + (a - b));
//        } else if (select == 3) {
//            System.out.println("Çarpma : " + (a * b));
//        } else if (select == 4) {
//            if (b == 0) {
//                System.out.println("Bölen Sayısı sıfır olamaz");
//            } else {
//                System.out.println("Bölme : " + (a / b));
//
//            }
//        }
            switch (select) {
                case 1:
                    System.out.println("Toplam : " + (a + b));
                    break;
                case 2:
                    System.out.println("Çıkarma : " + (a - b));
                    break;
                case 3:
                    System.out.println("Çarpma : " + (a * b));
                    break;
                case 4: {
                    if (b == 0) {
                        System.out.println("Bölen Sayısı sıfır olamaz");
                        break;
                    } else {
                        System.out.println("Bölme : " + (a / b));
                        break;
                    }
                }
            }
        }
    }






