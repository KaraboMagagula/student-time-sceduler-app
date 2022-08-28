/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 *
 * @author Hanno
 */
public class AddingEvent {
      // Stage window;
    Scene addingEvent;
    GridPane addingEvent_Grid;


    Label lblAddingEvent_Heading, lblAddingEvent_Type, lblAddingEvent_Date, lblAddingEvent_Start,
            lblAddingEvent_End, lblAddingEvent_Repeat, lblAddingEvent_Reminder, lblAddingEvent_Priority,
            lblAddingEvent_Description, lblAddingEvent_EventName, lblAddingEvent_Min, lblbAddingEvent_Start2,
            lblAddingEvent_End2;
    Button btnAddingEvent_Cancel,btnAddingEvent_Save;
    TextField txtAddingEvent_EventName;
    ComboBox cmbAddingEvent_Type, cmbAddingEvent_Start, cmbAddingEvent_End;
    ColorPicker clpAddingEvent_Color;
    DatePicker dtpAddingEvent_Date;
    Spinner spnAddingEvent_Reminder, spnAddingEvent_Priority, spnAddingEvent_StartHours, spnAddingEvent_StartMin,
            spnAddingEvent_EndHours, spnAddingEvent_EndMin ;
    TextArea txtaAddingEvent_Description;

    public void setAddingEvent_GUI(){
        addingEvent_Grid = new GridPane();
        //bPane = new BorderPane();
        addingEvent = new Scene(addingEvent_Grid, 600,550);

        //respective classes/nodes
        lblAddingEvent_Heading = new Label("New Event");
        lblAddingEvent_EventName = new Label("Event name: ");
        lblAddingEvent_Type = new Label("Event Type: ");
        lblAddingEvent_Date = new Label("Date: ");
        lblAddingEvent_Start = new Label("Start: ");
        lblAddingEvent_End = new Label("End: ");
        lblAddingEvent_Repeat = new Label("Repeat: ");
        lblAddingEvent_Reminder = new Label("Reminder: ");
        lblAddingEvent_Priority = new Label("Priority: ");
        lblAddingEvent_Description = new Label("Description: ");
        lblAddingEvent_Min = new Label("min's");
        lblAddingEvent_End2 = new Label(":");
        lblbAddingEvent_Start2 = new Label(":");

        btnAddingEvent_Cancel = new Button("Cancel");
        btnAddingEvent_Save = new Button("Save Event");

        txtAddingEvent_EventName = new TextField();

        String arrType[] = {"Custom", "Study", "Assessment", "Assignment", "Class"};
        cmbAddingEvent_Type = new ComboBox();
        cmbAddingEvent_Type.getItems().addAll(arrType);
        cmbAddingEvent_Start = new ComboBox();
        cmbAddingEvent_Start.getItems().addAll("AM", "PM");
        cmbAddingEvent_End = new ComboBox();
        cmbAddingEvent_End.getItems().addAll("AM", "PM");

        dtpAddingEvent_Date = new DatePicker();

        spnAddingEvent_Reminder = new Spinner<>(0,60,0,5);
        spnAddingEvent_Priority = new Spinner<>(1,10,0,1);
        spnAddingEvent_StartHours = new Spinner<>(1,12,0,1);
        spnAddingEvent_EndHours = new Spinner<>(1,12,0,1);
        spnAddingEvent_StartMin = new Spinner<>(0,60,0,1);
        spnAddingEvent_EndMin = new Spinner<>(0,60,0,1);

        txtaAddingEvent_Description = new TextArea();

        setAddingEvent_Grid();
        setAddingEvent_CSS();
        functionality();
    }

    public void setAddingEvent_CSS() {
        addingEvent_Grid.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, CornerRadii.EMPTY, Insets.EMPTY)));
        addingEvent_Grid.setHgap(10);
        addingEvent_Grid.setVgap(10);
        Font f1 = new Font("Serif",  20);
        Font f2 = new Font("Serif",  14);
        lblAddingEvent_Heading.setFont(f1);
        lblAddingEvent_Heading.setTextFill(Color.CRIMSON);
        lblAddingEvent_EventName.setFont(f2);
        lblAddingEvent_Type.setFont(f2);
        lblAddingEvent_Date.setFont(f2);
        lblAddingEvent_Start.setFont(f2);
        lblAddingEvent_End.setFont(f2);
        lblAddingEvent_Repeat.setFont(f2);
        lblAddingEvent_Reminder.setFont(f2);
        lblAddingEvent_Priority.setFont(f2);
        lblAddingEvent_Description.setFont(f2);
        lblAddingEvent_Min.setFont(f2);
        lblAddingEvent_End2.setFont(f2);
        lblbAddingEvent_Start2.setFont(f2);

    }

    public void setAddingEvent_Grid (){
        addingEvent_Grid.setAlignment(Pos.TOP_CENTER);
        addingEvent_Grid.add(lblAddingEvent_Heading, 0, 0, 1, 1);
        // lblAddingEvent_Heading.setAlignment(Pos.TOP_CENTER);
        addingEvent_Grid.add(lblAddingEvent_EventName,0,1,1,1);
        addingEvent_Grid.add(txtAddingEvent_EventName,1,1,1,1);

        addingEvent_Grid.add(lblAddingEvent_Type,0,2,1,1);
        addingEvent_Grid.add(cmbAddingEvent_Type,1,2,1,1);

        addingEvent_Grid.add(lblAddingEvent_Date,0,3,1,1);
        addingEvent_Grid.add(dtpAddingEvent_Date,1,3,1,1);

        addingEvent_Grid.add(lblAddingEvent_Start,0,4,1,1);
        addingEvent_Grid.add(spnAddingEvent_StartHours,1,4,1,1);
        addingEvent_Grid.add(lblbAddingEvent_Start2,2,4,1,1);
        addingEvent_Grid.add(spnAddingEvent_StartMin,3,4,1,1);
        addingEvent_Grid.add(cmbAddingEvent_Start,4,4,1,1);

        addingEvent_Grid.add(lblAddingEvent_End,0,5,1,1);
        addingEvent_Grid.add(spnAddingEvent_EndHours,1,5,1,1);
        addingEvent_Grid.add(lblAddingEvent_End2,2,5,1,1);
        addingEvent_Grid.add(spnAddingEvent_EndMin,3,5,1,1);
        addingEvent_Grid.add(cmbAddingEvent_End,4,5,1,1);

        addingEvent_Grid.add(lblAddingEvent_Reminder,0,6,1,1);
        addingEvent_Grid.add(spnAddingEvent_Reminder,1,6,1,1);
        addingEvent_Grid.add(lblAddingEvent_Min,2,6,1,1);

        addingEvent_Grid.add(lblAddingEvent_Priority,0,7,1,1);
        addingEvent_Grid.add(spnAddingEvent_Priority,1,7,1,1);

        addingEvent_Grid.add(lblAddingEvent_Description,0,8,1,1);

        addingEvent_Grid.add(txtaAddingEvent_Description,0,9,5,5);

        addingEvent_Grid.add(btnAddingEvent_Save,0,14,1,1);
        addingEvent_Grid.add(btnAddingEvent_Cancel,1,14,1,1);

    }

    public void functionality(){
        btnAddingEvent_Cancel.setOnAction(e-> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("You clicked on the cancel button");
           // alert.getDialogPane().setExpandableContent(new TextArea("you clicked the cancel button"));
            alert.showAndWait();
            System.exit(0);
        } );

        btnAddingEvent_Save.setOnAction(e -> {
            validation();
        });

    }

    public void validation(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        if (txtAddingEvent_EventName.getText().equals("")){
            alert.setTitle("error");
            alert.setHeaderText("Event name must be entered");
            alert.showAndWait();
            txtAddingEvent_EventName.requestFocus();
        } else if (cmbAddingEvent_Type.getValue() == null) {
            alert.setTitle("error");
            alert.setHeaderText("Event type needs to be selected");
            alert.showAndWait();
            cmbAddingEvent_Type.requestFocus();
        } else if (dtpAddingEvent_Date.getValue() == null) {
            alert.setTitle("error");
            alert.setHeaderText("Date needs to be selected");
            alert.showAndWait();
            dtpAddingEvent_Date.requestFocus();
        } else if (spnAddingEvent_Reminder.getValue().equals(0)) {
            alert.setTitle("error");
            alert.setHeaderText("Reminder cannot be 0 min's ");
            alert.showAndWait();
            spnAddingEvent_Reminder.requestFocus();
        }
    }

    public String getTitle(){
        return "Adding new Event";
    }
}
