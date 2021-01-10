import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InhaltMenge {
    private HashMap<Inhalt,Inhalt> konkurenz= new HashMap<Inhalt,Inhalt>();
    private ArrayList<Inhalt> inhaltlist= new ArrayList<Inhalt>();// inhaltmenge
    private ArrayList<String> answerList= new ArrayList<String>();// answerlist
    public void addAnswer(String a) {answerList.add(a);}//add answer to answerlist
    public void addInhalt(Inhalt i) {// add new inhalt to inhaltmenge und its answers to answerlist
    	inhaltlist.add(i);
        for(int j=0; j<i.getAnswer().size();j++) {
        	addAnswer(i.getAnswer().get(j));
        }
    }
    public ArrayList<String> randomchoices(int n, Inhalt i){// get n random answer that not relative with inhalt i in answerlist
    	ArrayList<String> r = new ArrayList<String>();
    	ArrayList<String> a = i.getAnswer();
    	while(n!=0) {
    		Random rand = new Random();
    		int ra= rand.nextInt(answerList.size()-1);
    		if(!r.contains(answerList.get(ra))&&!a.contains(answerList.get(ra))) {r.add(answerList.get(ra));n--;}
    	}
    	return r;
    }
    public ArrayList<Inhalt> getInhalts(){return inhaltlist;}// return all inhalts
    public void addKonkurenz(Inhalt i, Inhalt j) {konkurenz.put(i,j);}// unused, intent to use for class erganz
    public HashMap<Inhalt,Inhalt> getKonkurenz(){return konkurenz;}// unused, intent to use for class erganz
}
