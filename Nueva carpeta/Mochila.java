import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.*;
public class Mochila extends Scene{

	private Main main;
	private Objeto[] correa;
	private PerrosSuper perrosSuper;





	public Mochila (Main main){

		super(new BorderPane(),700, 700);
		this.main=main;
		this.correa=correa;
		this.perrosSuper= perrosSuper;

		BorderPane borderPane=(BorderPane)super.getRoot();

		GridPane gp= new GridPane();
    Label l1= new Label(" "+ correa[0].getNombre());//main.getPerrosSuper().getCorrea[0].getNombre();
		gp.add(l1,0,0);
		Label l2= new Label(" "+ correa[1].getNombre());//main.getPerrosSuper().getCorrea[1].getNombre());
		gp.add(l2,0,1);
		Label l3= new Label(" "+ correa[2].getNombre());//main.getPerrosSuper().getCorrea[2].getNombre());
		gp.add(l3,1,0);
		Label l4= new Label(" "+ correa[3].getNombre());//main.getPerrosSuper().getCorrea[3].getNombre());
		gp.add(l4,1,1);
		Label l5= new Label(" "+ correa[4].getNombre());//main.getPerrosSuper().getCorrea[4].getNombre());
		gp.add(l5,2,0);
		Label l6= new Label(" "+ correa[5].getNombre());//main.getPerrosSuper().getCorrea[5].getNombre());
		gp.add(l6,2,1);
		Label l7= new Label(" "+ correa[6].getNombre());//main.getPerrosSuper().getCorrea[6].getNombre());
		gp.add(l7,3,0);
		Label l8= new Label(" "+ correa[7].getNombre());//main.getPerrosSuper().getCorrea[7].getNombre());
		gp.add(l8,3,1);
		Label l9= new Label(" "+ correa[8].getNombre());//main.getPerrosSuper().getCorrea[8].getNombre());
		gp.add(l9,4,0);
		Label l10= new Label(" "+ correa[9].getNombre());//main.getPerrosSuper().getCorrea[9].getNombre());
		gp.add(l10,4,1);
		borderPane.setCenter(gp);



	}
}
