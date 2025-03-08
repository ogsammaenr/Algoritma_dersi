public class Saat {
    int Saat;
    int Dakika;
    int Saniye;

    Saat (int Saat, int Dakika, int Saniye) {
        this.Saat = Saat;
        this.Dakika = Dakika;
        this.Saniye = Saniye;

        if (this.Saniye >= 60) {
            this.Saniye = Saniye % 60;
            this.Dakika = Dakika + Saniye / 60;
        }

        if (this.Dakika >= 60) {
            this.Dakika = Dakika % 60;
            this.Saat = Saat + Dakika / 60;
        }
        if (this.Saat >= 24) {
            this.Saat = Saat % 24;
        }

    }

    Saat () {
        this.Saat = 0;
        this.Dakika = 0;
        this.Saniye = 0;
    }

    void saniye_ekle (){
        this.Saniye++;

        if (this.Saniye >= 60) {
            this.Dakika = Dakika + Saniye / 60;
            this.Saniye = Saniye % 60;

            if (this.Dakika >= 60) {
                this.Saat = Saat + Dakika / 60;
                this.Dakika = Dakika % 60;

                if (this.Saat >= 24) {
                    this.Saat = Saat % 24;
                }
            }
        }
    }

    void yazdir (){
        System.out.println(Saat + " : " + Dakika + " : " + Saniye);
    }

}
