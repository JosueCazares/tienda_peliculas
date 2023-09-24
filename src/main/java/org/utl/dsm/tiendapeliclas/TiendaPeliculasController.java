package org.utl.dsm.tiendapeliclas;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TiendaPeliculasController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private TableColumn<Pelicula,Integer> colAnio;

    @FXML
    private TableColumn<Pelicula,Double> colCosto;

    @FXML
    private TableColumn<Pelicula,String> colGenero;

    @FXML
    private TableColumn<Pelicula,Integer> colIdPelicula;

    @FXML
    private TableColumn<Pelicula,String> colTitulo;

    @FXML
    private TableView<Pelicula> tblPelicula;

    @FXML
    private TextField txtAnio;

    @FXML
    private TextField txtCosto;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtTitulo;

    @FXML
    void registrarPeli(ActionEvent event) {

    }

    //Definicion de estructura de datos para llenado de tableview
    ObservableList<Pelicula> listpeli;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colIdPelicula.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getIdPelicula()));
        colTitulo.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getTitulo()));
        colGenero.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getGenero()));
        colAnio.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getAnio()));
        colCosto.setCellValueFactory(param -> new SimpleObjectProperty<>(param.getValue().getCosto()));
        //Inicializar la estructura de datos para poder cargar los elementos
        listpeli = FXCollections.observableArrayList();

    }

    public void saveMovie(){
        Pelicula pelicula = new Pelicula();
        pelicula.setIdPelicula(Integer.parseInt(txtId.getText()));
        pelicula.setTitulo(txtTitulo.getText());
        pelicula.setAnio(Integer.parseInt(txtAnio.getText()));
        pelicula.setGenero(txtGenero.getText());
        pelicula.setCosto(Double.parseDouble(txtCosto.getText()));
        listpeli.add(pelicula);
        tblPelicula.setItems(listpeli);
        clean();
    }
    public void clean(){
        txtId.clear();
        txtTitulo.clear();
        txtAnio.clear();
        txtGenero.clear();
        txtCosto.clear();
        txtId.requestFocus();
    }
    public void cleanTable(){
        tblPelicula.setItems(null);
    }
}

