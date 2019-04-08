package cn.f.f;


// 接口只声明不实现
// 接口可以多继承
// 不能定义变量
// 常量默认添加 public static final
// 方法默认添加 public abstract
public interface MyInterface {
    void test1();

}


class MyClass implements MyInterface {
    // ... 重写方法

    @Override
    public void test1() {
        System.out.println("实现");
    }
}


