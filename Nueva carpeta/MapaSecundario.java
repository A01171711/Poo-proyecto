import javafx.scene.layout.*;
import javafx.scene.control.*;
public class MapaSecundario extends VBox{
	private Casilla[][] casillas;
	private Main main;

	public MapaSecundario(Main main,String titulo,int casillasX,int casillasY){
		this.main=main;
		GridPane grid= new GridPane();
		Label label= new Label(titulo);
		grid.setStyle("-fx-background-image:url('assets/mapa.png');");
		casillas= new Casilla[casillasX][casillasY];
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				System.out.println("Crea casilla "+i+" "+j);
				casillas[i][j]= new Casilla();
				grid.add(casillas[i][j],i,j);
			}
		}
		getChildren().add(label);
		getChildren().add(grid);

		casillas[0][0].setPerrosSuper(main.getPerrosSuper());
		casillas[1][1].setPerrosMalos(new Rotweiller ());
		casillas[1][5].setPerrosMalos(new Rotweiller ());
		casillas[5][5].setPerrosMalos(new Rotweiller ());

		//casillas[6][1].setObjeto(new ObjetoDefensa("Correa super velocidad",100));
		//casillas[7][2].setObjeto(new ObjetoDefensa("Sudadera camuflaje",30));
		//casillas[8][3].setObjeto(new Arma("Hueso tóxico",100));


		pintarMapa();
	}

	public Casilla[][] getCasillas(){
		return casillas;
	}

	public void pintarMapa(){
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				casillas[i][j].pintarCasilla();
			}
		}
	}

	public MapaSecundario getNextMap(){
		return new Mapa3(main);
	}


}
