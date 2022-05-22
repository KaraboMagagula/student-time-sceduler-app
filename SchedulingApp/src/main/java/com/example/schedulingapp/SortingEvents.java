package za.ac.cput.sortingevents;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class SortingEvents extends Application {
    Stage window;

    Button sortButton;

    TableView<Events> table;


    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        window.setTitle("Sorting Events Scene");




//Setting up the table and Columns
        //Table Columns

        TableColumn <Events, String> eventNameColumn = new TableColumn<>("Event Name: ");
        eventNameColumn.setMinWidth(300);
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
/////////
        TableColumn <Events, String> eventTypeColumn = new TableColumn<>("Event Type: ");
        eventTypeColumn.setMinWidth(200);
        eventTypeColumn.setCellValueFactory(new PropertyValueFactory<>("eventType"));
/////////
        TableColumn <Events, String> eventDateColumn = new TableColumn<>("Event Date: ");
        eventDateColumn.setMinWidth(100);
        eventDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
///////
        TableColumn <Events, String> eventPriorityColumn = new TableColumn<>("Priority: ");
        eventPriorityColumn.setMinWidth(100);
        eventPriorityColumn.setCellValueFactory(new PropertyValueFactory<>("priority"));
//////////Setting the table

        table = new TableView<>();

        table.setItems(getEvents());
        table.getColumns().addAll(eventNameColumn,eventTypeColumn,eventDateColumn,eventPriorityColumn);

/////// Adding a button

        sortButton = new Button("Sort By");
        //sortButton.setAlignment(Pos.CENTER_LEFT);
        sortButton.setMinHeight(50);


///////Setting up the VBox

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table,sortButton);

        //Scene scene = new Scene(vBox,800, 600);
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();


    }

//Calling the Events Class
    public ObservableList<Events> getEvents(){
        ObservableList<Events> events = FXCollections.observableArrayList();
        events.add(new Events("Applications Development Practice","Test","21-06-22", new CheckBox()));
        events.add(new Events("Information Management","LinkedIn","29-05-22",new CheckBox()));
        events.add(new Events("Information systems","Exam","09-06-22",new CheckBox()));
        events.add(new Events("Multimedia Applications Fundamentals","Study","09-06-22",new CheckBox()));
        events.add(new Events("Professional Communications","Assignment","18-05-22",new CheckBox()));
        events.add(new Events("Applications Development Fundamentals","Tutorial","29-05-22",new CheckBox()));
        events.add(new Events("Electives - Python ","Exam","03-06-22",new CheckBox()));


        return events;

    }


    public static void main(String[] args) {

        launch(args);


    }

}