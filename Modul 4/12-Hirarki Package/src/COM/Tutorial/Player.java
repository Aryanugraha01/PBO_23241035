package COM.Tutorial;
//Visibiliti default
// hany7a bisa di akses oleh package sama

import COM.Terminal.Consule;

public class Player {
    private String nama;

    Player(String nama){
        this.nama = nama;

    }
    
    void cetak(){
        //System.out.println("Player Nama: " + this.nama);

        Consule.log("Menggunakan Consule");
        Consule.log("Player nama :" + this.nama);

    
    }
}
