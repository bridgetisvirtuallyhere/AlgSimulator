package edu.redwoods.cis12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class LinearSearchSimulationController {
        private LinearSearchSimulation lss;

        @FXML
        private Button buttonCreateBoard;

        @FXML
        private Button buttonSimulate;

        @FXML
        private ColorPicker colorPicker;

        @FXML
        private GridPane controlsGridPane;

        @FXML
        private Label labelArraySize;

        @FXML
        private Label labelColor;

        @FXML
        private Label labelSearchFor;

        @FXML
        private TextField textFieldForArraySize;

        @FXML
        private TextField textFieldForSearchFor;

        @FXML
        void createBoardButtonPressed(ActionEvent event) {
            try {
                this.lss.createBoard(
                        Integer.parseInt(
                                this.textFieldForArraySize.getText()), this.colorPicker.getValue());
            } catch (NumberFormatException nfe) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Invalid Input");
                a.setContentText("Please set an \"Array Size\"");
                a.show();
            }
        }

        @FXML
        void simulateButtonPressed(ActionEvent event) {
            this.lss.simulate();
        }

    public void setLss(LinearSearchSimulation lss) {
        this.lss = lss;
    }

    public TextField textFieldForSearchFor() {
        return textFieldForSearchFor;
    }

    }


