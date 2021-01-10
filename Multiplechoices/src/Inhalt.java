import java.util.ArrayList;

public class Inhalt {
    private String title;
    private String content;
    private String thema;
    private ArrayList<String> answer=new ArrayList<String>();
    private ArrayList<String> wrong=new ArrayList<String>();
    public  Inhalt(String t,String th,String c) {title=t;content=c;thema=th;}
    public void addAnswer(String z) {answer.add(z);}
    public void addWrong(String z) {wrong.add(z);}
    public String getTitle() {return title;}
    public ArrayList<String> getAnswer(){return answer;}
    public ArrayList<String> getWrong(){return wrong;}
    public void deleteZeil(int i) {
    	if(i==-1) {answer.clear();}
    	else if(i<answer.size()) {
    		answer.remove(i);
    	}
    	else {System.out.println("zeile unverfuegbar");}
    }
    public void setAnswer(int i,String s) {
    	if(i < answer.size()) {
    		answer.set(i, s);
    	}
    	else {System.out.println("zeile unverfuegbar");}
    }
    public void setTitle(String t) {title=t;}
    public String getContent() {return content;}
    public String getThema() {return thema;}
}
