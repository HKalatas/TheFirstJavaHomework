import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üs Alınacak Sayı :");
        int n= input.nextInt();
        int result = 1;
        System.out.print("Üs Olacak Sayı :");
        int k = input.nextInt();
       // while ile yapılır ise
        // int i = 1;
        //while (i<= k) {
        //    result *= n;
         //   i++;
       // }
        for (int i = 1; i <=k ; i++) {
            result *= n;
        }
        System.out.println("Sonuç : " + result);
    }
}