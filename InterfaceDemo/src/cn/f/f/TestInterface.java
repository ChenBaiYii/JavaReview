package cn.f.f;

public class TestInterface {
    public static void main(String[] args) {
        Volant v = new Angel();
        Honest lily = new GoodGirl();
    }
}

interface Volant {
    int FLY_HIGHT = 2000;
    void fly();
}

interface Honest {
    void helpOther();
}

class Angel implements Volant, Honest { // 实现多个接口

    @Override
    public void helpOther() {
        System.out.println("love and place");
    }

    @Override
    public void fly() {
        System.out.println("flying...");
    }
}

class GoodGirl implements Honest {
    @Override
    public void helpOther() {
        System.out.println("love and place");
    }
}

// 接口多继承

interface ALL extends Volant, Honest {
    void check(); // 自己又添加一个抽象方法
}