// Nama: PUTRA RIKI NURSYAHREZA
// NIM: 2211103111
// Kelas: S1SI06B
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;
    private double totalGaji;

    // Konstruktor
    public Pegawai(String nip, String nama, String alamat, int jumlahHariLembur, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahHariLembur = jumlahHariLembur;
        this.gajiPokok = gajiPokok;
        this.totalGaji = hitungTotalGaji(gajiPokok, jumlahHariLembur);
    }

    // Destruktor
    public void finalize() {
        System.out.println("Objek Pegawai dengan NIP " + nip + " dihapus");
    }

    // Fungsi mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
        this.totalGaji = hitungTotalGaji(gajiPokok, jumlahHariLembur);
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
        this.totalGaji = hitungTotalGaji(gajiPokok, jumlahHariLembur);
    }

    // Fungsi accessor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    // Method overloading untuk perhitungan total gaji
    private double hitungTotalGaji(double gajiPokok, int jumlahHariLembur) {
        return gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }

    private double hitungTotalGaji(double gajiPokok) {
        return hitungTotalGaji(gajiPokok, 0);
    }
}