module com.example.projek_pbo_spaceinvader {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projek_pbo_spaceinvader to javafx.fxml;
    exports com.example.projek_pbo_spaceinvader;
}