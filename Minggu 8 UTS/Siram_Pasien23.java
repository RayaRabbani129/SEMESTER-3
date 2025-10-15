import java.text.SimpleDateFormat;
import java.util.*;

public class Siram_Pasien23 {
    private static List<Pasien23> daftarPasien = new ArrayList<>();
    private static List<Dokter23> daftarDokter = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU PROGRAM SIRAM PASIEN ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Update Data Pasien");
            System.out.println("3. Tampilkan Daftar Pasien");
            System.out.println("4. Tambah Dokter");
            System.out.println("5. Update Data Dokter");
            System.out.println("6. Tampilkan Daftar Dokter");
            System.out.println("7. Tambah Riwayat Pemeriksaan (Rekam Medik)");
            System.out.println("8. Tampilkan Riwayat Pemeriksaan (Rekam Medik)");
            System.out.println("9. Selesai");
            System.out.print("Pilih Menu Nomor: ");

            // Validasi input menu
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid!");
                pilihan = 0;
                continue;
            }

            switch (pilihan) {
                case 1 -> tambahPasien();
                case 2 -> updatePasien();
                case 3 -> tampilkanPasien();
                case 4 -> tambahDokter();
                case 5 -> updateDokter();
                case 6 -> tampilkanDokter();
                case 7 -> tambahRiwayat();
                case 8 -> tampilkanRiwayat();
                case 9 -> System.out.println("Program selesai. Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 9);
    }

    // -------------------- VALIDASI INPUT --------------------
    // penerapan validasi tipe data menggunakan metode try catch
    private static int inputInt(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Coba lagi!");
            }
        }
    }

    private static String inputString(String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input tidak boleh kosong. Coba lagi!");
        }
    }

    private static Date inputTanggal(String pesan) {
        while (true) {
            try {
                System.out.print(pesan + " (dd/MM/yyyy): ");
                return new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Format tanggal salah! Gunakan format dd/MM/yyyy (contoh: 15/10/2025)");
            }
        }
    }

    // -------------------- TAMBAH PASIEN --------------------
    private static void tambahPasien() {
        int id = inputInt("ID Pasien\t\t: ");
        String nama = inputString("Nama\t\t\t: ");
        boolean jk = inputString("Jenis Kelamin (L/P)\t: ").equalsIgnoreCase("L");
        String alamat = inputString("Alamat\t\t\t: ");
        String telp = inputString("No Telp\t\t\t: ");

        Pasien23 pasien = new Pasien23(id, nama, jk, alamat, telp);
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan!");
    }

    private static void updatePasien() {
        int id = inputInt("Masukkan ID Pasien yang akan diupdate: ");
        Pasien23 pasien = daftarPasien.stream().filter(p -> p.getId23() == id).findFirst().orElse(null);

        if (pasien == null) {
            System.out.println("Pasien tidak ditemukan!");
            return;
        }

        System.out.println("=== Update Data Pasien ===");
        pasien.setNama23(inputString("Nama baru\t\t: "));
        pasien.setJenisKelamin23(inputString("Jenis Kelamin (L/P)\t: ").equalsIgnoreCase("L"));
        pasien.setAlamat23(inputString("Alamat baru\t\t: "));
        pasien.setNoTelp23(inputString("No Telp baru\t\t: "));
        System.out.println("Data pasien berhasil diperbarui!");
    }

    private static void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
        } else {
            for (Pasien23 p : daftarPasien) {
                p.tampilkanInfo23();
            }
        }
    }

    // -------------------- TAMBAH DOKTER --------------------
    private static void tambahDokter() {
        int id = inputInt("ID Dokter\t\t: ");
        String nama = inputString("Nama\t\t\t: ");
        boolean jk = inputString("Jenis Kelamin (L/P)\t: ").equalsIgnoreCase("L");
        String alamat = inputString("Alamat\t\t\t: ");
        String telp = inputString("No Telp\t\t\t: ");
        String spesialis = inputString("Spesialisasi\t\t: ");

        Dokter23 dokter = new Dokter23(id, nama, jk, alamat, telp, spesialis);
        daftarDokter.add(dokter);
        System.out.println("Dokter berhasil ditambahkan!");
    }

    private static void updateDokter() {
        int id = inputInt("Masukkan ID Dokter yang akan diupdate: ");
        Dokter23 dokter = daftarDokter.stream().filter(d -> d.getId23() == id).findFirst().orElse(null);

        if (dokter == null) {
            System.out.println("Dokter tidak ditemukan!");
            return;
        }

        System.out.println("=== Update Data Dokter ===");
        dokter.setNama23(inputString("Nama baru\t\t: "));
        dokter.setJenisKelamin23(inputString("Jenis Kelamin (L/P)\t: ").equalsIgnoreCase("L"));
        dokter.setAlamat23(inputString("Alamat baru\t\t: "));
        dokter.setNoTelp23(inputString("No Telp baru\t\t: "));
        dokter.setSpesialisasi23(inputString("Spesialisasi baru\t: "));
        System.out.println("Data dokter berhasil diperbarui!");
    }

    private static void tampilkanDokter() {
        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada data dokter.");
        } else {
            for (Dokter23 d : daftarDokter) {
                d.tampilkanInfo23();
            }
        }
    }

    // -------------------- TAMBAH RIWAYAT --------------------
    private static void tambahRiwayat() {
        try {
            int idPasien = inputInt("Masukkan ID Pasien\t: ");
            Pasien23 pasien = daftarPasien.stream().filter(p -> p.getId23() == idPasien).findFirst().orElse(null);
            if (pasien == null) {
                System.out.println("Pasien tidak ditemukan!");
                return;
            }

            int idDokter = inputInt("Masukkan ID Dokter\t: ");
            Dokter23 dokter = daftarDokter.stream().filter(d -> d.getId23() == idDokter).findFirst().orElse(null);
            if (dokter == null) {
                System.out.println("Dokter tidak ditemukan!");
                return;
            }

            int idP = inputInt("Masukkan ID Pemeriksaan\t: ");
            Date tanggal = inputTanggal("Masukkan Tanggal Pemeriksaan");
            String keluhan = inputString("Keluhan\t\t\t: ");
            String diagnosa = inputString("Diagnosa\t\t: ");
            String tindakan = inputString("Tindakan\t\t: ");
            String obat = inputString("Obat\t\t\t: ");

            Pemeriksaan23 pemeriksaan = new Pemeriksaan23(idP, tanggal, keluhan, diagnosa, tindakan, obat, dokter);

            RekamMedik23 rekam = pasien.getRekamMedik23();
            if (rekam == null) {
                rekam = new RekamMedik23(idPasien, pasien);
                pasien.setRekamMedik23(rekam);
            }

            rekam.tambahPemeriksaan23(pemeriksaan);
            System.out.println("Riwayat pemeriksaan berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }

    // -------------------- TAMPILKAN RIWAYAT --------------------
    private static void tampilkanRiwayat() {
        int id = inputInt("Masukkan ID Pasien\t: ");
        Pasien23 pasien = daftarPasien.stream().filter(p -> p.getId23() == id).findFirst().orElse(null);
        if (pasien != null && pasien.getRekamMedik23() != null) {
            pasien.getRekamMedik23().tampilkanRekamMedik23();
        } else {
            System.out.println("Rekam medik tidak ditemukan!");
        }
    }
}