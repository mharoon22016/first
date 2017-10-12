import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JButton jbuuton1;
	private JButton jbuuton2;
	private JButton jbuuton3;
	private JButton jbuuton4;
	private JButton jbuuton5;
	private JButton jbuuton6;
	private JButton jbuuton7;
	private JButton jbuuton8;
	private JButton jbuuton9;
	private JButton jbuuton0;
	private JButton jbuutonEqual;
	private JButton jbuutonMultiplication;
	private JButton jbuutonMinus;
	private JButton jbuutonAdd;
	private JButton jbuutonDivision;
	private JButton jbuutonSolve;
	private JButton jbuutonClear;
	private double temp;
	private double solvetemp;
	private JTextField jtfResult;
	String display="";
	public Calculator(){
		setSize(350, 350);
		//setVisible(true);
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(4,3));
		jp.add(jbuuton1=new JButton("1"));
		jp.add(jbuuton2=new JButton("2"));
		jp.add(jbuuton3=new JButton("3"));
		jp.add(jbuuton4=new JButton("4"));
		jp.add(jbuuton5=new JButton("5"));
		jp.add(jbuuton6=new JButton("6"));
		jp.add(jbuuton7=new JButton("7"));
		jp.add(jbuuton8=new JButton("8"));
		jp.add(jbuuton9=new JButton("9"));
		jp.add(jbuuton0=new JButton("0"));
		jp.add(jbuutonClear=new JButton("C"));
		 JPanel p2 = new JPanel();
	        p2.setLayout(new FlowLayout());
	        jtfResult = new JTextField(20);
	        jtfResult.setEditable(true);
	        p2.add(jtfResult);
	        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
	        jtfResult.setEditable(false);

	                JPanel p3 = new JPanel();
	                p3.setLayout(new GridLayout(5, 1));
	                p3.add(jbuutonAdd = new JButton("+"));
	                p3.add(jbuutonMinus = new JButton("-"));
	                p3.add(jbuutonMultiplication = new JButton("*"));
	                p3.add(jbuutonDivision = new JButton("/"));
	                p3.add(jbuutonSolve = new JButton("="));

	        JPanel p = new JPanel();
	        p.setLayout(new BorderLayout());
	        p.add(p2, BorderLayout.NORTH);
	        
	        p.add(p3, BorderLayout.EAST);
	        p.add(jp);
	        
	        
		add(p);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		Calculator fr=new Calculator();
		//fr.setVisible(true);
	

	}

}
