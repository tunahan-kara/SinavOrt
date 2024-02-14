import java.util.Scanner;

public class SinavOrt {
    public static void main(String[] args) {
        System.out.println("Lütfen Sınav Adedi Giriniz ");
        System.out.println("Kaç sınavınız var?");
        Scanner veri = new Scanner(System.in);
        int sinavSayisi = veri.nextInt();

        int[] sinavlar = new int[sinavSayisi];
        int[] agirliklar = new int[sinavSayisi];

// Sınav notlarını ve ağırlıklarını kullanıcıdan al
        for (int i = 0; i < sinavSayisi; i++) {
            System.out.println("Sınav " + (i + 1) + " notunu giriniz:");
            sinavlar[i] = veri.nextInt();

            System.out.println("Sınav " + (i + 1) + " ağırlığını giriniz:");
            agirliklar[i] = veri.nextInt();
        }

        int toplamNot = 0;
        int toplamAgirlik = 0;

// Her sınav notunu ağırlığıyla çarpıp toplamNot'a ekleyin
        for (int i = 0; i < sinavSayisi; i++) {
            toplamNot += sinavlar[i] * agirliklar[i];
            toplamAgirlik += agirliklar[i];
            if (toplamAgirlik > 100) {
                System.out.println("Hata: Ağırlıkların toplamı 100'den büyük olamaz!");
                return; // Programı durdur
        }

// Genel ortalama hesaplanıyor
        double genelOrtalama = (double) toplamNot / toplamAgirlik;

        System.out.println("Genel ortalama: " + genelOrtalama);
    }}}