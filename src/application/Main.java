package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Label title = new Label("Hacker News");
			Label sections = new Label("Sections");
			Label login = new Label("LOGIN");
			
			HBox hbox = new HBox(sections, title, login);
			hbox.setAlignment(Pos.CENTER);
			hbox.setMargin(sections, new Insets(0, 240, 0, 0));
			hbox.setMargin(title, new Insets(0, 240, 0, 0));
			
			
			 
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			
			Scene scene = new Scene(root,650,650);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
