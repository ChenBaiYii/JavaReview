package cn.f.f;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCanlendar {
    public static void main(String[] args) {
        // 测试日期类
        Calendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 5);
        System.out.println(calendar);
        System.out.println("year " + calendar.get(Calendar.YEAR));
        System.out.println("week " + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
