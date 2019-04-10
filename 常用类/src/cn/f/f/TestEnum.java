package cn.f.f;

public class TestEnum {
    public static void main(String[] args) {
        Season a = Season.AUTUMN;
        switch (a) {
            case SPRING:
                System.out.println("春困");
                break;
            case SUMMER:
                System.out.println("夏乏");
                break;
            case AUTUMN:
                System.out.println("秋打盹");
                break;
            case WINTER:
                System.out.println("冬眠");
                break;

        }
    }


}


enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}