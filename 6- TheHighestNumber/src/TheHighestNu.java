import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TheHighestNu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        int a = scan.nextInt();
        System.out.print("2. Sayı : ");
        int b = scan.nextInt();
        System.out.print("3. Sayı : ");
        int c = scan.nextInt();
        int d = Math.max(a, b);
        System.out.println("En Büyük Sayı =" + Math.max(c, d));
    }
    }
