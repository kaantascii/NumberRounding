import java.util.Scanner;

public class NumbersRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //kullanıcıya girdi istedim.
        System.out.println("Sayıyı Giriniz: ");
        double sayi = input.nextDouble();

        //int yapmamdaki sebep istenilen çıktı ondalıklı değil.
        int asagiYuvarlama = (int) Math.floor(sayi);
        int yukariYuvarlama = (int) Math.ceil(sayi);
        int enYakinTamSayi = (int) Math.round(sayi);

        // Sonuçları ekrana yazdırdım.
        System.out.println("Aşağı Yuvarlama: " + asagiYuvarlama);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarlama);
        System.out.println("En Yakın Tam Sayı: " + enYakinTamSayi);
    }

}
