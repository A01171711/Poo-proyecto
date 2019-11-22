import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Hamburguesa extends HeredarHeroe{

	public Hamburguesa(){
		super("Hamburguesa", 1000, 70, 80,"Imagenes/Hamburguesa.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("la Hamburguesa ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}