package cn.f.f;

// 方法加 final 不能被重写，可以重载
// 类加 final 不能继承


public class TestPolym {

    public static void main(String[] args) {
        Animal a = new Cat();
        Animal d = new Dog();
        Yyy y = new Yyy();

        say(a);
        say(d);
        say(y);

    }

    static void say(Animal some) {
        some.shout();
    }

}


class Animal {
    public void eat() {
        System.out.println("eating");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void shout() {
        System.out.println("....");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Yyy extends Animal {
    @Override
    public void shout() {
        System.out.println("嘤嘤嘤");
    }
}

