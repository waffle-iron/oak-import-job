package com.project.model;

public class Message {

    private boolean success;
    private String message;

    public Message(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public Message() {
        super();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
