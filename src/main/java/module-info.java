module ext.fabian {
    requires javafx.controls;
    requires javafx.fxml;

    opens ext.fabian to javafx.fxml;
    exports ext.fabian;
}
