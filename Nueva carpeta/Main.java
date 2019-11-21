import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;

public class Main extends Application{
	private Stage primaryStage;
	private PerrosSuper perrosSuper;
	private PerrosMalos perrosMalos;
	private Objeto objeto;
	private Escenario escenario;
	private Cofre cofre;
	private Rotweiller r= new Rotweiller();
	private Nivel nivel;
	private Boss b=new Boss();


	//private CharacterSelection characterSelection;
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){
		this.primaryStage= primaryStage;
		//primaryStage.setScene(new CharacterSelection(this));
		primaryStage.setScene(new Inicio(this));
		primaryStage.show();
	}
	public void enterCharacterSelection(){
		primaryStage.setScene(new CharacterSelection(this));
		primaryStage.show();
	}

	public void openGame(){
		primaryStage.setScene(new MainGameScene(this));
	}

	//public void openGame2(){
	//	primaryStage.setScene(new )
	//}


	public void returnToMap(MainGameScene mainGameScene){
		primaryStage.setScene(mainGameScene);
	}

	public void openBattle(PerrosSuper p1,PerrosMalos p2,MainGameScene mgs){
		primaryStage.setScene(new BattleScene(p1,p2,this,mgs));
	}
	public void openMochila( ){
		primaryStage.setScene(new Mochila (this));
	}
	public void openEnd( ){
		primaryStage.setScene(new Inicio(this));
	}
	public void openBatt(PerrosSuper p1,Rotweiller r,MainGameScene mgs){
		primaryStage.setScene(new BattleScene2(p1,r,this,mgs));
	}
	public void openNivel(PerrosSuper p1,Boss b,MainGameScene mgs){
		primaryStage.setScene(new BattleSceneBoss(p1,b,this,mgs));
	}

	public void openSurprise(PerrosSuper p1,Rotweiller r, Objeto o, MainGameScene mgs){
		primaryStage.setScene(new Sorpresa(p1,r,this,o,mgs));
	}


	public void setPerrosSuper(PerrosSuper perrosSuper){
		this.perrosSuper=perrosSuper;
	}

	public PerrosSuper getPerrosSuper(){
		return perrosSuper;
	}
	public void setPerrosMalos(PerrosMalos perrosMalos){
		this.perrosMalos=perrosMalos;
	}

	public PerrosMalos getPerrosMalos(){
		return perrosMalos;
	}



public void setObjeto(Objeto objeto){
		this.objeto=objeto;
	}

	public Objeto getObjeto(){
		return objeto;
	}

	public void setEscenario(Escenario escenario){

		this.escenario=escenario;
	}

	public Escenario getEscenario(){

		return escenario;
	}
	public void setCofre(Cofre cofre){

		this.cofre=cofre;
	}

	public Cofre getCofre(){

		return cofre;
	}
	public void setRotweiller(Rotweiller r){

		this.r=r;
	}

	public Rotweiller getRotweiller(){

		return r;
	}
	public void setNivel(Nivel nivel){

		this.nivel=nivel;
	}

	public Nivel getNivel(){

		return nivel;
	}
	public void setBoss(Boss b){

		this.b=b;
	}

	public Boss getBoss(){

		return b;
	}




}
