import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.input.*;

public class CharacterSelection extends Scene{
	private Main main;
	public CharacterSelection(Main main){
		super(new GridPane(),1200,400);
		this.main=main;
		GridPane gridPane= (GridPane)super.getRoot();
		gridPane.setGridLinesVisible(true);
		Button pugButton= new Button("");
		pugButton.setStyle("-fx-background-image:url('assets/pugoSelect.png');");
		pugButton.setMinHeight(400);
		pugButton.setMinWidth(400);
		pugButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				PerrosSuper ps= new Pug();
				main.setPerrosSuper(ps);
				main.openGame();

			}
		});
		Button huskyButton= new Button("");
		huskyButton.setStyle("-fx-background-image:url('assets/huskySelect.png');");
		huskyButton.setMinHeight(400);
		huskyButton.setMinWidth(400);
		huskyButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				PerrosSuper ps= new Husky();
				main.setPerrosSuper(ps);
				main.openGame();

			}
		});
		Button dalmataButton= new Button("");
		dalmataButton.setStyle("-fx-background-image:url('assets/dalmataSelect.png');");
		dalmataButton.setMinHeight(400);
		dalmataButton.setMinWidth(400);
		dalmataButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				PerrosSuper ps= new Dalmata();
				main.setPerrosSuper(ps);
				main.openGame();

			}
		});

		gridPane.add(pugButton,0,0);
	  gridPane.add(huskyButton,1,0);
		gridPane.add(dalmataButton,2,0);


	}
}
