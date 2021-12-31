 import java.util.Scanner;

class Urunler  {
     private String urunAd;
     private int urunAdet;
     static Scanner scn = new Scanner(System.in);
    static Urunler [] uruns ;
     public Urunler() {
         this.urunAd = urunAd;
         this.urunAdet = urunAdet;
     }

     Urunler(String urunAd, int urunAdet) {
         this.urunAdet = urunAdet;
         this.urunAd = urunAd;
     }

     public void setUrunAd(String urunAd) {
         this.urunAd = urunAd;
     }

     public String getUrunAd() {
         return urunAd;
     }

     public void setUrunAdet(int urunAdet) {
         this.urunAdet = urunAdet;
     }

     public int getUrunAdet() {
         return urunAdet;
     }

     public static String toString(String urunAd , int urunAdet){
         return("Urun adı : "  + urunAd + "\n Urun adedi : " + urunAdet);

     }
     public static String  UrunData(Urunler [] urun ) {
         String message = null;
         for (int i = 0; i < urun.length; i++) {
             urun[i] = new Urunler();
             System.out.println("Urun ismi gir : ");
             urun[i].setUrunAd(scn.next());
             System.out.println("Urun adet gir : ");
             urun[i].setUrunAdet(scn.nextInt());
             message = urun[i].getUrunAd() + urun[i].getUrunAdet();

         }
    return message;
     }

}
