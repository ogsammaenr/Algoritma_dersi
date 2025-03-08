import java.io.IOException;

public class MainSaat {
    public static void main(String[] args) throws InterruptedException {
        Saat saat1 = new Saat();

        while (true){
            saat1.saniye_ekle();
            Thread.sleep(1000);

            saat1.yazdir();
        }
    }
}
