package cn.f.f;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class TestDateFormat {
    public static void main(String[] args) {

        // 时间转字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date(400000000));
        System.out.println(str);

        // 字符串转时间
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        try {
            Date date = df2.parse("1983年05月10日 10时45分44秒");
            System.out.println(date);
        } catch (ParseException e) {

        }


    }
}
