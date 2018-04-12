package com.blade.demo.task;

import com.blade.ioc.annotation.Bean;
import com.blade.kit.DateKit;
import com.blade.task.TaskContext;
import com.blade.task.TaskManager;
import com.blade.task.annotation.Schedule;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Task Example
 *
 * @author biezhi
 * @date 2018/4/12
 */
@Bean
public class TaskExample {

    /**
     * 每秒执行一次
     */
    @Schedule(cron = "* * * * * ?")
    public void one() {
        System.out.println("每秒钟执行一次，现在是: " + DateKit.toString(LocalDateTime.now()));
    }

    /**
     * 每五秒执行一次
     */
    @Schedule(name = "taskTwo", cron = "*/5 * * * * ?")
    public void two() {
        System.out.println("每五秒钟执行一次，现在是: " + DateKit.toString(LocalDateTime.now()));
    }

    private AtomicInteger size = new AtomicInteger();

    /**
     * 每秒执行一次，当 size == 3 时停止
     *
     * @param taskContext
     */
    @Schedule(cron = "* * * * * ?")
    public void three(TaskContext taskContext) {
        if (size.getAndIncrement() == 3) {
            return;
        }
        System.out.println("Task Three: " + size.get());
    }

    private AtomicInteger fourSize = new AtomicInteger();

    /**
     * 每秒执行一次，10秒后开始执行
     * <p>
     * 使用静态方法 TaskManager.stopTask 停止任务
     */
    @Schedule(name = "fourTask", cron = "* * * * * ?", delay = 1000L)
    public void four() {
        if (fourSize.getAndIncrement() == 2) {
            TaskManager.stopTask("fourTask");
            return;
        }
        System.out.println("Four Task: " + fourSize.get());
    }

}
