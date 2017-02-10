package view;

import java.io.File;
import java.nio.file.Paths;
//import java.io.IOException;
import java.util.LinkedList;
import java.util.Observable;

import com.sun.medialib.mlib.Image;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.*;
import model.data.Element;

public class MainWindowController extends Observable implements View{
	private LinkedList<String> args = new LinkedList<String>();

	@FXML
	private AnchorPane root;
	@FXML
	private Menu fileMenu;
	@FXML
	private MenuItem loadLevelButton;
	@FXML
	private MenuItem saveLevelButton;
	@FXML
	private Menu levelMenu;
	@FXML
	private MenuItem closeLevelButton;
	@FXML
	private Button closeProgramButton;
	@FXML
	private Canvas grid;


	//	public MainWindowController(){
	//		args = new LinkedList<String>();
	//	}

	@FXML
	public void closeProgram(){
		args.add("Exit");
		notifyObservers(args);
		args = new LinkedList<String>();
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


	public void loadLevel(String fileName){
		args.add("Load");
		args.add(fileName);
		notifyObservers(args);
		args = new LinkedList<String>();
	}

	public void saveLevel(String fileName){
		args.add("Load");
		args.add(fileName);
		notifyObservers(args);
		args = new LinkedList<String>();
	}


	@FXML
	public void closeLevel(){
		args.add("Load");
		args.add(null);
		notifyObservers(args);
		args = new LinkedList<String>();
	}


	@FXML
	public void moveUp(){
		args.add("Move");
		args.add("up");
		notifyObservers(args);
		args = new LinkedList<String>();
	}

	@FXML
	public void moveDown(){
		args.add("Move");
		args.add("down");
		notifyObservers(args);
		args = new LinkedList<String>();
	}

	@FXML
	public void moveLeft(){
		args.add("Move");
		args.add("left");
		notifyObservers(args);
		args = new LinkedList<String>();
	}

	@FXML
	public void moveRight(){
		args.add("Move");
		args.add("right");
		notifyObservers(args);
		args = new LinkedList<String>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void displayData(Object data) {
		
		GraphicsContext gc = grid.getGraphicsContext2D();
		int canvasWidth = ((ArrayList<ArrayList<Element>>)data).get(0).size()*100;
		int canvasHeight = ((ArrayList<ArrayList<Element>>)data).size()*100;
		for (int i = 0; i < canvasHeight ; i += 100) { // 100 represents the width in pixels between each line of the grid
			for(int j = 0 ; j < canvasWidth ; j += 100){
//				gc.moveTo(i, j);
				gc.drawImage(((ArrayList<ArrayList<Element>>)data).get(i).get(j).getImage(), i, j);
			}
		}
		gc.save();
//		ctx.strokeStyle = 'hsla(200, 0%, 20%, 0.8)';
		gc.stroke();
		gc.restore();
	}

	//	@FXML
	//	public TitledPane getRoot(){
	////		System.out.println(root.toString());
	//		return root;
	//	}



}
