 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;

public class Pug extends PerrosSuper{


public Pug(){



  super("Pug",200,100,15,4,20,"assets/pugo.png");


		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0]= new Habilidad("Ladrido ahogado",20);
		habilidades[1]= new Habilidad("Rasguño letal",10);
		habilidades[2]= new Habilidad("Estornudo dañiño",25);
    habilidades[3]= new Habilidad("Lamido tóxico",30);
		super.setHabilidades(habilidades);

  }


	public void atacar(Personajes enemigo){
		System.out.println("Ataque normal de Pug");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
  public void atacar(Personajes enemigo,double danioAumentado){
		System.out.println("Ataque crítico de Pug");
		int danio= (int)(getAtaque()*(1+danioAumentado));
		System.out.println("El danio fue : "+danio);
		enemigo.setHp(enemigo.getHp()-(danio-enemigo.getDefensa()));
	}


	public void atacar(Personajes enemigo, Habilidad habilidad){
		System.out.println("Ataque con habilidad de Pug: "+habilidad.getNombre());
		enemigo.setHp(enemigo.getHp()-(getAtaque()+habilidad.getPuntosEspeciales()-enemigo.getDefensa()));
	}




}
