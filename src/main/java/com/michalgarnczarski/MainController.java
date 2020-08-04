package com.michalgarnczarski;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.DateStringConverter;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainController {

    @FXML
    private GridPane mainPane;
    @FXML
    private Button addClassesListButton;
    @FXML
    private Button editClassesListButton;
    @FXML
    private Button addClassroomsListButton;
    @FXML
    private Button editClassroomsListButton;
    @FXML
    private TextField earliestHourField;
    @FXML
    private TextField latestHourField;
    @FXML
    private ComboBox classroomsListComboBox;

    public void initialize() {

        // Set hour fields format as HH:mm and set defaults values.

        setHoursMinutesFormat(earliestHourField);
        setHoursMinutesFormat(latestHourField);
        earliestHourField.setText("8:00");
        latestHourField.setText("20:00");

        // Populate classroomsListComboBox with classrooms list's names parsed from files.

    }

    @FXML
    private void openAddClassesListWindow() {

        // The method opens new window for adding new classes list

        openNewWindow("Dodaj listę zajęć", "/add-classes-list.fxml",300,275);
    }

    @FXML
    private void openEditClassesListWindow() {

        // The method opens new window for editing a classes list

        openNewWindow("Edytuj listę zajęć", "/edit-classes-list.fxml",300,275);
    }

    @FXML
    private void openAddClassroomsListWindow() {

        // The method opens new window for adding new classrooms list

        openNewWindow("Dodaj listę sal", "/add-classrooms-list.fxml",300,275);
    }

    @FXML
    private void openEditClassroomsListWindow() {

        // The method opens new window for editing a classrooms list

        openNewWindow("Edytuj listę sal", "/edit-classrooms-list.fxml",300,275);
    }

    private void openNewWindow(String title, String path, int width, int height) {

        // The method opens new window for given path with given title and window dimensions.
        // New window is offset against its parent window.

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(path));
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            Stage parentStage = (Stage) mainPane.getScene().getWindow();
            stage.initOwner(parentStage);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.setX(parentStage.getX() + 50);
            stage.setY(parentStage.getY() + 50);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setHoursMinutesFormat(TextField textField) {

        // The method sets text field format as HH:mm

        textField.setTextFormatter(new TextFormatter<>(new DateStringConverter(new SimpleDateFormat("HH:mm"))));
    }
}
