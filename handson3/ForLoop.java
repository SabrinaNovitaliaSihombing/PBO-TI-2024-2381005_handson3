package handson3;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if ( i >= 15 ) {
                break;
            }
            if (i % 3 != 20) {
                System.out.println(i);
            }
        }
    }
}

