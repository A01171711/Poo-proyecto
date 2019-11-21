import javafx.scene.layout.*;
import javafx.scene.control.*;
public class MapaBoss extends VBox{
	private Casilla[][] casillas;
	private Main main;

	public MapaBoss(Main main,String titulo,int casillasX,int casillasY){
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
		casillas[1][1].setPerrosMalos(new PastorAleman ());
		casillas[1][5].setPerrosMalos(new PastorAleman ());
		casillas[5][5].setPerrosMalos(new PastorAleman ());
		casillas[7][7].setObjeto(new Espada());
		
		casillas[15][8].setPerrosMalos(new Bulldog());
		casillas[20][5].setPerrosMalos(new Bulldog());
		casillas[20][10].setEscenario(new Lago());
		casillas[20][11].setEscenario(new Lago());
		casillas[21][10].setEscenario(new Lago());
		casillas[21][11].setEscenario(new Lago());
		casillas[19][10].setEscenario(new Lago());
		casillas[19][11].setEscenario(new Lago());
		casillas[18][10].setEscenario(new Lago());
		casillas[18][11].setEscenario(new Lago());
		casillas[5][10].setCofre(new Baul());
		casillas[13][2].setCofre(new Baul());
		casillas[19][8].setCofre(new Baul());
		casillas[16][5].setObjeto(new Hueso());
		casillas[4][8].setObjeto(new Hueso());
		casillas[12][5].setObjeto(new Escudo());
		casillas[3][10].setObjeto(new Escudo());
    //casillas[23][13].setNivel(new Puerta());


		//casillas[6][1].setObjeto(new ObjetoDefensa("Correa super velocidad",100));
		//casillas[7][2].setObjeto(new ObjetoDefensa("Sudadera camuflaje",30));
		//casillas[8][3].setObjeto(new Arma("Hueso tóxico",100));
		//Button nivel= new Button("Nivel 2");
	//		}
	//	});

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

	public MapaBoss getNextMap(){
		return new Mapa4(main);
	}


}
