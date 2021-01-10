import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Multiplechoices implements Frage {
	private Inhalt i;
	private InhaltMenge m;
	private int numwrongchoices;
	private boolean c;
	private boolean f;
    public Multiplechoices(Inhalt i, InhaltMenge m, int n) {
    	this.i=i;
    	this.m=m;
    	numwrongchoices=n;// number of random wrong answer
    }	
    public String frage() {
    	if(i.getContent().contentEquals("T")) {return "Wählen Sie die Begriffe in zusammenhang mit "+i.getTitle();}// theorie fragen
    	else {
    		return "Wahlen Sie die richtige Lösung von "+i.getTitle();// berechnen fragen
    	}
    }
    public ArrayList<String>answers(){// get right answer and merge with wrong answer, plus some random answer from inhaltmenge
    	ArrayList<String> richtig = new ArrayList<String>(i.getAnswer());
    	ArrayList<String> wrong=new ArrayList<String>( i.getWrong());
    	ArrayList<String> falsch = m.randomchoices(numwrongchoices,i);
    	falsch.addAll(wrong);
    	falsch = new ArrayList<String>(new LinkedHashSet<String>(falsch));
    	richtig.addAll(falsch);
    	return richtig;
    }
    @Override
    public boolean check(ArrayList<Integer> choices) {// check if answer right
    	if( choices.size()!=i.getAnswer().size()) {this.c=false;return false;}
    	for(int j=0; j< choices.size();j++) {
    		if(choices.get(j)>=i.getAnswer().size()) {this.c=false;return false;}
    	}
    	this.c=true;
    	return true;    	
    }
    public boolean getCheck() {return c;}
    public Inhalt getInhalt() {return i;}
	@Override
	public boolean isMultiplechoices() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isErgaenz() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean check(ArrayList<String> l1, ArrayList<String> l2) {
		// TODO Auto-generated method stub
		return false;
	}
}
