package bas.telphone.JavaFX.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Телефонный справочник");
        // минимальные значения ширины и высоты
        primaryStage.setMinWidth(380);
        primaryStage.setMinHeight(335);
        Scene scene = new Scene(root,361,315);
        scene.getStylesheets().add(0, "../styles/my.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}
