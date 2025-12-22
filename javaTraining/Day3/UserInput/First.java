package Day3.UserInput;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // byte in every datatype (widening)
        short a = sc.nextByte();
        System.out.println(a);

        int b = sc.nextByte();
        System.out.println(b);

        long c = sc.nextByte();
        System.out.println(c);

        float d = sc.nextByte();
        System.out.println(d);

        double e = sc.nextByte();
        System.out.println(e);

        // every datatype in byte (narrowing)
        byte f = (byte) sc.nextShort();
        System.out.println(f);

        byte g = (byte) sc.nextInt();
        System.out.println(g);

        byte h = (byte) sc.nextFloat();
        System.out.println(h);

        byte i = (byte) sc.nextDouble();
        System.out.println(i);

        byte j = (byte) sc.nextLong();
        System.out.println(j);

        sc.close();
    }
}
