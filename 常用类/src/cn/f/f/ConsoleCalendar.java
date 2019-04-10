package cn.f.f;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ConsoleCalendar {
    public static void main(String[] args) throws ParseException {

        System.out.print("输入日期(格式：2000-1-1)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(input);

        Calendar c = new GregorianCalendar();
        c.setTime(date);

        int currentDay = c.get(Calendar.DAY_OF_MONTH);
        int maxDate = c.getActualMaximum(Calendar.DATE);

        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        c.set(Calendar.DAY_OF_MONTH, 1);

        for (int j = 0; j < c.get(Calendar.DAY_OF_WEEK) - 1; j++) {
            System.out.print("\t");
        }


        for (int i = 1; i <= maxDate; i++) {
            if(currentDay == c.get(Calendar.DAY_OF_MONTH)) {
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
            } else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }


            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            c.add(Calendar.DAY_OF_MONTH, 1);
        }

    }
}
