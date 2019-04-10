package cn.f.f;

public class StringClassTest {
    public static void main(String[] args) {


        // 没有final修饰
        StringBuilder sb = new StringBuilder("2233");
        StringBuffer sbuffer = new StringBuffer();
        // build 线程不安全，效率高; buffer 则相反
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        sb.setCharAt(0, 'M');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

    }
}
