 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
public class Husky extends PerrosSuper{
  public Husky(){
  super("Husky",400,200,40,10,45, "assets/husky.png");
		Habilidad[] habilidades= new Habilidad[6];
		habilidades[0]= new Habilidad("Ladrido ahogado",20);
		habilidades[1]= new Habilidad("Rasguño letal",10);
		habilidades[2]= new Habilidad("Estornudo dañiño",25);
    habilidades[3]= new Habilidad("Lamido tóxico",30);
    habilidades[4]= new Habilidad("Mordida al corazón",30);
    habilidades[5]= new Habilidad("Mirada hipnotizante",30);
		super.setHabilidades(habilidades);
  }

	public void atacar(Personajes enemigo){
		System.out.println("Ataque normal de Husky");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
  public void atacar(Personajes enemigo,double danioAumentado){
		System.out.println("Ataque crítico de Husky");
		int danio= (int)(getAtaque()*(1+danioAumentado));
		System.out.println("El danio fue : "+danio);
		enemigo.setHp(enemigo.getHp()-(danio-enemigo.getDefensa()));
	}


	public void atacar(Personajes enemigo, Habilidad habilidad){
		System.out.println("Ataque con habilidad de Husky: "+habilidad.getNombre());
		enemigo.setHp(enemigo.getHp()-(getAtaque()+habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
	}




}
