package ex;

//配列の合計
public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(i + "回目 合計 : " + sum);
            //平均を求める
            System.out.println(i + "回目 平均 : " + (double) sum / (i+1));
        }

        System.out.println("配列の合計 : " + sum);
        System.out.println("配列の平均 : " + (double) sum/ array.length);
    }
}

