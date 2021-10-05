package flames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class flamesgui {
	public static void main(String[] args){
	JFrame frame =new JFrame();
	JLabel fname ,sname,flames;
	JTextField yourname , partnername,message;
	JTextArea outputtext;
	frame.setTitle("flames calculator");
	flames =new JLabel("flames calculator");
	//flames.setcolor(Color.RED);
	flames.setFont(new Font("Ink Free",Font.BOLD,40));
	fname =new JLabel("Your Name");
	fname.setBounds(20,50,150,20);
	yourname =new JTextField();
	yourname.setBounds(100, 50, 200, 25);
	sname =new JLabel("Partner Name");
	sname.setBounds(20,90,150,20);
	partnername=new JTextField();
	partnername.setBounds(100, 90, 200, 25);
	
	frame.add(fname);frame.add(yourname);
	yourname.setForeground(Color.BLACK);
	frame.add(sname);frame.add( partnername);
	partnername.setForeground(Color.BLACK);
	
	JButton submit = new JButton("FLAMES");
	submit.setBounds(100, 130, 90, 30);
	JButton reset = new JButton("Reset");
	reset.setBounds(200, 130, 90, 30);
	
	outputtext = new JTextArea();
	outputtext.setBounds(20,170, 320, 100);
	submit.addActionListener(new ActionListener(){
		//public void actionperformed(ActionEvent e)
	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JTextField message =new JTextField();
			
			int x=0;
			int y=0;
			//String s11="";
			//String status="";
			String s1=yourname.getText().toString();
			String s2=partnername.getText().toString();
			String  name =s1.toLowerCase();
			String  pname =s2.toLowerCase();
			 
			 String space = name.replaceAll("\\s", "") ;
			// System.out.println("space: "+space);
			 String space1 = pname.replaceAll("\\s", "") ;
			 
			 StringBuilder s11 = new StringBuilder(space);
			 StringBuilder s21 = new StringBuilder(space1);
			// StringBuilder s11 = new StringBuilder(s1);
			// StringBuilder s21 = new StringBuilder(s2);
			int len3=s11.length();
			int len4=s21.length();
			for(int i=0;i<len3;i++) {
				for(int j=0;j<len4;j++) {
					if(s11.charAt(i)== s21.charAt(j)) {
						s11.replace(i, i+1, "0");
						s21.replace(j, j+1, "0");
						
					}
				}
			}
			
			for(int k=0;k<len3;k++) {
				if(s11.charAt(k)!='0') {
					 System.out.print(" "+s11.charAt(k));
					x+=1;
					
				}
			}
			    // System.out.println();
				// System.out.println("first string "+x);
			
			for(int l=0;l<len4;l++) {
				if(s21.charAt(l)!='0') {
					//System.out.print(" "+s21.charAt(l));
					y+=1;
					
				}
				
			}
			//System.out.println();
			//System.out.println("second string "+y);
			
			int total=x+y;
			//System.out.println("total letter is "+total);
			
			 String flames = "FLAMES";
		        StringBuilder sb3 = new StringBuilder(flames);
		        
		        char flameResult = 0;
		        
		        while(sb3.length()!=1)
		        {
		            int y1 = total%sb3.length(); 
		            String temp;
		            
		            if(y1!=0)
		            {
		                temp = sb3.substring(y1)+sb3.substring(0, y1-1); // taking substring (counting purpose)
		                
		            }
		            else
		            {
		                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)
		                
		            }
		            sb3 = new StringBuilder(temp);
		            flameResult = sb3.charAt(0);
		            
		        }
		       // System.out.println(flameResult);
			 switch(flameResult) {
			 case 'F':
				 message.setText("you are a friends");
				 break;
			 case 'L':
				 message.setText("you are in love");
				 break;	 
			 case 'A':
				 message.setText("you get affection");
				 break;	 
			 case 'M':
				 message.setText("you got marriage");
				 break;	 
			 case 'E':
				 message.setText("you got enemy");
				 break;	 
			 case 'S':
				 message.setText("you got sister");
				 break;	 
				 
			 }
			 outputtext.setText(
					 "Your Name:   "+"   "+yourname.getText()+"\n"+"   "+       
			         "Partner Name: "+partnername.getText()+"\n"+"   "+
					"flames calc:   "+message.getText()	
					 
					 );
		}
			
			
		});
	
	   reset.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			yourname.setText(
					""
					);
			partnername.setText(
					""
					);
			outputtext.setText(
					""
					);
			
		}
		   
	   });
	   frame.add(submit);
	   submit.setBackground(Color.black);
	   submit.setForeground(Color.white);
	   frame.add(reset);
	   reset.setBackground(Color.black);
	   reset.setForeground(Color.white);
	   frame.add(outputtext);
	   outputtext.setForeground(Color.black);
	   frame.setSize(370,370);
	   frame.setLayout(null);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.getContentPane().setBackground(Color.pink);
	   frame.setVisible(true);
}
}