
package study;

/**
 *
 * 本課題では、フィールド変数、メソッドの基本的な使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   Main.java: 問①から問③
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

      //① firstNameとlastNameという名前の変数を定義し、
      //   firstNameには自分の名前、lastNameには自分の名字で初期化しなさい
    	String firstName = "yuya";
        String lastName = "kohagura";
        //getName関数の呼び出しと出力
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    

        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
        //   要素が奇数の場合には「nは奇数です。」と出力されます。
        for (int num : arr) {
            if (isOdd(num)) {
                System.out.println(num + "は奇数です。");
            }
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}

    
