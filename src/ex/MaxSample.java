package ex;

public class MaxSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        for (int num:array) {
            //最大値の更新
            if (num > max) {
                max = num;
            }
            //最小値の更新
            if (num < min) {
                min = num;
            }

        }
        System.out.println("最大値 : " + max);
        System.out.println("最小値 : " + min);
        }

    }
