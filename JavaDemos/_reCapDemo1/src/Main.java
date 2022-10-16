public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 3;

        if (number1 > number2 && number1 > number3){
            System.out.println("Big number is the Number1");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Big number is the Number2 ");
        } else {
            System.out.println("Biggest number is the Number3");
        }
    }
}
