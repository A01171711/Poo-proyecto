import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Alfajor extends HeredarHeroe{

	public Alfajor(){
		super("Alfajor",0,0,0,"Imagenes/Alfajor.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("el Alfajor ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}