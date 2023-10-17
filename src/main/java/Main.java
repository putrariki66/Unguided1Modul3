public class Main {
    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai = new Pegawai("2211103111", "Putra Riki Nursyahreza", "Cilacap", 5, 50000000);

        // Menampilkan data pegawai
        System.out.println("NIP: " + pegawai.getNip());
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Jumlah Hari Lembur: " + pegawai.getJumlahHariLembur());
        System.out.println("Gaji Pokok: " + pegawai.getGajiPokok());
        System.out.println("Total Gaji: " + pegawai.getTotalGaji());

        // Mengubah data pegawai
        pegawai.setJumlahHariLembur(10);
        pegawai.setGajiPokok(6000000);

        // Menampilkan data pegawai setelah diubah
        System.out.println("\nNIP: " + pegawai.getNip());
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Jumlah Hari Lembur: " + pegawai.getJumlahHariLembur());
        System.out.println("Gaji Pokok: " + pegawai.getGajiPokok());
        System.out.println("Total Gaji: " + pegawai.getTotalGaji());

        // Menghapus objek pegawai
        pegawai = null;
        System.gc();
    }
}