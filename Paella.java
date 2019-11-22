import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Paella extends HeredarHeroe{

	public Paellla(){
		super("Paella", 1000, 64, 74,"Imagenes/Paella.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("la Paella ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}