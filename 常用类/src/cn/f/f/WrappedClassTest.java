package cn.f.f;

// 测试包装类
public class WrappedClassTest {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer c = Integer.valueOf(3);
        Integer b = 1000; // new

        // 包装转为 基本数据类型
        int buffer = a.intValue();
        Integer e = new Integer("9999");


    }

}
