import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.geometry.Insets;



public class BattleScene2 extends Scene {
	private Rotweiller r;
	private PerrosSuper personaje1;
	private Label battleLabel,heroStats,enemyStats;
	private Main main;
	private MainGameScene scene;
	private Label popo= new Label("");
	private Label popo2= new Label("");



	public BattleScene2(PerrosSuper personaje1,Rotweiller r,Main main,MainGameScene scene){

		super(new BorderPane(),700, 700);
		this.scene=scene;
		this.main=main;
		this.personaje1=personaje1;
		this.r=r;
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
		enemyStats=new Label(r.toString());
		enemyVbox.getChildren().add(new Label(r.getNombre()));
		enemyVbox.getChildren().add(enemyStats);
		enemyVbox.getChildren().add(popo2);
		popo2.setStyle("-fx-background-image:url("+r.getImg()+");");
		popo2.setMinWidth(50);
		popo2.setMinHeight(50);

		heroVbox.setMargin(popo2, new Insets(125,0,0,170));
		borderPane.setRight(enemyVbox);
		//battleLabel= new Label("La batalla entre: "+personaje1.getNombre()+" y "+r.getNombre()+" va a comenzar" );
		//borderPane.setCenter(battleLabel);
		HBox hboxBotones= new HBox();
		Button atacarButton= new Button("Atacar");
		atacarButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
			public void handle(MouseEvent e){
				personaje1.atacar(r);
				//battleLabel.setText(battleLabel.getText()+"\n"+personaje1.getNombre()+" atacó...");
				enemyStats.setText(r.toString());
				if(r.getHp()<=0){

					main.returnToMap(scene);

				}
				r.atacar(personaje1);
				//battleLabel.setText(battleLabel.getText()+"\n"+r.getNombre()+" atacó...");
				heroStats.setText(personaje1.toString());
				if(personaje1.getHp()<=0){
					main.openEnd();

				}
			}
		});
		hboxBotones.getChildren().add(atacarButton);
		borderPane.setBottom(hboxBotones);
		hboxBotones.setMargin(atacarButton, new Insets(600,0,25,320));
	}


}
