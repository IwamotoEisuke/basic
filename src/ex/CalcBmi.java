package ex;

import java.util.Scanner;

public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }

    public static void main(String[] args) {
        //身長と体重の宣言
        double h = inputDouble("身長を入力してください");
        double w = inputDouble("体重を入力してください");

        //BMIの計算
        double bmi = w / Math.pow(h,2);
        bmi = Math.round(bmi * 10.0) / 10.0;

        //適正体重の計算
        double v = Math.pow(h,2) * 22;
        v = Math.round(v * 10.0) / 10.0;

        //適正体重との差
        double dif = w - v;
        dif = Math.round(dif * 10.0) / 10.0;


        //文字列の出力
        System.out.println("height:" + h + "m");
        System.out.println("weight:" + w + "kg");
        System.out.println("BMI:" + bmi);
        System.out.println("Appropriate Weight:" + v + "kg");
        System.out.println("Difference from appropriate weight:" + dif + "kg");

        //BMIによる判定
        if (bmi>=40){
            System.out.println("あなたは肥満(4度)です");
        } else if (bmi>=35){
            System.out.println("あなたは肥満(3度)です");
        } else if (bmi>=30){
            System.out.println("あなたは肥満(2度)です");
        } else if (bmi>=25){
            System.out.println("あなたは肥満(1度)です");
        } else if (bmi>=18.5){
            System.out.println("あなたは普通体重です");
        } else {
            System.out.println("あなたは低体重(瘦せ型)です");
        }

    }
}
