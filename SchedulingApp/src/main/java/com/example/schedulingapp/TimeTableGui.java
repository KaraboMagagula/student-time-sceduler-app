package com.example.timetable;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TimeTableGui extends Application {
    //Ferdouz's code
    //This is my first GUI attempt using the BorderPane,StackPane,VBox and HBox
    Button btn;
    public static void main(String[] args) {
        launch(args);
    }
        @Override
        public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is my Timetable title");
        HBox topMenu = new HBox();
        Button btnA = new Button("File");
        Button btnB = new Button("Edit");
        Button btnC = new Button("View");
        topMenu.getChildren().addAll(btnA,btnB,btnC);

            VBox BottomMenu = new VBox();
            Button btnD = new Button("Save");
            Button btnE = new Button("Clear");
            Button btnF = new Button("Cancel");
            BottomMenu.getChildren().addAll(btnD,btnE,btnF);

            BorderPane bPane = new BorderPane();
            bPane.setTop(topMenu);
            bPane.setBottom(BottomMenu);


        Scene scene = new Scene(bPane,300,450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}