package bas.telphone.JavaFX.start;

import bas.telphone.JavaFX.interfaces.impls.CollectionAddressBook;
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
        primaryStage.setMinWidth(377);
        primaryStage.setMinHeight(335);
        Scene scene = new Scene(root,361,315);
        scene.getStylesheets().add(0, "bas/telphone/JavaFX/styles/my.css");
        primaryStage.setScene(scene);
        primaryStage.show();
        testData();
    }


    public static void main(String[] args) {
        launch(args);

    }

    private void testData() {
        CollectionAddressBook addressBook = new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();
    }
}
