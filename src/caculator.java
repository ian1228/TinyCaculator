import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class caculator extends JFrame {
	private JButton numbutton1=new JButton("1");
	private JButton numbutton2=new JButton("2");
	private JButton numbutton3=new JButton("3");
	private JButton numbutton4=new JButton("4");
	private JButton numbutton5=new JButton("5");
	private JButton numbutton6=new JButton("6");
	private JButton numbutton7=new JButton("7");
	private JButton numbutton8=new JButton("8");
	private JButton numbutton9=new JButton("9");
	private JButton numbutton10=new JButton("0");
	private JButton numbutton11=new JButton(".");
	
	private JButton funbutton1=new JButton("+");
	private JButton funbutton2=new JButton("-");
	private JButton funbutton3=new JButton("*");
	private JButton funbutton4=new JButton("/");
	private JButton funbutton5=new JButton("=");
	
	private JButton clearbutton=new JButton("clear");
	
	private JPanel panel1=new JPanel(new GridLayout(1,2));
	private JPanel panel2=new JPanel(new GridLayout(4,4));
	private JTextField text=new JTextField();
	
	private double num1,num2;
	private String numstring="";
	private int operator; 
	
	public caculator(){
		super("­pºâ¾÷");
		panel1.add(text);
		text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		panel2.add(numbutton1);
		numbutton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='1';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton2);
		numbutton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='2';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton3);
		numbutton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='3';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(funbutton1);
		funbutton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(numstring);
				operator=1;
				numstring="";
				// TODO Auto-generated method stub
			}
		});
		
		panel2.add(numbutton4);
		numbutton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='4';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton5);
		numbutton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='5';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton6);
		numbutton6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='6';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(funbutton2);
		funbutton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(numstring);
				operator=2;
				numstring="";
				// TODO Auto-generated method stub
			}
		});
		
		panel2.add(numbutton7);
		numbutton7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='7';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton8);
		numbutton8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='8';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton9);
		numbutton9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='9';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(funbutton3);
		funbutton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(numstring);
				operator=3;
				numstring="";
				// TODO Auto-generated method stub
			}
		});
		
		panel2.add(numbutton10);
		numbutton10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='0';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(numbutton11);
		numbutton11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				numstring+='.';
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
		panel2.add(funbutton5);
		funbutton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(numstring);
				numstring = Double.toString(operation(num1,num2,operator));
				text.setText(numstring);
				clear();
				
				// TODO Auto-generated method stub
			}
		});
		panel2.add(funbutton4);
		funbutton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(numstring);
				operator=4;
				numstring="";
				// TODO Auto-generated method stub
			}
		});
		add(panel1,BorderLayout.NORTH);
		add(panel2);
		
		add(clearbutton,BorderLayout.SOUTH);
		clearbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				clear();
				text.setText(numstring);
				// TODO Auto-generated method stub
			}
		});
	}
	
	private double operation(double a, double b, int x){
		switch(x){
			case 1:
				return a + b;
			case 2:
				return a - b;
			case 3:
				return a * b;
			case 4:
				if(b == 0)
					text.setText("error");
				else
				return a / b;
			default:
				return b;			
		}
	}
	
	private void clear(){
		num1 = 0;
		num2 = 0;
		operator = 0;
		numstring = "";
	}
}
