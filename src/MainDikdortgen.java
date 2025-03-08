public class MainDikdortgen {
    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen(50,100);

        System.out.println("d1 dikdörtgenin \n" +
                            "\ngenişliği = " + d1.width
                            + "\nuzunluğu = " + d1.height
                            + "\nçevresi = " + d1.cevreHesap()
                            + "\nalanı = " + d1.alanHesap());
        Dikdortgen d2 = new Dikdortgen();
        d2.height = 5;
        d2.width = 10;

        System.out.println();
        System.out.println("d2 dikdörtgenin \n" +
                "\ngenişliği = " + d2.width
                + "\nuzunluğu = " + d2.height
                + "\nçevresi = " + d2.cevreHesap()
                + "\nalanı = " + d2.alanHesap());


    }

}
