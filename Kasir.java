import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaBarang = new String[10];
        int[] hargaBarang = new int[10];
        int[] jumlahBarang = new int[10];
        int totalHarga = 0;

        // Meminta input nama, harga, dan jumlah barang dari user
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("Masukkan Nama Barang (atau ketik 'selesai' untuk keluar): ");
            String nama = input.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan Harga Barang: ");
            int harga = input.nextInt();
            System.out.print("Masukkan Jumlah Barang: ");
            int jumlah = input.nextInt();
            input.nextLine(); // untuk membersihkan scanner

            // Menambahkan nama, harga, dan jumlah barang ke array
            namaBarang[i] = nama;
            hargaBarang[i] = harga;
            jumlahBarang[i] = jumlah;

            // Menambahkan total harga
            totalHarga += harga * jumlah;
        }

        // Menampilkan daftar barang yang telah dimasukkan beserta total harga dalam
        // bentuk tabel
        System.out.println("\n---------------------------------------");
        System.out.println("| Nama Barang | Harga | Jumlah | Total |");
        System.out.println("---------------------------------------");
        for (int i = 0; i < namaBarang.length; i++) {
            if (namaBarang[i] == null) {
                break;
            }
            int total = hargaBarang[i] * jumlahBarang[i];
            System.out.printf("| %-11s | %5d | %6d | %5d |\n", namaBarang[i], hargaBarang[i], jumlahBarang[i], total);
        }
        System.out.println("---------------------------------------");
        System.out.printf("| Total Harga                             | %5d |\n", totalHarga);
        System.out.println("---------------------------------------");
    }
}
