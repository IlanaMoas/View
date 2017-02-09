package view;

import java.io.File;
//import java.io.IOException;
import java.util.LinkedList;
import java.util.Observable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.stage.*;

public class MainWindowController extends Observable implements View{
	private LinkedList<String> args;
	@FXML
	private TitledPane root;
	@FXML
	private Menu fileMenu;
	@FXML
	private MenuItem loadLevelButton;
	@FXML
	private MenuItem saveLevelButton;
	@FXML
	private Menu levelMenu;
	@FXML
	private Menu closeLevelButton;
	@FXML
	private Button closeProgramButton;
	

	public MainWindowController(){
		args = new LinkedList<String>();
	}
	
	@FXML
	public void closeProgram(){
		args.add("Exit");
		notifyObservers(args);
		args.clear();
	}

	@FXML
	private void openLoadLevelSysWindow(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");

		File file = fileChooser.showOpenDialog(new Stage());
		if (file != null) {

			loadLevel(file.getName());

		}
	}

	@FXML
	private void openSaveLevelSysWindow(ActionEvent event) {
		DirectoryChooser dc = new DirectoryChooser();
		File file = dc.showDialog(null);
		if (file != null) {
			saveLevel(file.getName());
		}
	}

	//	public void openLoadLevelSysWindow(){
	//		
	//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoadLevelFxmlFile.fxml"));
	//		Parent root = null;
	//		try {
	//			root = fxmlLoader.load();
	//			Stage stage = new Stage();
	//			stage.initModality(Modality.APPLICATION_MODAL);
	//			stage.setOpacity(1);
	//			stage.setTitle("Load new level");
	//			stage.setScene(new Scene(root, 450, 450));
	//			
	//			stage.showAndWait();
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		}
	//		
	//		
	//	}

	public void loadLevel(String fileName){
		args.add("Load");
		args.add(fileName);
		notifyObservers(args);
		args.clear();
	}

	public void saveLevel(String fileName){
		args.add("Load");
		args.add(fileName);
		notifyObservers(args);
		args.clear();
	}


	@FXML
	public void closeLevel(){
		args.add("Load");
		args.add(null);
		notifyObservers(args);
		args.clear();
	}


	@FXML
	public void moveUp(){
		args.add("Move");
		args.add("up");
		notifyObservers(args);
		args.clear();
	}
	
	@FXML
	public void moveDown(){
		args.add("Move");
		args.add("down");
		notifyObservers(args);
		args.clear();
	}
	
	@FXML
	public void moveLeft(){
		args.add("Move");
		args.add("left");
		notifyObservers(args);
		args.clear();
	}
	
	@FXML
	public void moveRight(){
		args.add("Move");
		args.add("right");
		notifyObservers(args);
		args.clear();
	}

	@Override
	public void displayData(Object data) {
		// TODO Auto-generated method stub

	}


}
