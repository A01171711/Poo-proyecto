import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Taco extends HeredarHeroe{

	public Taco(){
		super("Taco", 1000, 76, 72,"Imagenes/Taco.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("el Taco ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}