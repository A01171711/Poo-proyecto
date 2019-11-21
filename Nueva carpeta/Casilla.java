import javafx.scene.layout.*;
import javafx.scene.control.*;


 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
public class Casilla extends StackPane{
	private Label label;
	private Label label2;
	private PerrosSuper perrosSuper;
	private PerrosMalos perrosMalos;
	private Objeto objeto;
	private Escenario escenario;
  private Cofre cofre;
  private Nivel nivel;
	//private String img;

		public Casilla(){
		label= new Label("");
		label2=new Label("");
	//Image image = new Image(getClass().getResourceAsStream('assets/pug.jpg'););
    //label.setGraphic(new ImageView(image));


		getChildren().add(label);
		getChildren().add(label2);
		label.setMinHeight(50);
		label.setMinWidth(50);
		//perrosSuper.setImg(img);
		//System.out.print(perrosSuper.getImg());
		//label.setStyle("-fx-background-image:url('assets/mapa.png');");
	}

	public void pintarCasilla(){
		if(perrosSuper==null){
      label.setStyle("-fx-background-image:url('assets/Arena.png');");
			if(perrosMalos!=null){
				//label.setText(perrosMalos.getNombre());
        label.setStyle("-fx-background-image:url("+perrosMalos.getImg()+");");

				//label2.setText(perrosMalos.getNombre());
			}else{
				label.setText("   ");
			}



		}else{
			//label.setText(perrosSuper.getNombre());
			//label.setText(perrosSuper.getNombre());
			//System.out.print(perrosSuper.getImg());
			label.setStyle("-fx-background-image:url("+perrosSuper.getImg()+");");

			//lab!el.setStyle("-fx-background-image:url('assets/aleman.png');");

		}

		if (objeto!=null){
//label.setText(objeto.getNombre());
			//System.out.print(perrosSuper.getImg());
			label.setStyle("-fx-background-image:url("+objeto.getImg()+");");


		}

	if (escenario!=null){
//label.setText(arma.getNombre());
			//System.out.print(perrosSuper.getImg());
			label.setStyle("-fx-background-image:url("+escenario.getImg()+");");


		}
    if (cofre!=null){
    //label.setText(arma.getNombre());
        //System.out.print(perrosSuper.getImg());
        label.setStyle("-fx-background-image:url("+cofre.getImg()+");");


      }
      if (nivel!=null){
      //label.setText(arma.getNombre());
          //System.out.print(perrosSuper.getImg());
          label.setStyle("-fx-background-image:url("+nivel.getImg()+");");


        }


	}

	public void setPerrosSuper(PerrosSuper perrosSuper){
		this.perrosSuper=perrosSuper;
	}


	public PerrosSuper getPerrosSuper(){
		return perrosSuper;
	}

	public PerrosMalos getPerrosMalos(){
		return perrosMalos;
	}

	public void setPerrosMalos(PerrosMalos perrosMalos){
		this.perrosMalos=perrosMalos;
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
  public void setNivel(Nivel nivel){

		this.nivel=nivel;
	}

	public Nivel getNivel(){

		return nivel;
	}

}
