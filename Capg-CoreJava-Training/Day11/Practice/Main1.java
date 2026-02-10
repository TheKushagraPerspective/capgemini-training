package Day11.Practice;


interface InterfaceName {
    void mth1();
    void mth2();

    default void mth3() {
        System.out.println("Default mth inside interface");
    }
    int a = 20;

    static void mth4() {

    }
}

class Parent implements InterfaceName{
    
    public void mth1() {
        System.out.println("mth1");
    }

    public void mth2() {
        System.out.println("mth2");
    }

    void setA(int a) {
        // super.a = a;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.mth1();
        p.mth2();
        p.mth3();
        System.out.println(InterfaceName.a);
    }
}
