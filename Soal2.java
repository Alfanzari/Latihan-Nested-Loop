import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran papan catur: ");
        int ukuran = input.nextInt();

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println(); 
        }
    }
}