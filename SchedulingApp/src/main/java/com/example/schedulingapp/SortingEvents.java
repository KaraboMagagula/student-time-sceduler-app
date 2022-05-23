package za.ac.cput.sortingevents;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class SortingEvents extends Application {
    Stage window;
    Button exitButton;

    TableView<Events> table;


    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        window.setTitle("Sorting Events Scene");

        window.setOnCloseRequest(e -> closeApp());


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

/////// Adding

        Menu sortMenu = new Menu("Sort By:");

////Menu Items

        sortMenu.getItems().add(new MenuItem("Ascending Order"));
        sortMenu.getItems().add(new MenuItem("Descending Order"));
        sortMenu.getItems().add(new MenuItem("Due Date"));
        sortMenu.getItems().add(new MenuItem("Event Name"));
        sortMenu.getItems().add(new MenuItem("Event Type"));

/////MenuBar

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(sortMenu);


/////Exit Button
        exitButton = new Button("Exit");
        exitButton.setOnAction(e -> closeApp());


///////Setting up the VBox

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table,menuBar,exitButton);
////
        Scene scene = new Scene(vBox,700, 400);
        window.setScene(scene);
        window.show();


    }
/////Closing App Method
    public void closeApp(){
        Boolean result = ConfirmBox.display("Close Application", "Do you want to exit ?");
        if(result)
            window.close();
    }


    //Calling the Events Class
    public ObservableList<Events> getEvents(){
        ObservableList<Events> events = FXCollections.observableArrayList();
        events.add(new Events("Applications Development Practice","Test","21-06-22", new CheckBox() ));
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