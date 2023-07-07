package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。

    /**
     * タスクの実行
     */


        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
public class Task extends Calculator {
    public void doTask() {
        int result1 = plus(1);
        int result2 = plus(3, 7);
        int result3 = plus(1, 2, 3);

        System.out.println("pulsメソッドの因数が1つの場合: " + result1);
        System.out.println("pulsメソッドの因数が2つの場合: " + result2);
        System.out.println("pulsメソッドの因数が3つの場合: " + result3);
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.doTask();
    }
}