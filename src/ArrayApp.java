import java.util.Arrays;
import java.util.Random;

public class ArrayApp {
    public static void arrayPrint (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] createRandomArray(int[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(0,51);
        }
        return array;
    }
    public static int[] arrayAdd(int[] array, int... elements){

        array = Arrays.copyOf(array, array.length + elements.length);
        for (int i = 0; i < elements.length; i++){
            array[i+ array.length] = elements[i];
        }
        return array;
    }

    public static int dizi_toplami (int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static int dizi_ortalamasi (int[] array) {
        int sum = dizi_toplami(array);
        return (sum / array.length);
    }
    public static int dizi_en_buyuk (int[] array){
        int en_buyuk = 0;
        for (int i : array) {
            if (i > en_buyuk) {
                en_buyuk = i;
            }
        }
        return en_buyuk;
    }
    public static int dizi_en_kucuk (int[] array){
        int en_kucuk = array[0];
        for (int i : array) {
            if (i < en_kucuk) {
                en_kucuk = i;
            }
        }
        return en_kucuk;
    }
    public static int[] matris_satir_en_buyuk (int[][] array){
        int[] en_buyuk = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > en_buyuk[i]) {
                    en_buyuk[i] = array[i][j];
                }
            }
        }
        return en_buyuk;
    }
    public static int[] matris_sutun_en_buyuk (int[][] array){
        int[] en_buyuk = new int[array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > en_buyuk[i]) {
                    en_buyuk[i] = array[j][i];
                }
            }

        }
        return en_buyuk;

    }
    public static int[] vektortoplamı(int[] vector1 , int[] vector2 ){
        int[] vekt = new int[vector1.length];

        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector1.length; i++) {
                vekt[i] = vector1[i] + vector2[i];
            }
            return vekt;
        }
        else {
            return null;
        }
    }

    public static int dotProduct (int[] vector1 , int[] vector2 ){
        int dotProduct = 0;
        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector1.length; i++) {
                dotProduct += vector1[i] * vector2[i];

            }
            return dotProduct;
        }
        else {
            return 0;
        }
    }


}
