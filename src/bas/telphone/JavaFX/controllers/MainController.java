package bas.telphone.JavaFX.controllers;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.nio.ch.sctp.SctpStdSocketOption;

import java.io.IOException;

/**
 * Created by basket on 30.04.2017.
 */
public class MainController {
    // добавление нового
    public void ShowDialog(ActionEvent actionEvent) throws IOException {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/edit.fxml"));
            stage.setTitle("Редактирование записи");
            stage.setMinHeight(95);
            stage.setMinHeight(71);
            stage.setResizable(false); // нельзя растянуть
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL); // указываем что окно будет модальным
            // без InitOner окно не будет модельным
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow()); //определяем родительское окно через свойства actionEvent . источник . сцена источника. главное окно
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
