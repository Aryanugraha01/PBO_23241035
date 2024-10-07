class Kalkulator{
    // atribut Kalkulator
    double Perkalian;
    double Penjumlahan;
    double Pengurangan;
    double Pembagian;

    // Constructor dengan parameter
    Kalkulator (double Input1, double Input2, double Input3, double Input4){
        Perkalian = Input1 * Input2 * Input3 * Input4;
        Penjumlahan = Input1 + Input2 + Input3 + Input4;
        Pengurangan = Input1 - Input2 - Input3 - Input4;
        Pembagian = Input1 / Input2 / Input3 / Input4;
        
        // cetak
        System.out.println("Hasil Perkalian: " + Perkalian);
        System.out.println("Hasil Penjumlahan: " + Penjumlahan);
        System.out.println("Hasil Pengurangan: " + Pengurangan);
        System.out.println("Hasil Pembagian: " + Pembagian);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        // instansi object class kalkulator
        Kalkulator Kalkulator_1 = new Kalkulator(10, 7, 9, 2);

        Kalkulator kalkulator_2 = new Kalkulator(12, 17, 5, 6);
    }
}
