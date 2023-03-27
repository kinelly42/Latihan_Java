
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    // Mendeklarasikan variabel data sebagai ArrayList yang berisi String
    static ArrayList<String> data = new ArrayList<String>();
    // Mendeklarasikan variabel scanner sebagai Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Menampilkan menu
            System.out.println("Aplikasi CRUD Sederhana");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            // Membaca input dari pengguna
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanData();
                    break;
                case 2:
                    tambahData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }
    }

    static void tampilkanData() {
        if (data.isEmpty()) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Data:");
            // Menampilkan data
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
        }
    }

    static void tambahData() {
        // Membaca input dari pengguna
        System.out.print("Masukkan data: ");
        String item = scanner.next();
        // Menambahkan data ke ArrayList
        data.add(item);
        System.out.println("Data berhasil ditambahkan");
    }

    static void ubahData() {
        tampilkanData();
        // Membaca input dari pengguna
        System.out.print("Pilih nomor data yang ingin diubah: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < data.size()) {
            // Membaca input dari pengguna
            System.out.print("Masukkan data baru: ");
            String item = scanner.next();
            // Mengubah data di ArrayList
            data.set(index, item);
            System.out.println("Data berhasil diubah");
        } else {
            System.out.println("Nomor data tidak tersedia");
        }
    }

    static void hapusData() {
        tampilkanData();
        // Membaca input dari pengguna
        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < data.size()) {
            // Menghapus data dari ArrayList
            data.remove(index);
            System.out.println("Data berhasil dihapus");
        } else {
            System.out.println("Nomor data tidak tersedia");
        }
    }
}
