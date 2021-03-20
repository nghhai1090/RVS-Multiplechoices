import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
//Created by Hoang Hai Nguyen

public class Program {
	private JFrame window ;
	private JButton kap1 ;
	private JButton kap2 ;
	private JButton kap3 ;
	private JCheckBox check;
	public Program() {
		window= new JFrame();
    	Container c= window.getContentPane();
    	c.setLayout(new GridLayout(6,1));
    	check= new JCheckBox("Show Answer");
    	kap1= new JButton("KAPITEL 1");
    	kap1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {		
				window.dispose();
                new FirstKap(check.isSelected()).show(0);
			}
    	});
    	c.add(kap1);
    	kap2= new JButton("KAPITEL 2");
    	kap2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {		
				window.dispose();
                new SecondKap(check.isSelected()).show(0);
			}
    	});
    	c.add(kap2);
    	kap3= new JButton("KAPITEL 3");
    	kap3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {		
				window.dispose();
                new ThirdKap(check.isSelected()).show(0);
			}
    	});
    	c.add(kap3);
    	c.add(check);
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
