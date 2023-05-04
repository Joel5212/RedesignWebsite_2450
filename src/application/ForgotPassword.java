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

public class ForgotPassword{
	public static Scene forgotPasswordScene(Stage primaryStage)
	{

		
		
		Label title = new Label("Forgot Password");
		
     
        title.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		title.setFont(new Font(20));
		
		Label usernameLbl = new Label("Email:");
	    usernameLbl.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
	    usernameLbl.setFont(new Font(13));

	    TextField usernameTxtField = new TextField();
	    
	    HBox hbox1 = new HBox(usernameLbl, usernameTxtField);
        
		Button btnSignIn = new Button("Send");
      
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
        	Scene scene = Login.loginScene(primaryStage);
        	primaryStage.setScene(scene);
        });
        
        createAccount.setOnMouseClicked(e -> {
        	Scene scene = CreateAccount.signInScene(primaryStage);
			primaryStage.setScene(scene);
        });
        
        btnSignIn.setOnAction(e -> {
        	String username = usernameTxtField.getText();
        	
        	if(username.isEmpty())
        	{
        		errorMessage.setText("Empty Fields");
        	}
        	else if(!username.contains("@") || !username.contains(username))
        	{
        		errorMessage.setText("Unvalid Email");
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
        		showEmailSentAlert();
        	}
		
        });

        VBox vbox= new VBox(title, hbox1, errorMessage, hbox3);
        vbox.setStyle("-fx-background-color: #000039;");
                
        vbox.setAlignment(Pos.CENTER);
        
        vbox.setMargin(title, new Insets(0, 0, 130, 0));
        vbox.setMargin(hbox1, new Insets(0, 0, 0, 220));
        vbox.setMargin(hbox3, new Insets(70, 0, 0, 260));
        vbox.setMargin(errorMessage, new Insets(50, 0, 0, 0));
        
        Scene scene = new Scene(vbox, 650, 650);
        
        
//        scene.getStylesheets().add(Login.class.getResource("style.css").toExternalForm());

        return scene;
	}
	
	private static void showEmailSentAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Email Sent!");
		alert.setContentText("Password Reset instructions have been sent to your email");
		alert.showAndWait();
	}
}