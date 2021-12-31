import java.util.Scanner;

public class main {
    public static Ogrenci [] ogr;
    public static Urunler [] uruns;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sınıftaki Ogrenci sayısını giriniz :  ");
        int n = scn.nextInt();
        ogr = new Ogrenci[n];
        System.out.println();
        System.out.println("Kantindeki Urun miktarını girin : ");
        int c = scn.nextInt();
        uruns = new Urunler[c];
        for(int i= 0 ; i < c ; i++){ // HATA BURADA STACK OVER FLOW
            System.out.println(Urunler.UrunData(uruns));
        }


        for(int i = 0 ; i < n ; i++) {// HATA BURADA STACK OVER FLOW
            System.out.println(Ogrenci.DataOgrenci(ogr));
        }
        /* Constructor kullanımı :
        Urunler urun1 = new Urunler("Haribo", 3);
        Ogrenci ogrenci1 = new Ogrenci("Celine" , 20, urun1);
        Urunler urun2 = new Urunler("Ulker" , 5);
        */


    }
}
