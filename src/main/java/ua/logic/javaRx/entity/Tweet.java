package ua.logic.javaRx.entity;

public class Tweet {
    private String text;

    public Tweet(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
