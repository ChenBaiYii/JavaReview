package cn.f.f;

import javax.print.attribute.standard.MediaSize;

public class TestInnerClass {
    public static void main(String[] args) {
        // 创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

    }


}

class Outer {
    private int age = 10;

    public void testOut() {
        System.out.println("test out");
    }

    // 独立的类，生成文件时是分开的
    class Inner {
        int age = 20;
        public void show() {
            int age = 30;
            System.out.println("外部类 age is : " + Outer.this.age);
            System.out.println("内部类 age is : " + this.age);
            System.out.println("局部变量 age is : " + age);
        }
    }
}