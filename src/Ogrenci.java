import java.util.Scanner;
class Ogrenci  {

    public static Ogrenci [] ogr;

    private String name;
    private int no ;
    Ogrenci(){
        this.no = no;
        this.name = name;
    }

    Ogrenci(String setName , int setNo){
        this.no = setNo;
        this.name = setName;

    }

    public static String toString(String name, int no){
        return("İsim : " + name +"\n No :" + no );
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public static String  DataOgrenci(Ogrenci ogr []) {
        Scanner scn = new Scanner(System.in);
        String message = null;
        for (int i = 0; i < ogr.length; i++) {
            ogr[i] = new Ogrenci();
            System.out.println("İsim gir : ");
            ogr[i].setName(scn.next());
            System.out.println("No giriniz : ");
            ogr[i].setNo(scn.nextInt());

            message = (Ogrenci.toString(ogr[i].getName(), ogr[i].getNo()));

        }
        return message;
    }
}
