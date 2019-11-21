public abstract class Objeto{
	private String nombre;
	private int puntos;
	private String img;

	public Objeto(String nombre,int puntos, String img){
		this.nombre=nombre;
		this.puntos=puntos;
		this.img= img; 
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPuntos(int puntos){
		this.puntos=puntos;
	}

	public int getPuntos(){
		return puntos;
	}

public void setImg(String img){
			this.img=img;
		}
		public String getImg(){
			return img;
		}



}
