package org.utl.dsm.tiendapeliclas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            root = FXMLLoader.load(Main.class.getResource("view_tienda_peliculas.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
    launch();
    }
}
