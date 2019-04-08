package cn.f.f;

import java.util.Arrays;

public class Test2DimensionArray {
    public static void main(String[] args) {

        Object[] emp1 = {1001, "lily", 18};
        Object[] emp2 = {1002, "eli", 19};
        Object[] emp3 = {1003, "honaka", 17};

        Object[][] list = new Object[3][];
        list[0] = emp1;
        list[1] = emp2;
        list[2] = emp3;


        for (int i=0; i< list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
        }



    }
}
