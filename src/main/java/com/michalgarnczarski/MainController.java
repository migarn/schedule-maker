package com.michalgarnczarski;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    GridPane mainPane;
    @FXML
    Button addClassesListButton;

    public void initialize() {

    }

    @FXML
    private void openAddClassesListWindow() {
        openNewWindow("Dodaj listę zajęć", "/add-classes-list.fxml",300,275);

    }

    private void openNewWindow(String title, String path, int width, int height) {
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
}
