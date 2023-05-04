package application;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.*;
import java.util.ArrayList;

public class MainMenu extends Application
{
	public static void main(String[] args)
	{
		//launch the application
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		TextField searchBar = new TextField();
		searchBar.setStyle("-fx-font-family: monospace;");
		
		Label news1 = new Label("Local drunkard loses debate");
		news1.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news1.setFont(new Font(15));;
		Label news2 = new Label("Father of three too awkward to understand own daughter \n(reddit.com)");
		news2.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news2.setFont(new Font(15));;
		Label news3 = new Label("The \"baseline\" scene in bladerunner 2049 was written by Ryan \nGosling (cohost.org)");
		news3.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news3.setFont(new Font(15));;
		Label news4 = new Label("Agile soccer skills for a bipedal robot with deep \nreinforcement learning (twitter.com/haarnoja)");
		news4.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news4.setFont(new Font(15));;
		Label news5 = new Label("The money spent on lotteries doesn’t go to the park \n(outdoorstatus.com)");
		news5.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news5.setFont(new Font(15));;
		Label news6 = new Label("Scaling up the Prime Video audio/video \nmonitoring service and reducing costs (primevideotech.com)");
		news6.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		news6.setFont(new Font(15));;
		
		Image i1 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Overconfident Alcoholic.jpg");
		ImageView iv1 = new ImageView(i1);
		iv1.setFitWidth(100);
		iv1.setPreserveRatio(true);
		Image i2 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Rex and Glimmer.jpg");
		ImageView iv2 = new ImageView(i2);
		iv2.setFitWidth(100);
		iv2.setPreserveRatio(true);
		Image i3 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Blade Runner Meme.jpg");
		ImageView iv3 = new ImageView(i3);
		iv3.setFitWidth(100);
		iv3.setPreserveRatio(true);
		Image i4 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Robots Playing Soccer.jpg");
		ImageView iv4 = new ImageView(i4);
		iv4.setFitWidth(100);
		iv4.setPreserveRatio(true);
		Image i5 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Lotto.jpg");
		ImageView iv5 = new ImageView(i5);
		iv5.setFitWidth(100);
		iv5.setPreserveRatio(true);
		Image i6 = new Image("C:\\Users\\Azu\\Pictures\\Test Images\\Prime Video.png");
		ImageView iv6 = new ImageView(i6);
		iv6.setFitWidth(100);
		iv6.setPreserveRatio(true);
		
		Label title = new Label("Hacker News");
		title.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		title.setFont(new Font(15));;
		title.setUnderline(true);
		Label sections = new Label("Sections");
		sections.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		sections.setFont(new Font(15));;
		sections.setUnderline(true);
		Label login = new Label("Login");
		login.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		login.setFont(new Font(15));;
		login.setUnderline(true);
		Label comments = new Label("Comments");
		comments.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill:white;");
		comments.setFont(new Font(15));;
		comments.setUnderline(true);
		
/**		
		ScrollBar s = new ScrollBar();
		s.setOrientation(Orientation.VERTICAL);
*/		
		
		ArrayList<Label> news = new ArrayList<>();
		Collections.addAll(news, news1, news2, news3, news4, news5, news6);
		
		ArrayList<ImageView> images = new ArrayList<>();
		Collections.addAll(images, iv1, iv2, iv3, iv4, iv5, iv6);
		
		//HBox menu = new HBox(10, title, sections, login);
		HBox hbox1 = new HBox(10, news1, iv1);
		HBox hbox2 = new HBox(10, news2, iv2);
		HBox hbox3 = new HBox(10, news3, iv3);
		HBox hbox4 = new HBox(10, news4, iv4);
		
		BorderPane menu = new BorderPane();
		menu.setLeft(title);
		menu.setCenter(sections);
		menu.setRight(login);
		
		BorderPane test1 = new BorderPane();
		test1.setLeft(news1);
		test1.setRight(iv1);
		test1.setBottom(comments);
		
		BorderPane test2 = new BorderPane();
		test2.setLeft(news2);
		test2.setRight(iv2);
		test2.setBottom(comments);
		
		BorderPane test3 = new BorderPane();
		test3.setLeft(news3);
		test3.setRight(iv3);
		test3.setBottom(comments);
		
		BorderPane test4 = new BorderPane();
		test4.setLeft(news4);
		test4.setRight(iv4);
		test4.setBottom(comments);
		
		BorderPane test5 = new BorderPane();
		test5.setLeft(news5);
		test5.setRight(iv5);
		test5.setBottom(comments);
		
		BorderPane test6 = new BorderPane();
		test6.setLeft(news6);
		test6.setRight(iv6);
		test6.setBottom(comments);
		
		//VBox vbox = new VBox(10, searchBar, hbox1, hbox2, hbox3, hbox4);
		VBox vbox = new VBox(10, menu, test1, test2, test3, test4, test5, test6);
		vbox.setStyle("-fx-background-color: #000039;");
		
		ScrollPane sp = new ScrollPane(vbox);
		sp.setPrefHeight(650);
		sp.setPrefWidth(650);
		sp.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
		sp.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
		
		BorderPane root = new BorderPane();
		root.setTop(searchBar);
		root.setCenter(vbox);
		//root.setStyle("-fx-background-color: #000039");
		
		Scene frontPage = new Scene(root, 650, 650);
		//scene.setFill(Color.web("#000039"));
		primaryStage.setTitle("Hacker News");
		primaryStage.setScene(frontPage);
		primaryStage.show();
		
		searchBar.setOnAction(e ->
		{
			String lowerCaseFilter = searchBar.getText().toLowerCase();
			for(Label element: news)
			{
				element.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: black;");
				//item.setOpacity(50);
				//element.setVisible(false);
				//item.setVisible(false);
				
				if(element.getText().toLowerCase().contains(lowerCaseFilter))
				{
					element.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
					//item.setOpacity(100);
					//item.setVisible(true);
				}
			}
			searchBar.clear();
		});
		
		sections.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			sections.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
		});
		
		sections.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			sections.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
		});
		
		sections.setOnMouseClicked(e ->
		{
			
		});
		
		login.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			login.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
		});
		
		login.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			login.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");;
		});
		
		login.setOnMouseClicked(e ->
		{
			
		});
		
		comments.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			comments.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
		});
		
		comments.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			comments.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");;
		});
		
		comments.setOnMouseClicked(e ->
		{
			
		});
		
		news1.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news1.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news1.setUnderline(true);
		});
		
		news1.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news1.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news1.setUnderline(false);
		});
		
		news1.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://imgflip.com/memegenerator/19562727/Overconfident-Alcoholic-Depression-Guy");
		});
		
		news2.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news2.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news2.setUnderline(true);
		});
		
		news2.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news2.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news2.setUnderline(false);
		});
		
		news2.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://www.reddit.com/r/Xenoblade_Chronicles/comments/12yf1se/rex_and_glimmer_campsite_interaction_thats_shulk/");
		});
		
		news3.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news3.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news3.setUnderline(true);
		});
		
		news3.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news3.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news3.setUnderline(false);
		});
		
		news3.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://cohost.org/mcc/post/178201-the-baseline-scene");
		});
		
		news4.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news4.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news4.setUnderline(true);
		});
		
		news4.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news4.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news4.setUnderline(false);
		});
		
		news4.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://twitter.com/haarnoja/status/1651577815836270596");
		});
		
		news5.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news5.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news5.setUnderline(true);
		});
		
		news5.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news5.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news5.setUnderline(false);
		});
		
		news5.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://outdoorstatus.com/articles/recreation-gov-lottery-fees/");
		});
		
		news6.setOnMouseEntered(e -> 
		{
			frontPage.setCursor(Cursor.HAND);
			news6.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: red;");
			news6.setUnderline(true);
		});
		
		news6.setOnMouseExited(e -> 
		{
			frontPage.setCursor(Cursor.DEFAULT);
			news6.setStyle("-fx-font-weight: bold; -fx-font-family: monospace; -fx-text-fill: white;");
			news6.setUnderline(false);
		});
		
		news6.setOnMouseClicked(e ->
		{
			getHostServices().showDocument("https://www.primevideotech.com/video-streaming/scaling-up-the-prime-video-audio-video-monitoring-service-and-reducing-costs-by-90");
		});
		
	}
}
