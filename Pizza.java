import javafx.secene.image.Image;
import javafx.scene.image.ImageView;

public class Pizza extends HeredarHeroe{

	public Pizza(){
		super("Pizza",0,0,0,"Imagenes/Pizza.png");

		Habilidad[] habilidades = new Habilidad[1];
		habilidades[0] = new Habilidad("",0); 
	}

	public void atacar(Personajes enemigo){
		System.out.println("la Pizza ataca");
		enemigo.setHP(enemigo.getHP()-(getAtaque()-enemigo.getDefensa()));
	}




}