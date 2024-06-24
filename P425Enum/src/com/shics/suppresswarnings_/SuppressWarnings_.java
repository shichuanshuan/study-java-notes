package com.shics.suppresswarnings_;

import java.util.ArrayList;

public class SuppressWarnings_ {
    // 1. 当我们不希望看到这些警告的时候，可以使用 SuppressWarnings 注解来抑制警告信息
    // 2. 在 {""} 中，可以写入你希望抑制警告(不显示)信息
    // 3. 关于 SuppressWarnings 作用范围是和你防止的位置有关
    // 比如 @SuppressWarning 放置在 main 方法，那么抑制警告的范围就是 main
    // 4.
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");

        int i;
        System.out.println(list.get(1));
    }
}
