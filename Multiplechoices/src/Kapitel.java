import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Kapitel {
	private InhaltMenge m=new InhaltMenge();// inhalt of kap
	private JFrame window=new JFrame();
	private ArrayList<Multiplechoices> fragelist= new ArrayList<Multiplechoices>();
	private ArrayList<String> wronganswers= new ArrayList<String>();
	private int numright=0;
	private int seite=0;
	private Container cw;
	public Kapitel() {
		window.setTitle("MultipleChoices");
    	cw= window.getContentPane();    	
    	cw.setLayout(new GridLayout(1,1));
    	window.setLocationRelativeTo(null);
    	window.setResizable(true);
    	window.setSize(800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public void addInhalt(Inhalt i) {m.addInhalt(i);}// add inhalt to kap
	public void addAnswer(String s) {m.addAnswer(s);}// add answer to kap
	public ArrayList<Multiplechoices> getFrageList(){return fragelist;}
	public InhaltMenge getIMenge() {return m;}
    public void setFrage() {
    	ArrayList<Inhalt> inhalts= m.getInhalts();
    	//HashMap<Inhalt,Inhalt> k= m.getKonkurenz();
    	Random r = new Random();
    	//int e= r.nextInt(k.size());
    	//for(Inhalt i: k.keySet()) {
    		//if(e==0) {break;}
    		//else {
    			//Ergaenz er = new Ergaenz(i, k.get(i));
    			//fragelist.add(er);
    			//inhalts.remove(i);
    			//inhalts.remove(k.get(i));
        		//k.remove(i);
        		//e--;
    		//}
    	//}
    	for(int j=0;j<inhalts.size();j++) {
    		Multiplechoices mul= new Multiplechoices(inhalts.get(j),m,r.nextInt(3));
    		fragelist.add(mul);
    	}
    	Collections.shuffle(fragelist);
    }
    public void setSeite() {seite++;}
    public int getSeite() {return seite;}
    public void show(int s) {
    	window.setVisible(false);
    	cw.removeAll();
    	Multiplechoices m=fragelist.get(s);
    	JLabel f = new JLabel(m.frage());
    	cw.add(f);
    	ArrayList<String> ChoicesList= m.answers();
    	Integer[] n = new Integer[ChoicesList.size()];
    	for(int j=0;j< n.length; j++) {n[j]=j;}
    	List<Integer> intList = Arrays.asList(n);
    	Collections.shuffle(intList);
    	JCheckBox[]list= new JCheckBox[n.length];
    	for(int j=0;j<n.length;j++) {
    		String str= "<html>";
    		int count=0;
    		for(int h=0; h< ChoicesList.get(intList.get(j)).length(); h++) {
    			if(count==100) {str=str+"<br>";count=0;}
    			str=str+ChoicesList.get(intList.get(j)).charAt(h);
    			count++;
    		}
    		list[j]= new JCheckBox(str);
    		cw.add(list[j]);
    	}
    	JButton ok = new JButton("OK");
    	ok.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			ArrayList<Integer> ans= new ArrayList<Integer>();
    			for(int i=0;i<n.length;i++) {
    				if(list[i].isSelected()) {
    					ans.add(intList.get(i));
    				}
    			}
    			m.check(ans);
    			if(m.getCheck()) {numright++;}
    			else {wronganswers.add(m.getInhalt().getThema());}
    			setSeite();
    			if(getSeite()<fragelist.size()) {show(getSeite());}
    			else {sumary();}
    		}
    	});
    	cw.add(ok);
    	cw.setLayout(new GridLayout(list.length+2,1));
    	window.setSize(600,list.length*80);
    	window.setVisible(true);
    }
    public void sumary() {
    	window.setVisible(false);
    	cw.removeAll();
    	JLabel l=new JLabel("<html>Richtig: "+numright+"/"+fragelist.size()+"<br>"+"Thema zum Wiederhölen : ");;
    	JButton b= new JButton("To Menu");
    	b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				window.dispose();
				new Program();
			}
    	});
    	cw.setLayout(new BorderLayout());
    	cw.add(l,BorderLayout.NORTH);
    	String la="<html>";
    	for(int j=0; j< wronganswers.size();j++) {la=la+ wronganswers.get(j)+"<br>";}
    	JLabel t= new JLabel(la);
    	cw.add(t,BorderLayout.CENTER);
    	cw.add(b,BorderLayout.SOUTH);    	
    	window.setSize(600,wronganswers.size()*20);
    	window.setVisible(true);
    } 	
}
