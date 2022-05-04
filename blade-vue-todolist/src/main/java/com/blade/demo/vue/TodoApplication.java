package com.blade.demo.vue;

import com.hellokaton.blade.Blade;
import com.hellokaton.blade.kit.StringKit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hellokaton
 * @date 2022/5/3
 */
public class TodoApplication {

    private static final List<Todo> todoList = new ArrayList<>();

    public static void main(String[] args) {
        Blade.create()
                .get("/", ctx -> ctx.render("index.html"))
                .post("/add", ctx -> {
                    String todo = ctx.query("todo");
                    if (StringKit.isNotBlank(todo)) {
                        todoList.add(new Todo(todo, Todo.ACTIVE));
                    }
                    System.out.println("TodoList: " + todoList);
                    ctx.text("success");
                })
                .post("/edit", ctx -> {
                    String todo = ctx.query("oldTodo");
                    if (StringKit.isNotBlank(todo)) {
                        todoList.stream().filter(t -> t.getValue().equals(todo))
                                .findFirst()
                                .ifPresent(todoModel -> todoModel.setValue(todo));
                    }
                    System.out.println("TodoList: " + todoList);
                    ctx.text("success");
                })
                .post("/remove", ctx -> {
                    String todo = ctx.query("todo");
                    if (StringKit.isNotBlank(todo)) {
                        todoList.stream().filter(t -> t.getValue().equals(todo))
                                .findFirst()
                                .ifPresent(todoList::remove);
                    }
                    System.out.println("TodoList: " + todoList);
                    ctx.text("success");
                })
                .post("/status/:status", ctx -> {
                    String status = ctx.pathString("status");
                    ctx.request().form("todo")
                            .flatMap(todo -> todoList.stream().filter(t -> t.getValue().equals(todo))
                                    .findFirst()).ifPresent(todoModel -> todoModel.setStatus(status));
                    System.out.println("TodoList: " + todoList);
                    ctx.text("success");
                })
                .post("/clean", ctx -> {
                    todoList.clear();
                    ctx.text("success");
                })
                .start(TodoApplication.class, args);
    }

}
