import javafx.scene.layout.*;
import javafx.scene.control.*;
public class Mapa extends VBox{
	private Casilla[][] casillas;
	private Main main;

	public Mapa(Main main,String titulo,int casillasX,int casillasY){
		this.main=main;

//Image image = new Image(getClass().getResourceAsStream("assets/mapa.png")); 
//Label myLabel = new Label(""); 
//myLabel.setGraphic(new ImageView(image));

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
		


		casillas[1][8].setPerrosMalos(new PastorAleman ());
		casillas[7][9].setPerrosMalos(new PastorAleman ());
		casillas[5][6].setPerrosMalos(new PastorAleman ());
		casillas[15][6].setPerrosMalos(new Bulldog());
		casillas[20][5].setPerrosMalos(new Bulldog());
		casillas[15][8].setPerrosMalos(new Bulldog());
		casillas[20][5].setPerrosMalos(new Bulldog());
		casillas[10][8].setPerrosMalos(new Rotweiller());
		casillas[20][9].setPerrosMalos(new Rotweiller());
		casillas[22][3].setPerrosMalos(new Rotweiller());
		casillas[6][5].setPerrosMalos(new Rotweiller());
casillas[5][2].setPerrosMalos(new PastorAleman ());
		casillas[10][1].setPerrosMalos(new Bulldog());
		casillas[20][2].setPerrosMalos(new PastorAleman ());
		casillas[22][1].setPerrosMalos(new Bulldog());

		
        casillas[0][2].setEscenario(new Lago());
		casillas[0][3].setEscenario(new Lago());
		casillas[0][4].setEscenario(new Lago());
		casillas[0][5].setEscenario(new Lago());
		casillas[0][6].setEscenario(new Lago());
		casillas[0][7].setEscenario(new Lago());
		casillas[0][8].setEscenario(new Lago());
		casillas[0][9].setEscenario(new Lago());
		casillas[0][10].setEscenario(new Lago());
		casillas[0][11].setEscenario(new Lago());
		casillas[0][12].setEscenario(new Lago());
		casillas[0][13].setEscenario(new Lago());
		casillas[1][2].setEscenario(new Lago());
		casillas[1][3].setEscenario(new Lago());
		casillas[1][4].setEscenario(new Lago());
		casillas[1][7].setEscenario(new Lago());
		casillas[1][8].setEscenario(new Lago());
		casillas[1][9].setEscenario(new Lago());
		casillas[1][10].setEscenario(new Lago());
		casillas[1][11].setEscenario(new Lago());
		casillas[1][12].setEscenario(new Lago());
		casillas[1][13].setEscenario(new Lago());
		casillas[2][6].setEscenario(new Lago());
		casillas[2][7].setEscenario(new Lago());
		casillas[2][8].setEscenario(new Lago());
		casillas[2][9].setEscenario(new Lago());
		casillas[2][10].setEscenario(new Lago());
		casillas[2][11].setEscenario(new Lago());
		casillas[2][13].setEscenario(new Lago());
		casillas[3][8].setEscenario(new Lago());
		casillas[3][9].setEscenario(new Lago());
		casillas[3][10].setEscenario(new Lago());
		casillas[3][13].setEscenario(new Lago());
		casillas[4][9].setEscenario(new Lago());
		casillas[4][13].setEscenario(new Lago());
		casillas[5][7].setEscenario(new Lago());
		casillas[5][13].setEscenario(new Lago());
		casillas[6][1].setEscenario(new Lago());
		casillas[6][6].setEscenario(new Lago());
		casillas[6][7].setEscenario(new Lago());
		casillas[6][8].setEscenario(new Lago());
		casillas[6][13].setEscenario(new Lago());
		casillas[7][1].setEscenario(new Lago());
		casillas[7][2].setEscenario(new Lago());
		casillas[7][4].setEscenario(new Lago());
		casillas[7][5].setEscenario(new Lago());
		casillas[7][6].setEscenario(new Lago());
		casillas[7][7].setEscenario(new Lago());
		casillas[7][8].setEscenario(new Lago());
		casillas[8][1].setEscenario(new Lago());
		casillas[8][2].setEscenario(new Lago());
		casillas[8][3].setEscenario(new Lago());
		casillas[8][4].setEscenario(new Lago());
		casillas[8][5].setEscenario(new Lago());
		casillas[8][6].setEscenario(new Lago());
		casillas[8][7].setEscenario(new Lago());
		casillas[8][8].setEscenario(new Lago());
		casillas[8][13].setEscenario(new Lago());
		casillas[9][0].setEscenario(new Lago());
		casillas[9][1].setEscenario(new Lago());
		casillas[9][2].setEscenario(new Lago());
		casillas[9][3].setEscenario(new Lago());
		casillas[9][4].setEscenario(new Lago());
		casillas[9][5].setEscenario(new Lago());
		casillas[9][6].setEscenario(new Lago());
		casillas[9][7].setEscenario(new Lago());
		casillas[9][8].setEscenario(new Lago());
		casillas[9][9].setEscenario(new Lago());
		casillas[9][12].setEscenario(new Lago());
		casillas[9][13].setEscenario(new Lago());
		casillas[10][0].setEscenario(new Lago());
		casillas[10][1].setEscenario(new Lago());
		casillas[10][2].setEscenario(new Lago());
		casillas[10][6].setEscenario(new Lago());
		casillas[10][9].setEscenario(new Lago());
		casillas[10][10].setEscenario(new Lago());
		casillas[10][11].setEscenario(new Lago());
		casillas[10][12].setEscenario(new Lago());
		casillas[10][13].setEscenario(new Lago());
		casillas[11][0].setEscenario(new Lago());
		casillas[11][1].setEscenario(new Lago());
		casillas[11][2].setEscenario(new Lago());
		casillas[11][5].setEscenario(new Lago());
		casillas[11][6].setEscenario(new Lago());
		casillas[11][9].setEscenario(new Lago());
		casillas[11][10].setEscenario(new Lago());
		casillas[11][11].setEscenario(new Lago());
		casillas[11][12].setEscenario(new Lago());
		casillas[11][13].setEscenario(new Lago());
		casillas[12][0].setEscenario(new Lago());
		casillas[12][1].setEscenario(new Lago());
		casillas[12][11].setEscenario(new Lago());
		casillas[12][12].setEscenario(new Lago());
		casillas[12][13].setEscenario(new Lago());
		casillas[13][1].setEscenario(new Lago());
		casillas[13][13].setEscenario(new Lago());
		casillas[14][13].setEscenario(new Lago());
		casillas[15][13].setEscenario(new Lago());
		casillas[16][8].setEscenario(new Lago());
		casillas[16][9].setEscenario(new Lago());
		casillas[16][10].setEscenario(new Lago());
		casillas[17][0].setEscenario(new Lago());
		casillas[17][9].setEscenario(new Lago());
		casillas[17][10].setEscenario(new Lago());
		casillas[17][11].setEscenario(new Lago());
		casillas[17][12].setEscenario(new Lago());
		casillas[17][13].setEscenario(new Lago());
		casillas[18][0].setEscenario(new Lago());
		casillas[18][7].setEscenario(new Lago());
		casillas[18][10].setEscenario(new Lago());
		casillas[18][13].setEscenario(new Lago());
		casillas[19][0].setEscenario(new Lago());
		casillas[19][6].setEscenario(new Lago());
		casillas[19][7].setEscenario(new Lago());
		casillas[19][8].setEscenario(new Lago());
		casillas[19][9].setEscenario(new Lago());
		casillas[19][13].setEscenario(new Lago());
		casillas[20][0].setEscenario(new Lago());
		casillas[20][5].setEscenario(new Lago());
		casillas[20][6].setEscenario(new Lago());
		casillas[20][9].setEscenario(new Lago());
		casillas[20][13].setEscenario(new Lago());
		casillas[21][0].setEscenario(new Lago());
		casillas[21][1].setEscenario(new Lago());
		casillas[21][3].setEscenario(new Lago());
		casillas[21][5].setEscenario(new Lago());
		casillas[21][8].setEscenario(new Lago());
		casillas[21][9].setEscenario(new Lago());
		casillas[21][10].setEscenario(new Lago());
		casillas[21][13].setEscenario(new Lago());
		casillas[22][0].setEscenario(new Lago());
		casillas[22][1].setEscenario(new Lago());
		casillas[22][2].setEscenario(new Lago());
		casillas[22][3].setEscenario(new Lago());
		casillas[22][5].setEscenario(new Lago());
		casillas[22][6].setEscenario(new Lago());
		casillas[22][7].setEscenario(new Lago());
		casillas[22][8].setEscenario(new Lago());
		casillas[22][9].setEscenario(new Lago());
		casillas[22][10].setEscenario(new Lago());
		casillas[22][11].setEscenario(new Lago());
		casillas[22][12].setEscenario(new Lago());
		casillas[22][13].setEscenario(new Lago());




		casillas[18][11].setEscenario(new Lago());
		casillas[5][10].setCofre(new Baul());
		casillas[13][2].setCofre(new Baul());
		casillas[19][8].setCofre(new Baul());
		casillas[16][5].setObjeto(new Hueso());
		casillas[4][8].setObjeto(new Hueso());
		casillas[12][5].setObjeto(new Escudo());
		casillas[3][10].setObjeto(new Escudo());
		casillas[23][12].setNivel(new Puerta());
		casillas[1][6].setObjeto(new Espada());
		casillas[9][10].setObjeto(new Espada());


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

	public Mapa getNextMap(){
		return new Mapa2(main);
	}


}

