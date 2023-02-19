import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("üst alınacak sayıyı girin: ");
        int say1= input.nextInt();
        System.out.println("üst sayısını girin: ");
        int say2 = input.nextInt();
        int sonuc=1;

        for (int i=1;i<=say2;i++){

            sonuc*=say1;
            System.out.println(sonuc);
        }
        System.out.println("Sonuç: "+sonuc);
    }
}