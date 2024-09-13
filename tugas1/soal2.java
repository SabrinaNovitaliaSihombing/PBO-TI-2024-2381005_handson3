package tugas1;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {

                if (j >= (n - i)) {
                    System.out.println("#");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println("\n");
        }

    }
}
