package intro.operator;

public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 27;

        //numが0以上である
        System.out.println("num" + ">=" + 0 + ":" + (num >= 0));
        System.out.println(- num >= 0);
        //numが100以下である
        System.out.println(num <= 100);
        //numが奇数である
        System.out.println(num % 2 == 1);
        //numが３の倍数である
        System.out.println(num % 3 == 0);
        //numが0以上かつ100以下
        System.out.println(num >= 0 && num <= 100);
    }
}
