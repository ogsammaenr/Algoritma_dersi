public class Recursive {
    public static void main(String[] args) {
        Yazdirma(5);

        System.out.println("--------");

        terstenYazdirma(5);

        System.out.println("--------");

        System.out.println(toplama(2));

        System.out.println("--------");

        System.out.println(Us_Alma(3,0));

        System.out.println("--------");

        System.out.println(cift_sayi_toplam(5));

        System.out.println("--------");

        int[] array = {5,5,55,5,5,5,6,5,4,3,2,5,5,5,4};
        System.out.println(enKucukEleman(array, 0));

        System.out.println("--------");

        carpimYazdir(3,5,10);



    }

    public static int Yazdirma(int a) {
        System.out.println(a);

        if (a == 1) {
            return a ;
        }

        return Yazdirma(a-1);
    }
    public static int terstenYazdirma_1(int i, int j) {
        System.out.println(i - j);

        if (j == 0) {
            return 0 ;
        }

        return terstenYazdirma_1(i, --j) ;
    }
    public static int terstenYazdirma(int n) {
        return terstenYazdirma_1(n,--n);
    }

    public static int toplama(int a) {

        if (a == 1){
            return a ;
        }
        return a + toplama(a-1);

    }

    public static int Us_Alma (int taban, int us){
        if (taban == 1){
            return taban ;
        }
        if (us  == 0){
            return 1 ;
        }

        return taban * Us_Alma(taban , us-1) ;
    }

    public static int cift_sayi_toplam(int n){
        if (n == 0){
            return n;
        }

        else if (n % 2==0){
            return n + cift_sayi_toplam(n-1);
        }

        return cift_sayi_toplam(n-1) ;
    }

    public static int enKucukEleman(int[] array, int index){
        if (index == array.length-1){
            return array[index] ;
        }

        int en_kucuk = enKucukEleman(array, index+1) ;

        return Math.min(array[index], en_kucuk);
    }

    public static int carpimYazdir(int ilk_elemani , int artis_kati , int artis_sayisi){
        System.out.println(ilk_elemani);

        if (artis_sayisi == 0)
            return 1;


        return ilk_elemani * carpimYazdir(ilk_elemani*artis_kati , artis_kati , --artis_sayisi) ;

    }

    //ÖDEV
    //recursive fonksiyonlar gerçek hayat problemlerine nasıl uyarlanmış araştır !!!!!
    //3, 15, 75, 375... diye devam eden serinin recurive fonksiyon ile ifade ediniz
    //3, 6, 12, 24, 48, 96... diye devam eden seriyi recursive fonksiyon ile ifade ediniz



}
