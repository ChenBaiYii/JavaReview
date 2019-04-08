package cn.f.f;

public class TestArray {
    public static void main(String[] args) {
        // 数组初始化的三种方法

        // 静态初始化
        int[] b = {2, 3, 4, 6};

        // 默认初始化
        int [] c = new int[10];

        // 动态初始化
        int[] d = new int[2];
        d[0] = 1;
        d[1] = 2;


        // 遍历
        // for
        // foreach 只读，不能修改，因为没有下标引用
        for(int m: d) {
            System.out.println(m);
        }
    }
}
