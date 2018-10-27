package ua.logic.mvvm.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final StringProperty password = new SimpleStringProperty(this, "password");

    public User(String name, String password) {
        this.name.set(name);
        this.password.set(password);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }
}
