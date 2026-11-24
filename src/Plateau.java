import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.String.valueOf;

public class Plateau extends JPanel {
 
    private Case[][] monPlateau;

    public Plateau() {
	 setLayout (new GridLayout (6,5));
	 monPlateau = new Case[6][5];
	 for(int i = 0; i < 6; i++) {
		 for( int j = 0; j < 5; j++) {
			 Case a = new Case (Color.pink,j,i,0);
			 monPlateau [i][j] = a;
			 add(a);
			 
		 }
	 }
    }

    public boolean isIn(Case c){
	//faut completer 
    }

    public int coupValide(Case dep, Case arr) {//Teste si la Pion qui est en dep peut de deplacer en arr : renvoie 0 si deplacement interdit, 1 si deplacement valide, 2 si prise valide
	// A completer
     }

    public boolean verifieDeplacementVertPrise(Case dep, Case arr){
	// A completer
    }

    public boolean verifieDeplacementHorPrise(Case dep, Case arr){
	// A completer
    }

    public boolean verifieDeplacementVert(Case dep, Case arr){
	// A completer
    }

    public boolean verifieDeplacementHor(Case dep, Case arr){
	// A completer
    }


    public Case casePrise(Case dep, Case arr){
	// A completer
    }


   public void jouerCoupPrise(Case dep, Case arr) {
       // A completer
   }

    public void jouerCoup(Case dep, Case arr) {
	// A completer
    }


    public void annulerCoup(Case dep, Case arr) {
	// A completer
    }

    public void reinitialiser() {
	// A completer
    }

}
