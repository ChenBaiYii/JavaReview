package cn.f.f;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class TestFileClass {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));

        File f2 = new File("test.txt");
        f2.createNewFile();

        File file = new File("d:/a.txt");
//        file.renameTo(new File("d:/bb.txt"));

        System.out.println("是否存在: " + f2.exists());
        System.out.println("是否为目录: " + f2.isDirectory());
        System.out.println("是否是文件: " + f2.isFile());
        System.out.println("最后修改时间: " + new Date(file.lastModified()));
        f2.length();
        f2.getName();
        f2.getPath();
        // f2.delete();


    }
}
