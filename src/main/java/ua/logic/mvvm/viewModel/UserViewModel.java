package ua.logic.mvvm.viewModel;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import ua.logic.mvvm.model.User;

public class UserViewModel {
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final StringProperty password = new SimpleStringProperty(this, "password");

    private ObjectProperty<User> model = new SimpleObjectProperty<>(this, "model");

    public UserViewModel() {
        modelProperty().addListener((observable,
                                     oldModel,
                                     newModel) -> {
            newModel.nameProperty().bind(nameProperty());
            newModel.passwordProperty().bind(passwordProperty());
        });
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

    public ObjectProperty<User> modelProperty() {
        return model;
    }

    public void setModel(User model) {
        this.model.set(model);
    }
}
