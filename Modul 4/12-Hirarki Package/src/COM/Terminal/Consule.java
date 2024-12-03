package COM.Terminal;

//Visibilitasnya bisa di akses oleh package external
 public class Consule {
    public static void log (String nama) {
        System.out.println("Pesan");
    }
    
}

// Ini hanya bisa di akses oleh package terminal
class Terminal {
    public static void log(String pesan){
        System.out.println(pesan);
    }

    
}