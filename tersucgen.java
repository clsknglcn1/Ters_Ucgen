import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = num.nextInt();

    for (int i= sayi;i>=1; i--){
        for (int a=0; a<sayi-i;a++){
            System.out.print(" ");
        }
        for (int b=2*i-1;b>0; b--){
            System.out.print("*");

        }
        System.out.println();

    }
    }
}
