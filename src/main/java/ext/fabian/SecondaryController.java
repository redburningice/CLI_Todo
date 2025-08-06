package ext.fabian;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.StringConverter;
import javafx.util.converter.DefaultStringConverter;

public class SecondaryController {

    public ListView<String> countries;

    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("germany", "brazil", "portugal");

        // setCellFactory forces all old ListCell's to be thrown away, and new ListCell's created with the new cell factory.
//        countries.setCellFactory((p) -> {
//            return new TextFieldListCell<>(
//                    new DefaultStringConverter()
//            );
//        });

        countries.setCellFactory(TextFieldListCell.forListView());

        countries.setEditable(true);


        countries.setItems(list);

        System.out.println();
    }

    private void function(String p) {

    }

    @FXML
    private void switchToPrimary() throws IOException {
        countries.getItems().add("italy");
    }
}