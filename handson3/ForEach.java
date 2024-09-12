package handson3;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int num : numbers) {
            if (num >= 15) {
                break;
            }
            if (num % 3 != 0) {
                System.out.println(num);
            }
        }
    }
}