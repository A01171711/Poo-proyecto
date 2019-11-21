import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;



public class Sorpresa extends Scene {
	private PerrosSuper personaje1;
	private Rotweiller r;
	private Main main;
	private Objeto objeto;
	private MainGameScene scene;
	private Label popo= new Label("Esto es una sorpresa, elije un boton para continuar");
	private Button perro= new Button(" ");
	private Button item=new Button(" ");




	public Sorpresa(PerrosSuper personaje1, Rotweiller r,Main main,Objeto objeto,MainGameScene scene){

		super(new BorderPane(),400, 300);
		this.personaje1=personaje1;
		this.scene=scene;
		this.main=main;
		this.r=r;
		this.objeto=objeto;
		BorderPane borderPane=(BorderPane)super.getRoot();
		borderPane.setStyle("-fx-background-image:url('assets/fondo.png');");
		borderPane.setMinHeight(300);
		borderPane.setMinWidth(400);
		perro.setStyle("-fx-background-image:url('assets/sorpresa.png');");
		perro.setMinHeight(200);
		perro.setMinWidth(200);
		item.setStyle("-fx-background-image:url('assets/sorpresita.png');");
		item.setMinHeight(200);
		item.setMinWidth(200);
		VBox heroVbox= new VBox();
		HBox box=new HBox();
		heroVbox.getChildren().add(popo);
		box.getChildren().add(perro);
		box.getChildren().add(item);
		heroVbox.getChildren().add(box);
		borderPane.setLeft(heroVbox);
		perro.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
			main.openBatt(main.getPerrosSuper(),r,scene);
			}
		});
		item.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				personaje1.vida(personaje1);
			main.returnToMap(scene);

			}
		});



}
}
