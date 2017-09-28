package com.blade.demo.vue;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class Todo {

    public static final String ACTIVE    = "active";
    public static final String COMPLETED = "completed";

    private String value;
    private String status;

    public Todo() {

    }

    public Todo(String value, String status) {
        this.value = value;
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo(value='" + value + ", status='" + status + ')';
    }

}
