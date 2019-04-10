package cn.f.f;

import java.io.File;

public class DirWalk {
    public static void main(String[] args) {
        File f = new File("D:\\Go");

        walk(f, 0);
    }

    static void walk(File file, int level) {
        // 输出层数
        for(int i=0; i<level; i++) {
            System.out.print(" - ");
        }

        System.out.println(file.getName());
        if(file.isDirectory()) {
            File[] files = file.listFiles();  // 列出本目录下的所有文件
            for(File temp:files) {
                walk(temp, level+1);
            }
        }


    }

}
