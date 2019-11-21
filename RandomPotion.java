public class RandomPotion extends Item{

	public RandomPotion(){
		super();
	}
	
	public int getEfecto(){
		int op = (int)(Math.random()*3);
		switch (op){
			case 2:
				efecto = (int)(Math.random()*5);
				break;
				
			case 1:
				efecto = (int)(Math.random()*5)*-1;
				break;
				
			case 0:
				efecto = 0;
				break;
		}
		return efecto;
	}
}