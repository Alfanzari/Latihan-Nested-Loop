public class Soal3 {
    public static void main(String[] args) {
        int baris = 5; 

        for (int i = baris; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * baris - (2 * i - 1); k++) {  
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}