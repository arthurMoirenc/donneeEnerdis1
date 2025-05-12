package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.example.DonneeDAO.addDonnee;

public class HelloController {
    @FXML
    private TableView<Donnee> tableView;

    @FXML
    private TableColumn<Donnee, String> dateCol;

    @FXML
    private TableColumn<Donnee, Integer> valeurCol;

    @FXML
    private TableColumn<Donnee, String> uniteCol;


    @FXML
    public void initialize() {
        /// /////////////////////////

        LocalDateTime dateHeureActuelle = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Donnee newDonnee = new Donnee(3,dateHeureActuelle.format(formatter), 220,"hz");
        //DonneeDAO.addDonnee(newDonnee);
        /// /////////////////////////

        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        valeurCol.setCellValueFactory(new PropertyValueFactory<>("valeur"));
        uniteCol.setCellValueFactory(new PropertyValueFactory<>("unite"));
        tableView.getItems().addAll(DonneeDAO.getAllDonnees());
    }
}