import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.event.*;

public class MainGameScene extends Scene{

	private Main main;
	private Mapa m;
	private Objeto[] correa;
   private  int index=0;
	int i;
	public MainGameScene(Main main){
		super(new GridPane(),1200, 700);
		correa= new Objeto[10];
		this.main=main;
		GridPane gridPane=(GridPane)super.getRoot();
		gridPane.add(new Label(main.getPerrosSuper().getNombre()),0,0);
		m= new Mapa(main,"Mapa 1",24,14);
		gridPane.add(m,0,1);
		gridPane.add(new Label("Prueba"),0,2);
        setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                PerrosSuper sp= main.getPerrosSuper();
                m.getCasillas()[sp.getX()][sp.getY()].setPerrosSuper(null);
                try{
                    switch (event.getCode()) {
                        case UP:
                            m.getCasillas()[sp.getX()][sp.getY()-1].getPerrosSuper();
                            sp.setY(sp.getY()-1);
                            break;
                        case DOWN:
                            m.getCasillas()[sp.getX()][sp.getY()+1].getPerrosSuper();
                            sp.setY(sp.getY()+1);
                            break;
                        case LEFT:
                            m.getCasillas()[sp.getX()-1][sp.getY()].getPerrosSuper();
                            sp.setX(sp.getX()-1);
                            break;
                        case RIGHT:
                            m.getCasillas()[sp.getX()+1][sp.getY()].getPerrosSuper();
                            sp.setX(sp.getX()+1);
                            break;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Choco con pared");
                }

                checarCasilla(m.getCasillas()[sp.getX()][sp.getY()]);
                m.getCasillas()[sp.getX()][sp.getY()].setPerrosSuper(sp);

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

        if(casilla.getPerrosMalos()!=null){
            main.openBattle(main.getPerrosSuper(),casilla.getPerrosMalos(),this);
        }
				if(casilla.getCofre()!=null){
					main.openSurprise(main.getPerrosSuper(), main.getRotweiller(),main.getObjeto(),this);
                    main.getRotweiller().setHp(200);

				}
				if(casilla.getObjeto()!=null){

                    main.getPerrosSuper().getCorrea();
                    main.getPerrosSuper().addObjetoToCorrea(casilla.getObjeto(), index);
					index++;
                    casilla.setObjeto(null);
										main.getPerrosSuper().vida(main.getPerrosSuper());








            System.out.println(" " +main.getPerrosSuper().imprimeInventario());

        }
				if(casilla.getNivel()!=null){
					main.openNivel(main.getPerrosSuper(), main.getBoss(),this);


				}

    }
	}
