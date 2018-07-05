import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener{
	Container c ;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	JTextField tf1;
	double no1=0,no2=0,ans=0;
	char oprtator;
	
	Frame(){
		setBounds(20,20,300,500);
		setVisible(true);
		setTitle("CalculatorProgram");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		
		tf1=new JTextField();
		tf1.setBounds(30,30,300,30);
		c.add(tf1);
		
		b1=new JButton("1");
		b1.setBounds(30,90,60,30);
		c.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("2");
		b2.setBounds(100,90,60,30);
		c.add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("3");
		b3.setBounds(170,90,60,30);
		c.add(b3);
		b3.addActionListener(this);	
		
		b4=new JButton("+");
		b4.setBounds(240,90,60,30);
		c.add(b4);
		b4.addActionListener(this);
		
		b5=new JButton("4");
		b5.setBounds(30,130,60,30);
		c.add(b5);
		b5.addActionListener(this);	
		
		b6=new JButton("5");
		b6.setBounds(100,130,60,30);
		c.add(b6);
		b6.addActionListener(this);	
		
		b7=new JButton("6");
		b7.setBounds(170,130,60,30);
		c.add(b7);
		b7.addActionListener(this);	
		
		b8=new JButton("-");
		b8.setBounds(240,130,60,30);
		c.add(b8);
		b8.addActionListener(this);	
		
		b9=new JButton("7");
		b9.setBounds(30,170,60,30);
		c.add(b9);
		b9.addActionListener(this);	
		
		b10=new JButton("8");
		b10.setBounds(100,170,60,30);
		c.add(b10);
		b10.addActionListener(this);	
		
		b11=new JButton("9");
		b11.setBounds(170,170,60,30);
		c.add(b11);
		b11.addActionListener(this);	
		
		b12=new JButton("*");
		b12.setBounds(240,170,60,30);
		c.add(b12);
		b12.addActionListener(this);

		b13=new JButton("rt");
		b13.setBounds(30,210,60,30);
		c.add(b13);
		b13.addActionListener(this);	
		
		b14=new JButton("0");
		b14.setBounds(100,210,60,30);
		c.add(b14);
		b14.addActionListener(this);	
		
		b15=new JButton(".");
		b15.setBounds(170,210,60,30);
		c.add(b15);
		b15.addActionListener(this);	
		
		b16=new JButton("=");
		b16.setBounds(240,210,60,30);
		c.add(b16);
		b16.addActionListener(this);	
		
		b17=new JButton("clear");
		b17.setBounds(30,250,120,30);
		c.add(b17);
		b17.addActionListener(this);

		b18=new JButton("delet");
		b18.setBounds(160,250,120,30);
		c.add(b18);
		b18.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			tf1.setText(tf1.getText()+"1");
		}if(e.getSource()==b2){
			tf1.setText(tf1.getText()+"2");
		}if(e.getSource()==b3){
			tf1.setText(tf1.getText()+"3");
		}if(e.getSource()==b4){
			no1=Double.parseDouble(tf1.getText());
			oprtator=1;
			tf1.setText("");
		}
		if(e.getSource()==b5){
			tf1.setText(tf1.getText()+"4");
		}if(e.getSource()==b6){
			tf1.setText(tf1.getText()+"5");
		}if(e.getSource()==b7){
			tf1.setText(tf1.getText()+"6");
		}if(e.getSource()==b8){
			no1=Double.parseDouble(tf1.getText());
			oprtator=2;
			tf1.setText("");
		}
		if(e.getSource()==b9){
			tf1.setText(tf1.getText()+"7");
		}if(e.getSource()==b10){
			tf1.setText(tf1.getText()+"8");
		}if(e.getSource()==b11){
			tf1.setText(tf1.getText()+"9");
		}if(e.getSource()==b12){
			no1=Double.parseDouble(tf1.getText());
			oprtator=3;
			tf1.setText("");
		}
		if(e.getSource()==b13){
			tf1.setText(""+Math.sqrt(Double.parseDouble(tf1.getText())));
		}if(e.getSource()==b14){
			tf1.setText(tf1.getText()+"0");
		}if(e.getSource()==b15){
			tf1.setText(tf1.getText()+".");
		}if(e.getSource()==b16){
			no2=Double.parseDouble(tf1.getText());
			switch(oprtator){
				case 1:
				ans=no1+no2;
				break;
				case 2:
				ans=no1-no2;
				break;
				case 3:
				ans=no1*no2;
				break;
				case 4:
				ans=no1/no2;
				break;
				default :
				tf1.setText("pleas enter a valid no");
				try{Thread.sleep(1000);}catch(Exception error){}
			}
			tf1.setText(""+ans);
		}
		if(e.getSource()==b17){
			tf1.setText("");
		}
		if(e.getSource()==b18){
			String s=tf1.getText();
			tf1.setText("");
			for(int i=0;i<s.length()-1;i++){
				tf1.setText(tf1.getText()+s.charAt(i));
				
			}
			
		}
	}
}
class CalculatorProgram{
	public static void main(String args[]){
		Frame frame=new Frame();
	}
}
		