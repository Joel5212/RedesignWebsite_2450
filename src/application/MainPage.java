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
import javafx.stage.Stage;
import application.NewsSections;

public class MainPage{
	
	
	public static Scene mainPageScene(Stage primaryStage) throws FileNotFoundException
	{
		
		Label title = new Label("Hacker News");
		Label sections = new Label("Sections");
		Label login = new Label("LOGIN");
		
		Image image = new Image(new FileInputStream("C:\\Users\\joelj\\eclipse-workspace\\RedesignWebsite_2450\\resources\\hamburger_icon2.png"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(50); 
	    imageView.setFitWidth(50);
	    
	    imageView.setOnMouseClicked(e ->{
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
		
		HBox hbox = new HBox(sections, imageView, title, login);
		hbox.setAlignment(Pos.CENTER);
		hbox.setMargin(imageView, new Insets(0, 200, 0, 0));
		hbox.setMargin(title, new Insets(0, 240, 0, 0));
		
		BorderPane root = new BorderPane();
		root.setTop(hbox);
		
		Scene scene = new Scene(root,650,650);
		
		return scene;
		
	}
}