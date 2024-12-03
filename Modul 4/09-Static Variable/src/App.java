
class Display {
    //objek variable
    String nama;

    //ststic variable
    static String tipe = "Display";

    //Konstruktor
    Display (String nama){
        this.nama = nama;
    }

    //Setter
    void setTipe(String tipeInput){
        //tipe = tipeInput;  //Cara1
        //this.tipe = tipeInput; //cara2
        Display.tipe = tipeInput;
    } 
     
   // Method
    void cetak(){
        System.out.println("Display nama :" + this.nama ) ;


    }
}




public class App  {
    public static void main(String[] args) throws Exception{
        Display display1 = new Display("Monitor");
        display1.cetak();
        
        Display display2 = new Display("TV");

        //Menampilkan Static variable atau class variable
        System.out.println("Menampilkan static variable");
        System.out.println(display1.tipe); // diakses oleh objek
        System.out.println(Display.tipe); // diakses oleh class

        //coba ganti isi static variable
        Display.tipe = "Spanduk";
        //display1.tipe = "Smartphone";
        System.out.println(display1.tipe);
        System.out.println(display2.tipe);
        System.out.println(Display.tipe);

        // pakai setter untuk mengganti variable static
        display1.setTipe("Monitor");
        System.out.println("Objek1 :" + display1.tipe);
        System.out.println("Objek2 :" + display2.tipe);
        System.out.println("Class : " + Display.tipe);

    }
        
}