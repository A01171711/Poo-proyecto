public class Bulldog extends PerrosMalos{
	public Bulldog(){
		super("Bulldog",150,100,25,4, "assets/bull.png");
		/*Habilidad[] habilidades= new Habilidad[4];
    habilidades[0]= new Habilidad("Mordida aniquiladora",20);
		habilidades[1]= new Habilidad("Ladrido ensordesedor",10);
		habilidades[2]= new Habilidad("Patada mortal",25);
    habilidades[3]= new Habilidad("Lamida radioactiva",50);
		super.setHabilidades(habilidades);*/

	}
	/*public void atacar(Personaje enemigo){
		System.out.println("Ataque normal de Bulldog");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
	public String toString(){
		return "Estoy en Bulldog: "+getNombre()+" HP: "+getHp()+" nivel: "+getNivel()+" ataque: "+getAtaque()+" defensa: "+getDefensa();
	}*/
}
