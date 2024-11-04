class MOTOR {
  String merk;
  int tahun;
  String noPolisi;
  String warna;

  public MOTOR(String merek, int tahun, String noPolisi, String warna) {
      this.merk = merek;
      this.tahun = tahun;
      this.noPolisi = noPolisi;
      this.warna = warna;
  }

  void showInfoMotor() {
      System.out.println("Merek : " + this.merk);
      System.out.println("tahun : " + this.tahun);
      System.out.println("no Polisi : " + this.noPolisi);
      System.out.println("warna : " + this.warna);
  }
}

public class App {
  public static void main(String[] args) throws Exception {
      MOTOR mtrl = new MOTOR("Honda GI Pro", 1997, "G 5879", "Hitam");
      mtrl.showInfoMotor();
  }
}
