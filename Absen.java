import java.util.Scanner;

public class Absen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[10];
        int[] noAbsen = new int[10];
        int count = 0;
        
        // Meminta input nama dan nomor absen dari user
        for(int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan Nama Anda (atau ketik 'selesai' untuk keluar): ");
            String namaSiswa = input.nextLine();
            
            if(namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Masukkan Nomor Absen Anda: ");
            int absenSiswa = input.nextInt();
            input.nextLine(); // untuk membersihkan scanner
            
            // Menambahkan nama dan nomor absen ke array
            nama[count] = namaSiswa;
            noAbsen[count] = absenSiswa;
            count++;
        }
        
        // Menampilkan daftar absen yang telah dimasukkan
        System.out.println("\nDaftar Absen:");
        for(int i = 0; i < count; i++) {
            System.out.println("No. Absen " + noAbsen[i] + ": " + nama[i]);
        }
    }
}
