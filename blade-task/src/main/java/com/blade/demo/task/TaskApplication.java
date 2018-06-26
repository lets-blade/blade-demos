package com.blade.demo.task;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/4/12
 */
public class TaskApplication {

    public static void main(String[] args) {
        Blade.of().start(TaskApplication.class, args);
    }

}
