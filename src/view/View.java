package view;


public interface View{
	public void displayData(Object data);
	public void loadLevel(String fileName);
	public void saveLevel(String fileNAme);
	public void closeLevel();
	public void closeProgram();
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
//	public CommandType getUserCommand();
}
