import java.util.Scanner;
public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt(); sc.nextLine();

            if(penonton[baris - 1][kolom - 1] != null){
                System.out.println("Kursi yang Anda pilih sudah terisi, pilih kursi lain.");
            } else {
                penonton[baris-1][kolom-1] = nama;
                // break;  // Keluar dari loop jika kursi berhasil dipesan
            }
            
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }  
        
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) { 
                    System.out.println(penonton[i][j]);
                }else{
                    System.out.println("***");
                }
            }
        }
    }
}
