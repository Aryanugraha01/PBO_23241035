

class Hitung_Gaji_Bersih {
    private int gajiPokok;
    private int tunjangan;
    private double pajak;

    // Setter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gaji pokok
    public int getGajiPokok() {
        return this.gajiPokok;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk pajak (mengembalikan nilai pajak dalam rupiah)
    public double getPajak() {
        return (this.gajiPokok + this.tunjangan) * pajak / 100;
    }

    // Method untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double totalPajak = getPajak();
        double gajiBersih = (this.gajiPokok + this.tunjangan) - totalPajak;

        System.out.println("Rincian Gaji:");
        System.out.println("Gaji Pokok     : Rp. " + this.gajiPokok);
        System.out.println("Tunjangan      : Rp. " + this.tunjangan);
        System.out.println("Pajak (7%)     : Rp. " + totalPajak);
        System.out.println("Gaji Bersih    : Rp. " + gajiBersih);
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek HitungGajiBersih
        Hitung_Gaji_Bersih Gaber = new Hitung_Gaji_Bersih();

        // Mengatur nilai gaji pokok, tunjangan, dan pajak
        Gaber.setGajiPokok(5500000);
        Gaber.setTunjangan(750000);
        Gaber.setPajak(7); // Pajak dalam persen

        // Mencetak rincian gaji bersih
        Gaber.cetakGajiBersih();
    }
}
