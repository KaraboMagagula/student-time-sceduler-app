package com.example.timetable;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class studentDetailsTimeTable extends Application {
    //Ferdouz's code
    //This is my second GUI attempt testing the GridPane layout
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //This code will correspond with my UX design model
        //This still needs a lot of work
        Stage window = primaryStage;
        window.setTitle("Timetable Frame");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        // The textfields and labels need to move to the bottom of the window in the scene
        Label studNameLabel = new Label("Student name:");
        GridPane.setConstraints(studNameLabel,0,0);

        TextField studNameInput = new TextField();
        GridPane.setConstraints(studNameInput,1,0);

        Label studNumLabel = new Label("Student number:");
        GridPane.setConstraints(studNumLabel,0,1);

        TextField studNumInput = new TextField();
        GridPane.setConstraints(studNumInput,1,1);
        // new schedule needs to be added
        grid.getChildren().addAll(studNameLabel,studNameInput,studNumLabel,studNumInput);
        Scene scene = new Scene(grid,300,450);
        window.setScene(scene);

        window.show();


    }
}
