import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

       /* System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4)); //charAt istediğin karakteri almak istediğinde kullanırsın.
        System.out.println(mesaj.concat(" Yaşasın!")); //concat birleştirmek anlamına gelir.
        System.out.println(mesaj.startsWith("B")); //startWith boolean bir fonksiyondur.
        System.out.println(mesaj.endsWith(".")); // endsWith boolean bir fonkiyondur.

        char [] karakterler = new char [5];
        mesaj.getChars(0,5,karakterler,0); //Bir metni istediğin yere kadar yazdırmak istediğinde bu fonksiyonu kullanırsın.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a")); //Metinde a'yı kaçıncı sırada olduğunu bulur.
        System.out.println(mesaj.lastIndexOf("a"));*/ // Metinin sonundan başlayarak a'nın kaçıncı sırada olduğunu bulur.

        String yeniMesaj = mesaj.replace(' ' , '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); // substring istediğin karakterleri yazdırmak istediğinde kullanılan bir fonksiyondur.

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        } //split'i metindeki kelimeleri alt alta ve ayrı ayrı yazdırmak istediğinde kullanıyorsun.

        System.out.println(mesaj.toLowerCase()); //Metindeki bütün harfleri küçük harf yazdırmak istediğinde kullanırsın.
        System.out.println(mesaj.toUpperCase()); //Metindeki bütün harfleri büyük harf yazdırmak istediğinde kullanırsın.
        System.out.println(mesaj.trim()); // trim'i değişken tanımlarken yanlışlıkla veya bilerek fazla koyduğun boşlukları sildirmek için kullanırsın.


    }
}
