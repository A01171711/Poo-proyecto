import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.event.*;

public class MainGameScene extends Scene{

	private Main main;
	private Mapa m;
	private Objeto[] bolsaMandado;
	private  int index=0;
	int i;
	public MainGameScene(Main main){
		super(new GridPane(),1200, 700);
		bolsaMandado= new Objeto[10];
		this.main=main;
		GridPane gridPane=(GridPane)super.getRoot();
		gridPane.add(new Label(main.HeredarHeroe().getNombre()),0,0);
		m= new Mapa(main,"Mapa 1",24,14);
		gridPane.add(m,0,1);
		//gridPane.add(new Label("Prueba"),0,2);
        setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                PerrosSuper sp= main.getHeredarHeroe();
                m.getCasillas()[sp.getX()][sp.getY()].setHeredarHeroe(null);
                try{
                    switch (event.getCode()) {
                        case UP:
                            m.getCasillas()[sp.getX()][sp.getY()-1].getHeredarHeroe();
                            sp.setY(sp.getY()-1);
                            break;
                        case DOWN:
                            m.getCasillas()[sp.getX()][sp.getY()+1].getHeredarHeroe();
                            sp.setY(sp.getY()+1);
                            break;
                        case LEFT:
                            m.getCasillas()[sp.getX()-1][sp.getY()].getHeredarHeroe();
                            sp.setX(sp.getX()-1);
                            break;
                        case RIGHT:
                            m.getCasillas()[sp.getX()+1][sp.getY()].getHeredarHeroe();
                            sp.setX(sp.getX()+1);
                            break;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Choco con pared");
                }

                checarCasilla(m.getCasillas()[sp.getX()][sp.getY()]);
                m.getCasillas()[sp.getX()][sp.getY()].setHeredarHeroe(sp);

                if(sp.getX()==m.getCasillas().length-1&&sp.getY()==m.getCasillas()[0].length-1){
                	gridPane.getChildren().remove(m);
                	sp.setX(0);
                	sp.setY(0);
                	m= m.getNextMap();
                	gridPane.add(m,0,1);
                }
                m.pintarMapa();
            }
        });
	}

    public Mapa getMapa(){
        return m;
    }
    private void checarCasilla(Casilla casilla){

        if(casilla.getEnemigo()!=null){
            main.openBattle(main.getHeredarHeroe(),casilla.getEnemigo(),this);
        }
				if(casilla.getCofre()!=null){
					main.openSurprise(main.getHeredarHeroe(), main.getAlfajor(),main.getObjeto(),this);
                    main.getAlfajor().setHp(200);

				}
				if(casilla.getObjeto()!=null){

                    main.getHeredarHeroe().getbolsaMandado();
                    main.getHeredarHeroe().addObjetoTobolsaMandado(casilla.getObjeto(), index);
					index++;
                    casilla.setObjeto(null);
										main.getHeredarHeroe().vida(main.getHeredarHeroe());








            System.out.println(" " +main.getHeredarHeroe().imprimeInventario());

        }
				if(casilla.getNivel()!=null){
					main.openNivel(main.getHeredarHeroe(), main.getBoss(),this);


				}

    }
	}
