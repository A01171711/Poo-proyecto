import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Andres extends HeredarHeroe{

	public Andres(){
		super("Andres", 2000, 160, 160,"Imagenes/Taco.png");

	}

	public void atacar(Personajes enemigo){
		System.out.println("Andres ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}