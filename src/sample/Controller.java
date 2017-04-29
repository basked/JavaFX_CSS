package sample;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;
import javafx.event.ActionEvent;

public class Controller {

    public void onRedAction(ActionEvent actionEvent) {

        System.out.println("basket");

    }

    public void onGreenAction(ActionEvent actionEvent) {
        System.out.println("FROM");
    }

    public void onYellowAction(ActionEvent actionEvent) {
        System.out.println("LAST MOVE CREW");
    }
}
