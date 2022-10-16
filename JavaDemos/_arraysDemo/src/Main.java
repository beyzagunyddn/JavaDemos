public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Can";
        String ogrenci2 = "Emre";
        String ogrenci3 = "Oğuz";
        String ogrenci4 = "Beyza";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------");

        String [] ogrenciler = new String[4]; // [] içerisindeki sayı kaç elemandan oluşacağını gösterir.

        ogrenciler[0]="Can";
        ogrenciler[1]="Emre";
        ogrenciler[2]="Oğuz";
        ogrenciler[3]="Beyza";

        for (int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
