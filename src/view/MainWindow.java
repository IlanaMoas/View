package view;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class MainWindow extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			AnchorPane rootPane = null;
//			MainWindowController controller = new MainWindowController();
//			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
//			fxmlLoader.setRoot(rootPane);
	//			fxmlLoader.setController(controller);
	//			fxmlLoader.load();
			
			
//			String s = Paths.get("").toAbsolutePath().toString()+"/MainWindow.fxml";
//			System.out.println(s);
//			MainWindowController controller = new MainWindowController();
			TitledPane root = (TitledPane)FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root,400,400);
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
