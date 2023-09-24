module org.utl.dsm.tiendapeliclas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utl.dsm.tiendapeliclas to javafx.fxml;
    exports org.utl.dsm.tiendapeliclas;
}