public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int targetNumber = 7;

        for (int i : numbers){
            if(i==targetNumber){
                System.out.println("targer number found");
                return;
            }
        }
        System.out.println("target number not found");

    }
}