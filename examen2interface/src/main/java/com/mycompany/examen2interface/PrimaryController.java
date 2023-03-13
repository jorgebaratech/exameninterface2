package com.mycompany.examen2interface;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.Alumno;

public class PrimaryController {

    private TextField nombreField;
    private TextField apellidoField;
    private TextField adField;
    private TextField sgeField;
    private TextField diField;
    private TextField pmdmField;
    private TextField pspField;
    private TextField eieField;
    private TextField hclField;

    private Alumno alumno;
    @FXML
    private TableView<?> tablaAlumnos;
    @FXML
    private TableColumn<?, ?> nombrecolum;
    @FXML
    private TableColumn<?, ?> apellidocolum;
    @FXML
    private TableColumn<?, ?> adcolum;
    @FXML
    private TableColumn<?, ?> sgecolum;
    @FXML
    private TableColumn<?, ?> dicolum;
    @FXML
    private TableColumn<?, ?> pmdmcolum;
    @FXML
    private TableColumn<?, ?> pspcolum;
    @FXML
    private TableColumn<?, ?> eiecolum;
    @FXML
    private TableColumn<?, ?> hclcolum;
    @FXML
    private Button añadirnotas;
    @FXML
    private Button descargarnota;
    @FXML
    private Button salir;

    private void initialize() {
        // Inicializar los campos de texto con los datos de los alumnos de prueba
        nombreField.setText("Alumno1");
        apellidoField.setText("Apellido1");
        adField.setText("8");
        sgeField.setText("6");
        diField.setText("7");
        pmdmField.setText("9");
        pspField.setText("6");
        eieField.setText("10");
        hclField.setText("8");

        // Crear 3 alumnos de prueba y añadirlos a la tabla
        Alumno alumno1 = new Alumno("Alumno1", "Apellido1", 8, 6, 7, 9, 6, 10, 8);
        Alumno alumno2 = new Alumno("Alumno2", "Apellido2", 7, 5, 9, 8, 7, 6, 9);
        Alumno alumno3 = new Alumno("Alumno3", "Apellido3", 9, 8, 6, 10, 5, 7, 7);

        // Añadir los alumnos a la tabla
        // ...

    }

   private void addAlumno() {
    String nombre = nombreField.getText();
    String apellido = apellidoField.getText();
    int ad = Integer.parseInt(adField.getText());
    int sge = Integer.parseInt(sgeField.getText());
    int di = Integer.parseInt(diField.getText());
    int pmdm = Integer.parseInt(pmdmField.getText());
    int psp = Integer.parseInt(pspField.getText());
    int eie = Integer.parseInt(eieField.getText());
    int hcl = Integer.parseInt(hclField.getText());

    // Validar que las notas estén en el intervalo [0-10]
    if (ad < 0 || ad > 10 ||
        sge < 0 || sge > 10 ||
        di < 0 || di > 10 ||
        pmdm < 0 || pmdm > 10 ||
        psp < 0 || psp > 10 ||
        eie < 0 || eie > 10 ||
        hcl < 0 || hcl > 10) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Las notas deben estar en el intervalo [0-10]");
        alert.showAndWait();
        return;
    }

    alumno = new Alumno(nombre, apellido, ad, sge, di, pmdm, psp, eie, hcl);

    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Nuevo alumno");
    alert.setHeaderText(null);
    alert.setContentText(alumno.toString());
    alert.showAndWait();
}




}

