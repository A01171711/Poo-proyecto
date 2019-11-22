import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.geometry.Insets;




public class BattleScene extends Scene {
	private PerrosMalos personaje2;
	private PerrosSuper personaje1;
	private Label battleLabel,heroStats,enemyStats;
	private Main main;
	private MainGameScene scene;
	private Label popo= new Label("");
	private Label popo2= new Label("");



	public BattleScene(PerrosSuper personaje1,PerrosMalos personaje2,Main main,MainGameScene scene){

		super(new BorderPane(),700, 700);
		this.scene=scene;
		this.main=main;
		this.personaje1=personaje1;
		this.personaje2=personaje2;
		BorderPane borderPane=(BorderPane)super.getRoot();
		borderPane.setStyle("-fx-background-image:url('assets/battle.png');");
		borderPane.setMinHeight(626);
		borderPane.setMinWidth(626);
		borderPane.setTop(new Label("Batalla"));
		VBox heroVbox= new VBox();
		heroStats=new Label(personaje1.toString());
		heroVbox.getChildren().add(new Label(personaje1.getNombre()));
		heroVbox.getChildren().add(heroStats);

		heroVbox.getChildren().add(popo);
		popo.setStyle("-fx-background-image:url("+personaje1.getImg()+");");

		popo.setMinWidth(50);
		popo.setMinHeight(50);

		heroVbox.setMargin(popo, new Insets(400,0,0,125));




		borderPane.setLeft(heroVbox);
		VBox enemyVbox= new VBox();
		enemyStats=new Label(personaje2.toString());
		enemyVbox.getChildren().add(new Label(personaje2.getNombre()));

		enemyVbox.getChildren().add(enemyStats);

		enemyVbox.getChildren().add(popo2);
		popo2.setStyle("-fx-background-image:url("+personaje2.getImg()+");");
		popo2.setMinWidth(50);
		popo2.setMinHeight(50);

		heroVbox.setMargin(popo2, new Insets(125,0,0,170));

		borderPane.setRight(enemyVbox);
		HBox hboxBotones= new HBox();
		Button atacarButton= new Button("Atacar");
		Button HabilidadB = new Button ("Habilidad");

		atacarButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				personaje1.atacar(personaje2);
				enemyStats.setText(personaje2.toString());
				if(personaje2.getHp()<=0){
					scene.getMapa().getCasillas()[personaje1.getX()][personaje1.getY()].setPerrosMalos(null);
					main.returnToMap(scene);

				}
				personaje2.atacar(personaje1);
				heroStats.setText(personaje1.toString());
				if(personaje1.getHp()<=0){
					main.openEnd();

				}
			}
		});
		
		HabilidadB.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent eh){
				
			}
		});

		hboxBotones.getChildren().add(atacarButton);
		hboxBotones.getChildren().add(HabilidadB);
		hboxBotones.setMargin(atacarButton, new Insets(600,0,25,150));
		hboxBotones.setMargin(HabilidadB, new Insets(600,0,25,300));
		//hboxBotones.getChildren().add(mochila);
		borderPane.setBottom(hboxBotones);
	}


}
