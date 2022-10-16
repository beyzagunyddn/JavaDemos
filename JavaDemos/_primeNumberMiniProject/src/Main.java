import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        boolean isPrime = true;

        if (number<2){
            System.out.println("Sayı asal değildir.");
            return;
        }


        for (int i = 2; i <number ; i++) {
            if (number % i == 0){
                isPrime = false;
            }

        }
        if(isPrime ){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }



    }
}
