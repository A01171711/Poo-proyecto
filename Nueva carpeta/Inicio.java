import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.geometry.Insets;

public class Inicio extends Scene {
private Main main;
private Button bt= new Button("Inicio"); 
	
	private MainGameScene scene;
public Inicio(Main main){

	super(new HBox(),700, 700);
		this.scene=scene;
		this.main=main;
		
		HBox hb=(HBox)super.getRoot();
		hb.setStyle("-fx-background-image:url('assets/inicio.png');");
		hb.getChildren().add(bt);
		hb.setMargin(bt, new Insets(500,0,0,320));


		bt.setOnAction(new EventHandler<ActionEvent>() {
    @Override public void handle(ActionEvent e) {
        main.enterCharacterSelection();
    }
});

}

}