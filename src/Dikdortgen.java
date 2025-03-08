public class Dikdortgen {
    int width;
    int height;

    Dikdortgen(){
        this.width = 0;
        this.height = 0;
    }

    Dikdortgen(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int cevreHesap (){
        return 2*width + 2*height;
    }

    int alanHesap (){
        return width*height;
    }

    void yazdir (){
        System.out.println("");
    }
}
