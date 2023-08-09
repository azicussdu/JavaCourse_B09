package week_oca.day1;

public class Main {
    static String s = "-";
    public static void main(String[] args) {
        new Main().method1();
        System.out.println(s);
    }

    void method1() {
        try {
            method2();
        }
        catch (Exception e){
            System.out.println("message");
        }
        s += "c";
    }

    void method2() throws Exception{
        method3();
        s += "2";

        method3();
        s += "2b";
    }

    void method3() throws Exception {
        throw new Exception();
    }
}
