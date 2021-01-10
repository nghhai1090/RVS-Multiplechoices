import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
//Created by Hoang Hai Nguyen

public class Program {
	private JFrame window ;
	private JButton kap1 ;
	public Program() {
		window= new JFrame();
    	Container c= window.getContentPane();
    	c.setLayout(new FlowLayout());
    	kap1= new JButton("KAPITEL 1");
    	kap1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {		
				window.dispose();
                new FirstKap().show(0);
			}
    	});
    	c.add(kap1);
    	window.setTitle("Main");
    	window.setLocationRelativeTo(null);
    	window.setResizable(false);
    	window.setSize(400,400);
    	window.setVisible(true);
    	window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
    public static void main(String[]args) {
        Program p = new Program();
    }
}
