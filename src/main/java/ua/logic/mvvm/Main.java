package ua.logic.mvvm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.logic.mvvm.model.User;
import ua.logic.mvvm.view.UserView;
import ua.logic.mvvm.viewModel.UserViewModel;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        User user = new User("Admin","1");

        UserViewModel userViewModel = new UserViewModel();
        userViewModel.setModel(user);

        UserView userView = new UserView(userViewModel);

        primaryStage.setScene(new Scene(userView));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
