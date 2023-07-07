package study;
 
/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   User.java: 問①
 *   Main.java: 問①から問②
 * 指定された値と変数名を守って記述してください。
 *
 */

 
        // ① 以下のルールに従いUserクラスのインスタンスを生成してください。
        // 変数名:「user」
class User {
    private String userName;
    private int id;
    private String password;

    public User(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    protected void printAccountInfo() {
        System.out.println("Account Info:");
        System.out.println("Username: " + userName);
        System.out.println("ID: " + id);
        System.out.println("Password: " + password);
    }
}


        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
public class Main {
    public static void main(String[] args) {
        User user = new User("Road", 123, "road123");
        user.printAccountInfo();
    }
}

