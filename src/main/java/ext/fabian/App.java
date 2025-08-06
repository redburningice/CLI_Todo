package ext.fabian;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        ObservableList<String> countries = FXCollections.observableArrayList("germany", "italy", "japan");
        ListView<String> listView = new ListView<>(countries);

//        scene = new Scene(loadFXML("primary"), 640, 480);
        Scene scene = new Scene(new StackPane(l, listView), 640, 480);
        scene.getStylesheets().add(getClass().getResource("/ext/fabian/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        Map<String, String> map = new HashMap<>();

        String value = String.valueOf("123");

        List<String> hello = List.of("Hello", "1");

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}