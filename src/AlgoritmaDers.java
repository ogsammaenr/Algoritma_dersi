public class AlgoritmaDers {
    int Numara;
    String Ad;
    String Soyad;
    String Bolum;
    int Sinif;
    double VizeNot;
    double FinalNot;
    double Ort;
    String HarfNotu;

    AlgoritmaDers(int Numara, String Ad, String Soyad, String Bolum, int Sinif, double VizeNot, double FinalNot) {

        this.Numara = Numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        this.Sinif = Sinif;
        this.VizeNot = VizeNot;
        this.FinalNot = FinalNot;
    }

    AlgoritmaDers(int Numara, String Ad, String Soyad) {
        this.Numara = Numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }

    void ortalamaHesap () {
        this.Ort = 0.4 * VizeNot + 0.6 * FinalNot;
    }
    void harfnothesapla () {
        if (this.Ort < 50) {
            this.HarfNotu = "ff";
        }
        else if (this.Ort <= 70) {
            this.HarfNotu = "bb";
        }
        else if (this.Ort <= 90) {
            this.HarfNotu = "ba";
        }
        else if (this.Ort <= 100) {
            this.HarfNotu = "aa";
        }
    }
    void yazdir () {
        System.out.println("Numarası : " + this.Numara);
        System.out.println("Adı : " + this.Ad);
        System.out.println("Soyadı : " + this.Soyad);
        System.out.println("Bölümü : " + this.Bolum);
        System.out.println("Sınıfı : " + this.Sinif);
        System.out.println("Vize notu : " + this.VizeNot);
        System.out.println("Final notu: " + this.FinalNot);
        System.out.println("ortalaması : " + this.Ort);
        System.out.println("Harf Notu : " + this.HarfNotu);
    }


}
