/*
 * Ferdouz Allie 214038033
 * New Updated version of last github upload
 * Javafx version of create account
 * Create Account Scene will contaim GUI elements 
 */
package createaccountscene;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;


public class CreateAccountGUI {
 
Scene createAccount;
GridPane Account_grid;

Label lblFirstName;
Label lblLastName;

Label lblEmail;
Label lblPassword;
Label lblStudentNum;

Button btnCreateAcc;
Button btnToSignIn;

TextField txtFirstName;
TextField txtLastName;
TextField txtEmail;

TextField txtPassword;
TextField txtStudentNum;

public void setCreateAccountGUI(){
    
    GridPane Account_grid = new GridPane();
    Scene createAccount = new Scene(Account_grid , 600,550);

    Label lblFirstName = new Label("First Name");
    Label lblLastName = new Label("Last Name: ");
    Label lblEmail = new Label("Email: ");
    Label lblPassword = new Label("Password: ");
    Label lblStudentNum = new Label("Student Number: ");

    TextField txtFirstName = new TextField();
    TextField txtLastName = new TextField();
    TextField txtEmail = new TextField();
    TextField txtPassword = new TextField();
    TextField txtStudentNum = new TextField();

    //stylizing of GUI still in progress


        Button btnCreateAccount = new Button("Create Account");
        Button btnToSignIn = new Button("Sign In");
    }
}


   
    
    