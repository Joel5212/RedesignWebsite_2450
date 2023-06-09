package application;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login{
	public static Scene loginScene(Stage primaryStage)
	{

		ArrayList<String> usernames = new ArrayList<String>();
		usernames.add("hello22");
		usernames.add("hello33");
		
		ArrayList<String> passwords = new ArrayList<String>();
		passwords.add("12345678");
		passwords.add("8321");
		
		Label title = new Label("Welcome to Hacker News");
		
     
        title.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		title.setFont(new Font(20));
		
		Label usernameLbl = new Label("Username:");
	    usernameLbl.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
	    usernameLbl.setFont(new Font(13));

	    TextField usernameTxtField = new TextField();
	    
	    HBox hbox1 = new HBox(usernameLbl, usernameTxtField);
	    
	    Label pw = new Label("Password:");
	    pw.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
	    pw.setFont(new Font(13));
	    
		PasswordField pwBox = new PasswordField();
		
		HBox hbox2 = new HBox(pw, pwBox);
        
		Button btnSignIn = new Button("Sign In");
      
        Button btnBack = new Button("Back");
        
        Text errorMessage = new Text();
        errorMessage.setFill(Color.FIREBRICK);
        errorMessage.setFont(new Font(13));
        
        Label forgotPassword = new Label("Forgot Password");
        forgotPassword.setStyle("-fx-text-fill:blue;");
        forgotPassword.setFont(new Font(15));
        
        Label createAccount = new Label("Create Account");
        createAccount.setStyle("-fx-text-fill:blue;");
        createAccount.setFont(new Font(15));
    
        
        HBox hbox3 = new HBox(10);
        hbox3.setSpacing(50);
        hbox3.getChildren().addAll(btnBack, btnSignIn);
    
        
        btnBack.setOnAction(e -> {
        	Scene scene = null;
			try {
				scene = MainPage.mainPageScene(primaryStage);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	primaryStage.setScene(scene);
        });
        
        createAccount.setOnMouseClicked(e -> {
        	Scene scene = CreateAccount.signInScene(primaryStage);
			primaryStage.setScene(scene);
        });
        
        forgotPassword.setOnMouseClicked(e -> {
        	Scene scene = ForgotPassword.forgotPasswordScene(primaryStage);
			primaryStage.setScene(scene);
        });
        
        btnSignIn.setOnAction(e -> {
        	String password = pwBox.getText();
        	String username = usernameTxtField.getText();
        	System.out.println(password);
        	boolean condition = ((usernames.contains("hello22") || usernames.contains("hello33")) && (password.contains("123") || passwords.contains("hello22")));
        	
        	if(username.isEmpty() || password.isEmpty())
        	{
        		errorMessage.setText("Empty Fields");
        	}
        	else if(password.length() < 8)
        	{
        		errorMessage.setText("Password has to be at least 8 character please try again");
        	}
        	else if(!condition)
        	{
        		errorMessage.setText("Incorrect Login/Username");
        	}
        	else
        	{
        		Scene scene = null;
				try {
					scene = MainPage.mainPageScene(primaryStage);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		primaryStage.setScene(scene);
        		showLoggedInAlert();
        	}
		
        });

        VBox vbox= new VBox(title, hbox1, hbox2, errorMessage, hbox3, forgotPassword, createAccount);
        vbox.setStyle("-fx-background-color: #000039;");
                
        vbox.setAlignment(Pos.CENTER);
        
        vbox.setMargin(title, new Insets(0, 0, 130, 0));
        vbox.setMargin(hbox1, new Insets(0, 0, 0, 220));
        vbox.setMargin(hbox2, new Insets(30, 0, 0, 220));
        vbox.setMargin(hbox3, new Insets(70, 0, 0, 260));
        vbox.setMargin(forgotPassword, new Insets(70, 0, 0, 0));
        vbox.setMargin(errorMessage, new Insets(70, 0, 0, 0));
        vbox.setMargin(createAccount, new Insets(20, 0, 0, 0));
        
        Scene scene = new Scene(vbox, 650, 650);
        
        
//        scene.getStylesheets().add(Login.class.getResource("style.css").toExternalForm());

        return scene;
	}
	
	private static void showLoggedInAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Successful!");
		alert.setContentText("Successfully Logged In!");
		alert.showAndWait();
	}
	
}