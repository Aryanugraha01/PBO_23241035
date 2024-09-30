import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            System.out.print("Masukkan bilangan 1: ");
            double bilangan1 = scanner.nextDouble();
            System.out.print("Masukkan bilangan 2: ");
            double bilangan2 = scanner.nextDouble();
            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = bilangan1 + bilangan2;
                    System.out.println("Hasil Penjumlahan: " + hasil);
                    break;
                case 2:
                    hasil = bilangan1 - bilangan2;
                    System.out.println("Hasil Pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = bilangan1 * bilangan2;
                    System.out.println("Hasil Perkalian: " + hasil);
                    break;
                case 4:
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                        System.out.println("Hasil Pembagian: " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Mau lagi? (ya/tidak): ");
            String jawaban = scanner.next();
            if (!jawaban.equalsIgnoreCase("ya")) {
                lanjut = false;
            }
        }

        scanner.close();
    }
}
