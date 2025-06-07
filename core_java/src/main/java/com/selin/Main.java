package com.selin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* // JA-2 Java'da Değişkenler ve Veri Tipleri
        int sayi=2;
        String mesaj="Merhaba";
        double a=2.745896;
        float b= 4.598654F;
        char c='f';
        boolean e=true;

        final String m="Bebka Eğitim";

        System.out.println(sayi);
        System.out.println(mesaj);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(m);
         */

        /* // JA-3 Kullanıcıdan Veri Alma
        System.out.println("İsminizi giriniz: ");
        String isim=sc.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        int yas=sc.nextInt();

        System.out.println("İsim: "+isim+"  Yaş: "+yas);
         */

        /*  // JA-4 Aritmetik İşlemler
        System.out.println("Birinci sayıyı giriniz:");
        float sayi1=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        float sayi2=sc.nextInt();

        float topla=sayi1+sayi2;
        float cikar=sayi1-sayi2;
        float carp=sayi1*sayi2;
        float bol=sayi1/sayi2;

        System.out.println(sayi1+" + "+sayi2+" = "+topla);
        System.out.println(sayi1+" - "+sayi2+" = "+cikar);
        System.out.println(sayi1+" * "+sayi2+" = "+carp);
        System.out.println(sayi1+" / "+sayi2+" = "+bol);
         */

        /* // JA-5 Sayının Pozitif, Negatif veya Sıfır Olduğunu Kontrol Et
        System.out.println("Bir sayi giriniz:");
        int sayi1=sc.nextInt();

        if(sayi1>0)
            System.out.println("Sayı pozitiftir");
        else if(sayi1<0)
            System.out.println("Sayı negatiftir");
        else
            System.out.println("Sayı sıfırdır");
         */

        /* // JA-6 Sayının Tek mi Çift mi Olduğunu Bul
        System.out.println("Bir sayi giriniz:");
        int sayi1=sc.nextInt();

        if(sayi1>0) {
            if (sayi1 % 2 == 0)
                System.out.println("Girilen sayı çifttir");
            else
                System.out.println("Girilen sayi tektir");

        }
        else
            System.out.println("Girilen sayı negatiftir.\n Lütfen pozitif bir sayı giriniz!");
         */

        /*  // JA-7 Not Değerlendirme (Switch-Case Kullanımı)
        System.out.println("Notunuzu giriniz");
        int not=sc.nextInt();

        if(not<0||not>100){
            System.out.println("Geçersiz not!\n Lütfen 0-100 arası bir sayı giriniz.");
            return;
        }

        switch (not/10) {
            case 10:
            case 9:
                System.out.println("Harf notunuz: A");
                break;
            case 8:
                System.out.println("Harf notunuz: B");
                break;
            case 7:
                System.out.println("Harf notunuz: C");
                break;
            case 6:
                System.out.println("Harf notunuz: D");
                break;
            default:
                System.out.println("Harf notunuz: F");
                break;
        }
         */

        /*  // JA-8 For Döngüsü ile Sayıları Yazdır
        for(int i=1; i<11;i++)
            System.out.println(i);
         */

        /* // JA-9 While Döngüsü ile Geri Sayım
        int sayi=10;
        while(sayi!=0){
            System.out.println(sayi);
            sayi--;
        }
         */

        /*  // JA-10 Dizi Oluştur ve Elemanları Yazdır
        int dizi[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
            System.out.println(dizi[i]);
         */

        /*  // JA-11 En Büyük Sayıyı Bul
        System.out.println("Birinci sayıyı giriniz: ");
        int a=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b=sc.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int c=sc.nextInt();

        int enbuyuk=a;

        if(b>enbuyuk) {
            System.out.println("En büyük sayı: " + b);
            return;
        }
        if(c>enbuyuk) {
            System.out.println("En büyük sayı: " + c);
            return;
        }
        System.out.println("En büyük sayı: " + enbuyuk);
         */

        /*  // JA-12 1’den N’e Kadar Olan Sayıların Toplamını Hesapla
        System.out.println("~~ 1'den N'e kadar toplama işlemi ~~");
        System.out.println("N sayısını giriniz: ");
        int sayi = sc.nextInt();

        if(sayi<0){
            System.out.println("Lütfen pozitif bir sayı giriniz!");
            return ;
        }
        int toplam=0;

        for(int i=1;i<=sayi;i++)
            toplam+=i;
        System.out.println(toplam);
         */

    }
}