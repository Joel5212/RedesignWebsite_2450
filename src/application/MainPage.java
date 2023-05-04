package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import application.NewsSections;
import application.CreateAccount;

public class MainPage{
	
	
	public static Scene mainPageScene(Stage primaryStage) throws FileNotFoundException
	{
		
		Label title = new Label("Hacker News");
		title.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		title.setFont(new Font(20));
		
		
		Label sections = new Label("Sections");
		sections.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		sections.setFont(new Font(15));;
		
		Label login = new Label("LOGIN");
		login.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		login.setFont(new Font(15));;
		
		
		Image imageHI = new Image(new FileInputStream("C:\\Users\\joelj\\eclipse-workspace\\RedesignWebsite_2450\\resources\\hamburger_icon.png"));
		ImageView imageViewHI = new ImageView(imageHI);
		imageViewHI.setFitHeight(25); 
	    imageViewHI.setFitWidth(25);
	    
	    Image imageLI = new Image(new FileInputStream("C:\\Users\\joelj\\eclipse-workspace\\RedesignWebsite_2450\\resources\\user_login.png"));
		ImageView imageViewLI = new ImageView(imageLI);
		imageViewLI.setFitHeight(25); 
	    imageViewLI.setFitWidth(25);
	    
	    imageViewLI.setOnMouseClicked(e -> {
	    	Scene scene = Login.loginScene(primaryStage);
			primaryStage.setScene(scene);
	    });
	    
	    imageViewLI.setOnMouseClicked(e -> {
	    	Scene scene = Login.loginScene(primaryStage);
	    	primaryStage.setScene(scene);
	    });
	    
	    
	    imageViewHI.setOnMouseClicked(e ->{
	    	Scene scene = null;
	    	try {
				scene = NewsSections.newsSectionsScene(primaryStage);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	primaryStage.setScene(scene);
	    	
	    });
	    
	    sections.setOnMouseClicked(e ->{
	    	Scene scene = null;
	    	try {
				scene = NewsSections.newsSectionsScene(primaryStage);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	primaryStage.setScene(scene);
	    });
	    
	    login.setOnMouseClicked(e -> {
	    	
	    });
		
		HBox hbox = new HBox(sections, imageViewHI, title, login, imageViewLI);
		hbox.setAlignment(Pos.CENTER);
		hbox.setMargin(imageViewHI, new Insets(0, 140, 0, 0));
		hbox.setMargin(title, new Insets(0, 200, 0, 0));
		
		BorderPane root = new BorderPane();
		root.setStyle("-fx-background-color: #000039;");
		root.setTop(hbox);
		
		Scene scene = new Scene(root,650,650);
		
		return scene;
		
	}
}