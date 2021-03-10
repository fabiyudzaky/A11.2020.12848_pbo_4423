public class tugas {
    public static void main(String[] args){

        // a. -5 + 8 * 6
        int a1 = -5, a2 = 8, a3 = 6;
        int a;
        a = a1 + a2 * a3;
        System.out.println(a);

        // b. (55+9) % 9
        int b1 = 55, b2 = 9, b3 = 9;
        int b;
        b = (b1 + b2) % b3;
        System.out.println(b);

        // c. 20 + -3*5 / 8
        int c1 = 20, c2 = -3, c3 = 5, c4 = 8;
        int c;
        c = c1 + c2 * c3 / c4;
        System.out.println(c);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int d1 = 5, d2 = 15, d3 = 3, d4 = 2, d5 = 8, d6 = 3;
        int d;
        d = d1 + d2 / d3 * d4 - d5 %d6;
        System.out.println(d);
    }
}
