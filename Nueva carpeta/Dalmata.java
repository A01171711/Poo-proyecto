 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
public class Dalmata extends PerrosSuper{

  public Dalmata(){
  super("Dalmata",200,150,25,7,35, "assets/dalmata.png");
		Habilidad[] habilidades= new Habilidad[5];
		habilidades[0]= new Habilidad("Ladrido ahogado",20);
		habilidades[1]= new Habilidad("Rasguño letal",10);
		habilidades[2]= new Habilidad("Estornudo dañiño",25);
    habilidades[3]= new Habilidad("Lamido tóxico",30);
    habilidades[4]= new Habilidad("Mordida al corazón",30);

		super.setHabilidades(habilidades);
   }

	public void atacar(Personajes enemigo){
		System.out.println("Ataque normal de Dalmata");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
  public void atacar(Personajes enemigo,double danioAumentado){
		System.out.println("Ataque crítico de Dalmata");
		int danio= (int)(getAtaque()*(1+danioAumentado));
		System.out.println("El danio fue : "+danio);
		enemigo.setHp(enemigo.getHp()-(danio-enemigo.getDefensa()));
	}


	public void atacar(Personajes enemigo, Habilidad habilidad){
		System.out.println("Ataque con habilidad de Dalmata: "+habilidad.getNombre());
		enemigo.setHp(enemigo.getHp()-(getAtaque()+habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
	}




}
