package cn.fuck.www;

import cn.user.www.FooBar;
import cn.user.www.*;  // 会降低编译速度，但不影响运行速度

// 静态导入
import static java.lang.Math.PI;

public class User {
    // 跨包导入
    FooBar foo = new FooBar();
    // 遇到同名类
    cn.user.www.FooBar bar = new cn.user.www.FooBar();


}
