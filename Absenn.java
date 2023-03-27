import java.util.Scanner;

public class Absenn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat variabel untuk menyimpan data mahasiswa
        String[] nama = new String[100];
        String[] nim = new String[100];
        String[] fakultas = new String[100];
        String[] jurusan = new String[100];
        String[] kotaAsal = new String[100];
        String[] alamat = new String[100];

        int jumlahMahasiswa = 0; // Menghitung jumlah mahasiswa yang diinput

        while (true) {
            System.out.println("## Program Java Biodata Mahasiswa ##");
            System.out.println("========================================");
            System.out.print("Nama mahasiswa: ");
            nama[jumlahMahasiswa] = input.nextLine();

            System.out.print("NIM: ");
            nim[jumlahMahasiswa] = input.nextLine();

            System.out.print("Fakultas: ");
            fakultas[jumlahMahasiswa] = input.nextLine();

            System.out.print("Jurusan: ");
            jurusan[jumlahMahasiswa] = input.nextLine();

            System.out.print("Kota Asal: ");
            kotaAsal[jumlahMahasiswa] = input.nextLine();

            System.out.print("Alamat: ");
            alamat[jumlahMahasiswa] = input.nextLine();

            System.out.print("Apakah Anda ingin memasukkan data mahasiswa lagi? (y/n) ");
            String lagi = input.nextLine();

            if (lagi.equalsIgnoreCase("n")) {
                break; // Keluar dari loop jika pengguna tidak ingin memasukkan data lagi
            }

            jumlahMahasiswa++; // Menambah jumlah mahasiswa setelah setiap input
        }

        System.out.println();
        System.out.println("# Data Mahasiswa #");
        System.out.println("==================");

        // Mencetak tabel data mahasiswa
        System.out.printf("%-3s %-20s %-10s %-25s %-20s %-50s\n", "No", "Nama", "NIM", "Fakultas", "Jurusan", "Alamat");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <= jumlahMahasiswa; i++) {
            System.out.printf("%-3d %-20s %-10s %-25s %-20s %-50s\n", i + 1, nama[i], nim[i], fakultas[i], jurusan[i],
                    alamat[i]);
        }
    }
}
