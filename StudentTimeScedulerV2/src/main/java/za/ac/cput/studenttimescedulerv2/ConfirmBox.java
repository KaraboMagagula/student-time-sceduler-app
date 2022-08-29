/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.geometry.*;

//cebisani's
public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(600);
        window.setMinHeight(300);
        window.setTitle(title);
//Creating Two buttons
        Button trueBtn = new Button("Yes");
        trueBtn.setAlignment(Pos.CENTER_LEFT);

        Button falseBtn = new Button("No");
        falseBtn.setAlignment(Pos.CENTER_RIGHT);

// Adding buttons onAction Event

        trueBtn.setOnAction(e -> {
            answer = true;
            window.close();
        });

        falseBtn.setOnAction(e -> {
            answer = false;
            window.close();
        });

//Setting the Label
        Label label = new Label();
        label.setText(message);



//Adding a layout

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,trueBtn,falseBtn);
        layout.setAlignment(Pos.CENTER);

// Setting the Scene

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}
