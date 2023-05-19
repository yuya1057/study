/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus =5 + 10;
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus =20 - 7;
        // ③下記の処理について、何をしているのかコメントを記入してください。
        // int型の変数multiplyを作成し、１０を２でかけた数を代入している。
        int multiply = 10 * 2;

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20 / 6;
        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // townは中央と定義している。lineは線と定義している。
        String town = "中央";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = ("中央"+"線");
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        System.out.println (plus);System.out.println (minus);System.out.println (multiply);System.out.println (train);
    }
}