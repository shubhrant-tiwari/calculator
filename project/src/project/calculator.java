import java.util.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;

public class javac implements ActionListener {
	static LinkedList<String> b =new LinkedList<>();
	static String g="";
	JFrame frame= new JFrame();
	JPanel panel =new JPanel();  
static	JTextArea textarea = new JTextArea(5 ,10);
	JButton button1 =new JButton("1");
	JButton button2 =new JButton("2");
	JButton button3 =new JButton("3");
	JButton button4 =new JButton("4");
	JButton button5 =new JButton("5");
	JButton button6 =new JButton("6");
	JButton button7 =new JButton("7");
	JButton button8 =new JButton("8");
	JButton button9 =new JButton("9");
	JButton button0 =new JButton("0");
	
	JButton buttonper =new JButton("%");
	JButton buttonadd =new JButton("+");
	JButton buttonsub =new JButton("-");
	JButton buttonmul =new JButton("*");
	JButton buttondiv =new JButton("/");
	JButton buttonclear =new JButton("null");
	JButton buttondot =new JButton(".");
	JButton buttonequal =new JButton("result");
	JButton buttonSqr=new JButton("X2");
	 public javac() {
		 frame.setSize(350,600);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setTitle("Calculator");
		 frame.setResizable(true);
		 frame.add(panel);
		 panel.setBackground(Color.LIGHT_GRAY);
		 Border border= BorderFactory.createLineBorder(Color.RED,4);
		 panel.add(textarea);
		 textarea.setBackground(Color.white);
		 Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
		 textarea.setBorder(tborder);
		 Font font=new Font("arial",Font.BOLD,33);
		 textarea.setFont(font);
		 
		 textarea.setPreferredSize(new Dimension(2,10));
		 textarea.setLineWrap(true);
		
		 button0.setPreferredSize(new Dimension(100,40));
		 button0.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button0.png"));
		 
		 button1.setPreferredSize(new Dimension(100,40));
		 button1.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button1.png"));
		 
		 button2.setPreferredSize(new Dimension(100,40));
		 button2.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button2.png"));
		 
		 button3.setPreferredSize(new Dimension(100,40));
		 button3.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button3.png"));
		 
		 button4.setPreferredSize(new Dimension(100,40));
		 button4.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button4.png"));
		 
		 button5.setPreferredSize(new Dimension(100,40));
		 button5.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button5.png"));
		 
		 button6.setPreferredSize(new Dimension(100,40));
		 button6.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button6.png"));
		 
		 button7.setPreferredSize(new Dimension(100,40));
		 button7.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button7.png"));
		 
		 button8.setPreferredSize(new Dimension(100,40));
		 button8.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button8.png"));
		 
		 button9.setPreferredSize(new Dimension(100,40));
		 button9.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\button9.png"));
		 		 
		 buttonadd.setPreferredSize(new Dimension(100,40));
		 buttonadd.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonadd.png"));
		 
		 buttonsub.setPreferredSize(new Dimension(100,40));
		 buttonsub.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonsub.png"));
		 
		 buttonmul.setPreferredSize(new Dimension(100,40));
		 buttonmul.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonmul.png"));
		 
		 buttondiv.setPreferredSize(new Dimension(100,40));
		 buttondiv.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttoniv.png"));
		 
		 buttonclear.setPreferredSize(new Dimension(100,40));
		 buttonclear.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonclear.png"));
		 
		 buttondot.setPreferredSize(new Dimension(100,40));
		 buttondot.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\bouttondot.png"));
		 
		 buttonequal.setPreferredSize(new Dimension(100,40));
		 buttonequal.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonequal.png"));
		 
		 buttonper.setPreferredSize(new Dimension(100,40));
		 buttonper.setIcon(new ImageIcon("c:\\Users\\KIIT\\Downloads\\butt.png"));
		 
		 buttonSqr.setPreferredSize(new Dimension(100,40));
		 buttonSqr.setIcon(new ImageIcon("C:\\Users\\KIIT\\Downloads\\buttonSqr.png"));
		 panel.add(buttonper);
		 panel.add(buttonSqr);
		 panel.add(buttonclear);
		 panel.add(buttonmul);
		 panel.add(buttonadd);
		 panel.add(buttonsub);
		 panel.add(buttondiv);
		 panel.add(button9);
		 panel.add(button8);
		 panel.add(button7);
		 panel.add(button6);
		 panel.add(button5);
		 panel.add(button4);
		 panel.add(button3);
		 panel.add(button2);
		 panel.add(button1);
		 panel.add(button0);
		 
		 panel.add(buttondot);
		 panel.add(buttonequal);
		
		 
		button0.addActionListener((ActionListener) this);
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		buttonper.addActionListener((ActionListener) this);
		buttonSqr.addActionListener((ActionListener) this);
	 }
	 public static void main(String[] args) {
		 javac cal= new javac();
	 }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		///String
		int count=0;
		String s=arg0.getActionCommand(),r="";
		if(s=="null")
		{
			g=g.substring(0, g.length()-1);
			textarea.setText(g);
			b.removeAll(b);
		}
		
		else if(s=="result")
	{
		  char[] n=g.toCharArray();
	       
	        for(int i=0;i<n.length;i++)
	             {
	        	if(i==n.length-1)
	        		{r+=n[i];
	        		b.add(r);
	        		System.out.println(b);}
	        	
	        	
	        	 	
	        	if(n[i]=='+'||n[i]=='*'||n[i]=='/'||n[i]=='%'||n[i]=='-')
	        	{System.out.println(r);
	        	if(i!=0)
	        		b.add(r);
	        		if(n[i]!='-')
	        		{r=n[i]+"";
	        		b.add(r);}
	        		r="";
	        	}
	        	else if(n[i]!='-')
	        	{
	        		r+=n[i]+"";
	        		count++;
	        		
	        	}
	        	 if(n[i]=='-'&&count==0)
	        	{
	        		r+=n[i]+"";count++;
	        	}
	        	 
	        	 else if(n[i]=='-'&&count>0)
	         	 {b.add("+");r+=n[i]+"";count++;}
	        	
	        	
	        
	        
	        	
	             }
	        
	        System.out.println(b);
	        
	            	function();
	            	
	            	
	            	
	      
		
	

	}
	else
	{
		if(s=="X2")
		{s=Integer.parseInt(g.charAt(g.length()-1)+"")*Integer.parseInt(g.charAt(g.length()-1)+"")+"";}
		g+=s;//try{textarea.getDocument().insertString( 7,s, SimpleAttributeSet.EMPTY);}catch(Exception e) {} 
	textarea.setText(textarea.getText()+s);}
	}
	static void  function() {
		double  t=0;
		double c=0,v=0;	String m=null;
		
		while(b.size()>1){
			if( b.contains("%"))
				m="%";
			else if( b.contains("*"))
				m="*";
			else if( b.contains("/"))
				m="/";
			else if( b.contains("+"))
				m="+";
		
		
			{double l=0;String o=(String)b.get(b.indexOf(m)-1),p=(String)b.get(b.indexOf(m)+1);
		
		
			 c=Double.parseDouble(o);
		
			 v=Double.parseDouble(p);
		
		switch(m)
		{
		case "*":
			l=c*v;
			break;
		case "/":
			l=c/v;
			break;
		case "+":
		    l=c+v;
		    break;
		case "%":
			l=(c/100)*v;
			break;
	    default:System.out.println("not comp");
			
		}
		System.out.println(b);
		
			b.remove(b.indexOf(m)-1);
			b.remove(b.indexOf(m)+1);
			b.set(b.indexOf(m),l+"");
			t+=l;
			System.out.println(b);
		
		
		
			
			}	}	if(b.size()==2)
		{t=Double.parseDouble(b.get(0))+Double.parseDouble(b.get(1));
		System.out.println(Integer.parseInt(b.get(0)));
		b.set(0,t+"");
		b.remove(1);}
		
		t=(Math.round(Double.parseDouble(b.get(0))*1000));
				t=t/1000;
		System.out.println(t);
		textarea.setText(textarea.getText()+"\n"+t);
		
	}

}
      
      class containd extends Exception
{
    	  containd(){
    		  
    	  }
}
      class vcontaind extends Exception
      {
          	  vcontaind(){
          		  
          	  }
      }
    	
    	  
    	  
     
