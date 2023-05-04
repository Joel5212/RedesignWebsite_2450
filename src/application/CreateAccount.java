package application;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CreateAccount{
	public static Scene signInScene(Stage primaryStage)
	{

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: #000039;");
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Label title = new Label("Welcome to Hacker News");
        grid.setMargin(title, new Insets(0, 0, 0, 15));
        
		title.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		title.setFont(new Font(20));
		grid.add(title, 0, 0, 2, 1);

        Label firstName = new Label("First Name:");
        firstName.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		firstName.setFont(new Font(13));
		grid.add(firstName, 0, 1);

        TextField firstNameTextField = new TextField();
        grid.add(firstNameTextField, 1, 1);

        Label lastName = new Label("Last Name:");
        lastName.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		lastName.setFont(new Font(13));
        grid.add(lastName, 0, 2);

        TextField lastNameTextField = new TextField();
        grid.add(lastNameTextField, 1, 2);

        Label age = new Label("Age:");
        age.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		age.setFont(new Font(13));
        grid.add(age, 0, 3);

        TextField ageTextField = new TextField();
        grid.add(ageTextField, 1, 3);

        Label email = new Label("Email Address:");
        email.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		email.setFont(new Font(10));
        grid.add(email, 0, 4);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 4);

        Label phone = new Label("Phone Number:");
        phone.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		phone.setFont(new Font(13));
        grid.add(phone, 0, 5);

        TextField phoneTextField = new TextField();
        grid.add(phoneTextField, 1, 5);

        Label pw = new Label("Password:");
        pw.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		pw.setFont(new Font(13));
        grid.add(pw, 0, 6);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 6);

        Label pw2 = new Label("Confirm Password:");
        pw2.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		pw2.setFont(new Font(13));
        grid.add(pw2, 0, 7);

        PasswordField pwBox2 = new PasswordField();
        grid.add(pwBox2, 1, 7);

        Button btnSignIn = new Button("Create Account");
        grid.add(btnSignIn, 1, 9);
        
        Button btnBack = new Button("Back");
        grid.add(btnBack, 0, 9);
        
//        HBox hbBtn = new HBox(10);
//        hbBtn.setSpacing(75);
//        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
//        hbBtn.getChildren().addAll(btnBack, btnSignIn);
//        grid.add(hbBtn, 1, 8);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 10);
        grid.setMargin(actiontarget, new Insets(100, 0, 0, 0));

        btnSignIn.setOnAction(e -> {
            if (firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() || ageTextField.getText().isEmpty() 
                    || emailTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() || pwBox.getText().isEmpty() || pwBox2.getText().isEmpty()) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Please fill in all fields.");
            }
            else if(!pwBox.getText().equals(pwBox2.getText())) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Passwords do not match.");
            }
            else if(pwBox.getText().length() < 8){
            	actiontarget.setText("Password has to be at least 8 characters");
            }
            else {
            	Scene scene = Login.loginScene(primaryStage);
            	primaryStage.setScene(scene);
                showCreatedAccountAlert();
            }
        });
        
        btnBack.setOnAction(e -> {
        	Scene scene = Login.loginScene(primaryStage);
        	primaryStage.setScene(scene);
        });

        grid.setMargin(btnBack, new Insets(0, 0, 0, 30));
        grid.setMargin(btnSignIn, new Insets(0, 0, 0, 30));
        
        Scene scene = new Scene(grid, 650, 650);

        return scene;
	}
	
	private static void showCreatedAccountAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Successful!");
		alert.setContentText("Successfully Created An Account!");
		alert.showAndWait();
	}
}