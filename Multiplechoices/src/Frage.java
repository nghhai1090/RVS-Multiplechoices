import java.util.ArrayList;

import javax.swing.JFrame;

public interface Frage {
	public abstract ArrayList<String>answers();
	public abstract String frage() ;
	public abstract boolean isMultiplechoices();
	public abstract boolean isErgaenz();
	public abstract boolean getCheck();
	public abstract boolean check(ArrayList<String> l1, ArrayList<String>l2);
	public abstract boolean check(ArrayList<Integer> l1);
}
