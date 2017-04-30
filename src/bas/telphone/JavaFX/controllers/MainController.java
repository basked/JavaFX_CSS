package bas.telphone.JavaFX.controllers;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.nio.ch.sctp.SctpStdSocketOption;

import java.io.IOException;

/**
 * Created by basket on 30.04.2017.
 */
public class MainController {
    //  аннотация для использования в контроллере объектов помеченных как fmx:id в fxml файле
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnSearch;
    @FXML
    private TextField txtSearch;
    @FXML
    private TableView tblAddresBook;

    // добавление нового телефона
    public void ShowDialog(ActionEvent actionEvent) throws IOException {
        try {
            btnAdd.setText("add");
            btnEdit.setText("edit");
            btnDelete.setText("del");
            btnSearch.setId("btSearch");
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
