public class Main {
    public static void main(String[] args) {
        double [] myList = {1.1,1.2,1.3,1.4};
        double total = 0;
        double max = myList[0];
        for (double numbers:myList){
            if (max<numbers){
                max = numbers;
            }
            total = total + numbers;
            System.out.println(numbers);
        }
        System.out.println("Total : " + total);
        System.out.println("En büyük : " + max);
    }
}
