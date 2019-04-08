public class Opera {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);  // ret false
        System.out.println(b1 | b2);  // ret true
        System.out.println(b1 ^ b2);  // ret true
        System.out.println(!b2);  // ret true


        boolean b3 = 1 > 2 && 2 < (3 / 0);
        System.out.println(b3);

        // 位运算

        int buffer1 = 3;
        int buffer2 = 4;

        System.out.println(buffer1&buffer2);
        System.out.println(buffer1|buffer2);
        System.out.println(buffer1^buffer2);
        System.out.println(~buffer1);

        // 移位
        int some1 = 3 << 2;
        System.out.println(some1);
        int some2 = 12 >> 2;
        System.out.println(some2);
    }

}
