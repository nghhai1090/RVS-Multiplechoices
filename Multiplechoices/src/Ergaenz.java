import java.util.ArrayList;

public class Ergaenz implements Frage {// NICHT FERTIG GEMACHT
	private Inhalt i1;
	private Inhalt i2;
    public Ergaenz(Inhalt i1, Inhalt i2) {
    	this.i1=i1;
    	this.i2=i2;
    }
    public String frage() {return "Ergänzen Sie Begriffe zu "+i1.getTitle()+" (1) and "+i2.getTitle()+" (2)";}
    public boolean check(ArrayList<String> l1, ArrayList<String>l2) {
    	if(l1.size()!=i1.getAnswer().size()) {return false;}
    	if(l2.size()!=i2.getAnswer().size()) {return false;}
    	for(int i=0;i<i1.getAnswer().size();i++) {
    		if(i1.getAnswer().indexOf(l1.get(i))==-1) {return false;}	
    	}
    	for(int i=0;i<i2.getAnswer().size();i++) {
    		if(i2.getAnswer().indexOf(l2.get(i))==-1) {return false;}	
    	}
    	return true;
    }
    public ArrayList<String> answers(){
    	ArrayList<String> l1= new ArrayList<String>(i1.getAnswer()) ;
    	ArrayList<String> l2=new ArrayList<String>(i2.getAnswer());
    	l1.addAll(l2);
    	return l1;
    }
    public Inhalt firstInhalt() {return i1;}
    public Inhalt secondInhalt() {return i2;}
	@Override
	public boolean isMultiplechoices() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isErgaenz() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean getCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean check(ArrayList<Integer> l1) {
		return false;
	}
}
