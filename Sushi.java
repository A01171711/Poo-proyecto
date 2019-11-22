import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Sushi extends HeredarHeroe{

	public Sushi(){
		super("Sushi", 1000, 68, 75,"Imagenes/Sushi.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("el Sushi ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}