package web;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author tony.chenjy
 * @date 2020-06-20
 */
public class WebApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

        Parent root = FXMLLoader.load(getClass().getResource("web.fxml"));
        primaryStage.setTitle("JAVAFX嵌入html测试");
        primaryStage.setScene(new Scene(root, 1270, 860));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
