package cn.f.f;

public class TestAnonymouseInnerClass {
    public static void test01(AA a) {
        a.aa();
    }

    public static void main(String[] args) {
        TestAnonymouseInnerClass.test01(new AA(){
            public void aa() {
                System.out.println("inner");
            }
        });
    }

}



interface AA {
    void aa();
}