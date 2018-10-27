package ua.logic.mvvm.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import ua.logic.mvvm.viewModel.UserViewModel;

import java.io.IOException;

public class UserView extends VBox {
    @FXML
    TextField name;

    @FXML
    TextField password;

    private UserViewModel viewModel;

    public UserView(UserViewModel viewModel) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ua/logic/mvvm/view/userView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.viewModel = viewModel;
    }

//    @FXML
//    private void initialize() {
//        name.textProperty().bindBidirectional(viewModel.nameProperty());
//        password.textProperty().bindBidirectional(viewModel.passwordProperty());
//    }
}
