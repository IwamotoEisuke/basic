package ex;

public class MinSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
          }

        System.out.println("最大値 : " + max);
        System.out.println("最小値 : " + min);
    }
}

