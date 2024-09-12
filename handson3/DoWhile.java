package handson3;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 1;
        do {
            if (counter > 15) {
                break;
            }
            if (counter % 3 != 0) {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= 20);
    }
}