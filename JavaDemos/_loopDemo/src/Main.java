public class Main {
    public static void main(String[] args) {
        //for

        for ( int i = 0; i < 10; i+=2) {
        System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        //while
        //sonsuz kere döndürür bu yüzden süslü parantez
        //içerisine i'yi nasıl arttırmak istediğimizi yazmalıyız.

        int i = 1;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        //doWhile
        //şartlar sağlanmasa bile bir kere çalışır.

        int j = 2;
        do {
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While döngüsü bitti.");


    }
}
