module org.tallyapp.tallyapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.tallyapp.tallyapp to javafx.fxml;
    exports org.tallyapp.tallyapp;
}