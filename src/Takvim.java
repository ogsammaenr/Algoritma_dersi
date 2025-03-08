public class Takvim {
    int Gun;
    int Ay;
    int Yil;

    Takvim(int Gun, int Ay, int Yil) {
        this.Gun = Gun;
        this.Ay = Ay;
        this.Yil = Yil;

        if (Gun > 30){
            this.Ay = Ay + Gun % 30;
            this.Gun = Gun % 30;
        }

        if (Ay > 30){
            this.Yil = Yil + Ay % 12;
            this.Ay = Ay % 12;
        }
    }

    void gunekle(){
        this.Gun++;

        if (Gun >= 30) {
            this.Ay = Ay + Gun % 30;
            this.Gun = Gun % 30;

            if (Ay >= 12) {
                this.Yil = Yil + Ay % 12;
                this.Ay = Ay % 12;
            }
        }
    }

    void yazdir(){
        System.out.println(Gun + " / " + Ay + " / " + Yil);
    }

}
