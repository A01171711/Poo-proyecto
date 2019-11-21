public class Boss extends PerrosMalos{
	public Boss(){
		super("Boss",500,100,60,4, "assets/boss.png");
		/*Habilidad[] habilidades= new Habilidad[5];
    habilidades[0]= new Habilidad("Mordida aniquiladora",20);
		habilidades[1]= new Habilidad("Ladrido ensordesedor",10);
		habilidades[2]= new Habilidad("Patada mortal",25);
    habilidades[3]= new Habilidad("Lamida radioactiva",50);
    habilidades[4]= new Habilidad("Mirada asesina",30);
		super.setHabilidades(habilidades);*/

	}
	//public void atacar(Personaje enemigo){
	/*	System.out.println("Ataque normal de Rotweiller");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
	}
//	public String toString(){
//		return "Estoy en Rotweiller: "+getNombre()+" HP: "+getHp()+" nivel: "+getNivel()+" ataque: "+getAtaque()+" defensa: "+getDefensa();
//	}*/
}
