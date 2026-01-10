package Day10.Practice;

class Alpha {
    int x = 10;
    void mth1() {
        System.out.println("Mth1");
    }
}

class Beta extends Alpha {
    int y = 20;
    void mth2() {
        System.out.println("Mth2");
    }
}

public class MainForPractice {
    public static void main(String[] args) {
        Alpha a1 = new Beta();
        System.out.println(a1.x);
        // System.out.println(a1.y);  CTE
        a1.mth1();
        // a1.mth2();  CTE
    }
}
