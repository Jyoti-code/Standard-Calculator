// Project topic StandardCalculator.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class StandardCalculator extends JFrame {
	JButton perB,b0,dotB,equB,b1,b2,b3,addB,b4,b5,b6,subB,b7,b8,b9,multiB,reciB,squB,squrtB,divB,expB,ceB,cB,delB,ansB,cosB,sinB,tanB,powB,logB,modB,cbrtB,factB,degB,radB;
	JTextArea t1,t2;
	float total;
	double totals;
	public StandardCalculator()  {}
	public StandardCalculator(String s)  {
		super(s);
	}
	public void setComponents()  {
		// ADD COMPONENTS
		perB=new JButton("%");
		perB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		perB.setBackground(Color.WHITE);
		b0=new JButton("0");
		b0.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b0.setBackground(Color.WHITE);
		dotB=new JButton(".");
		dotB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		dotB.setBackground(Color.WHITE);
		equB=new JButton("=");
		equB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		Color c = new Color(232,244,248);
		equB.setBackground(c);
		b1=new JButton("1");
		b1.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b1.setBackground(Color.WHITE);
		b2=new JButton("2");
		b2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b2.setBackground(Color.WHITE);
		b3=new JButton("3");
		b3.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b3.setBackground(Color.WHITE);
		addB=new JButton("+");
		addB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		addB.setBackground(c);
		b4=new JButton("4");
		b4.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b4.setBackground(Color.WHITE);
		b5=new JButton("5");
		b5.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b5.setBackground(Color.WHITE);
		b6=new JButton("6");
		b6.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b6.setBackground(Color.WHITE);
		subB=new JButton("-");
		subB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		subB.setBackground(c);
		b7=new JButton("7");
		b7.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b7.setBackground(Color.WHITE);
		b8=new JButton("8");
		b8.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b8.setBackground(Color.WHITE);
		b9=new JButton("9");
		b9.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		b9.setBackground(Color.WHITE);
		multiB=new JButton("X");
		multiB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		multiB.setBackground(c);
		reciB=new JButton("1/x");
		reciB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		reciB.setBackground(c);
		squB=new JButton("x^2");
		squB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		squB.setBackground(c);
		squrtB=new JButton("x^1/2");
		squrtB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		squrtB.setBackground(c);
		divB=new JButton("/");
		divB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		divB.setBackground(c);
		expB=new JButton("e^x");
		expB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		expB.setBackground(c);
		ceB=new JButton("CE");
		ceB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		Color c1 = new Color(255,102,102);
		ceB.setBackground(c1);
		cB=new JButton("C");
		cB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		cB.setBackground(Color.RED);
		delB=new JButton("DEL");
		delB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		Color c2 = new Color(255,76,76);
		delB.setBackground(c2);
		ansB=new JButton("Ans");
		ansB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		ansB.setBackground(c);
		cosB=new JButton("cos");
		cosB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		cosB.setBackground(c);
		sinB=new JButton("sin");
		sinB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		sinB.setBackground(c);
		tanB=new JButton("tan");
		tanB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		tanB.setBackground(c);
		powB=new JButton("a^b");
		powB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		powB.setBackground(c);
		logB=new JButton("log");
		logB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		logB.setBackground(c);
		modB=new JButton("mod");
		modB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		modB.setBackground(c);
		cbrtB=new JButton("cbrt");
		cbrtB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		cbrtB.setBackground(c);
		factB=new JButton("x!");
		factB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		factB.setBackground(c);
		degB=new JButton("DEGREE");
		degB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		degB.setBackground(c);
		radB=new JButton("RADIANS");
		radB.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		radB.setBackground(c);
		t1=new JTextArea();
		Font font = new Font("Arial",Font.BOLD,15);
		t1.setFont(font);
		t2=new JTextArea();
		t2.setFont(font);
		// SET LAYOUT
		setLayout(null);
		perB.setBounds(5,430,70,40);
		b0.setBounds(75,430,70,40);
		dotB.setBounds(145,430,70,40);
		equB.setBounds(215,430,70,40);
		b1.setBounds(5,390,70,40);
		b2.setBounds(75,390,70,40);
		b3.setBounds(145,390,70,40);
		addB.setBounds(215,390,70,40);
		b4.setBounds(5,350,70,40);
		b5.setBounds(75,350,70,40);
		b6.setBounds(145,350,70,40);
		subB.setBounds(215,350,70,40);
		b7.setBounds(5,310,70,40);
		b8.setBounds(75,310,70,40);
		b9.setBounds(145,310,70,40);
		multiB.setBounds(215,310,70,40);
		reciB.setBounds(5,270,70,40);
		squB.setBounds(75,270,70,40);
		squrtB.setBounds(145,270,70,40);
		divB.setBounds(215,270,70,40);
		cosB.setBounds(5,230,70,40);
		sinB.setBounds(75,230,70,40);
		tanB.setBounds(145,230,70,40);
		powB.setBounds(215,230,70,40);
		modB.setBounds(5,190,70,40);
		cbrtB.setBounds(75,190,70,40);
		expB.setBounds(145,190,70,40);
		factB.setBounds(215,190,70,40);
		logB.setBounds(5,150,70,40);
		ceB.setBounds(75,150,70,40);
		cB.setBounds(145,150,70,40);
		delB.setBounds(215,150,70,40);
		degB.setBounds(5,120,140,30);
		radB.setBounds(145,120,140,30);
		t1.setBounds(5,5,400,42);
		t2.setBounds(150,55,400,30);
		ansB.setBounds(70,55,70,35);
		// ACTION LISTENER
		perB.addActionListener(new Handler());
		b0.addActionListener(new Handler());
		dotB.addActionListener(new Handler());
		equB.addActionListener(new Handler());
		b1.addActionListener(new Handler());
		b2.addActionListener(new Handler());
		b3.addActionListener(new Handler());
		addB.addActionListener(new Handler());
		b4.addActionListener(new Handler());
		b5.addActionListener(new Handler());
		b6.addActionListener(new Handler());
		subB.addActionListener(new Handler());
		b7.addActionListener(new Handler());
		b8.addActionListener(new Handler());
		b9.addActionListener(new Handler());
		multiB.addActionListener(new Handler());
		reciB.addActionListener(new Handler());
		squB.addActionListener(new Handler());
		squrtB.addActionListener(new Handler());
		divB.addActionListener(new Handler());
		expB.addActionListener(new Handler());
		ceB.addActionListener(new Handler());
		cB.addActionListener(new Handler());
		delB.addActionListener(new Handler());
		ansB.addActionListener(new Handler());
		cosB.addActionListener(new Handler());
		sinB.addActionListener(new Handler());
		tanB.addActionListener(new Handler());
		powB.addActionListener(new Handler());
		logB.addActionListener(new Handler());
		modB.addActionListener(new Handler());
		cbrtB.addActionListener(new Handler());
		factB.addActionListener(new Handler());
		degB.addActionListener(new Handler());
		radB.addActionListener(new Handler());
		add(perB);
		add(b0);
		add(dotB);
		add(equB);
		add(b1);
		add(b2);
		add(b3);
		add(addB);
		add(b4);
		add(b5);
		add(b6);
		add(subB);
		add(b7);
		add(b8);
		add(b9);
		add(multiB);
		add(reciB);
		add(squB);
		add(squrtB);
		add(divB);
		add(expB);
		add(ceB);
		add(cB);
		add(delB);
		add(t1);
		add(t2);
		add(ansB);
		add(cosB);
		add(sinB);
		add(tanB);
		add(powB);
		add(logB);
		add(modB);
		add(cbrtB);
		add(factB);
		add(degB);
		add(radB);
	}
	// IMPLEMENTS ACTION LISTENER
	class Handler implements ActionListener  {
		public void actionPerformed(ActionEvent e)   {
			Object source = e.getSource();
			if(source==b0)  
				t1.setText((t1.getText()+"0"));
			else if(source==b1)
				t1.setText((t1.getText()+"1"));
			else if(source==b2)
				t1.setText((t1.getText()+"2"));
			else if(source==b3)
				t1.setText((t1.getText()+"3"));
			else if(source==addB)
				t1.setText((t1.getText()+"+"));
			else if(source==b4)
				t1.setText((t1.getText()+"4"));
			else if(source==b5)
				t1.setText((t1.getText()+"5"));
			else if(source==b6)
				t1.setText((t1.getText()+"6"));
			else if(source==subB)
				t1.setText((t1.getText()+"-"));
			else if(source==b7)
				t1.setText((t1.getText()+"7"));
			else if(source==b8)
				t1.setText((t1.getText()+"8"));
			else if(source==b9)
				t1.setText((t1.getText()+"9"));
			else if(source==multiB)
				t1.setText((t1.getText()+"x"));
			else if(source==divB)
				t1.setText((t1.getText()+"/"));
			else if(source==powB)
				t1.setText((t1.getText()+"^"));
			else if(source==dotB)
				t1.setText((t1.getText()+"."));
			else if(source==perB)
				t1.setText((t1.getText()+"%"));
			else if(source==equB)   {
				String s = t1.getText();
				if(s.contains("+"))  {
					try  {
						int a = s.indexOf("+");
						total = Float.parseFloat(s.substring(0,a))+Float.parseFloat(s.substring(a+1));
					}
					catch (Exception e1)  {
						System.out.println(e1);
					}
					t2.setText(String.valueOf(total));
				}
				if(s.contains("-"))  {
					try {
						int a = s.indexOf("-");
						total = Float.parseFloat(s.substring(0,a))-Float.parseFloat(s.substring(a+1));
					}
					catch (Exception e1)  {
						System.out.println(e1);
					}
					t2.setText(String.valueOf(total));
				}
				if(s.contains("x"))  {
					try {
						int a = s.indexOf("x");
						total = Float.parseFloat(s.substring(0,a))*Float.parseFloat(s.substring(a+1));
					}
					catch (Exception e1)  {
						System.out.println(e1);
					}
					t2.setText(String.valueOf(total));
				}
				if(s.contains("/"))  {
					try  {
						int a = s.indexOf("/");
						total = Float.parseFloat(s.substring(0,a))/Float.parseFloat(s.substring(a+1));
					}
					catch (Exception e1)  {
						System.out.println(e1);
					}
					t2.setText(String.valueOf(total));
				}
				if(s.contains("^")==true) {
					try  {
						int a = s.indexOf("^");
						String p = s.substring(0,a);
						String q = s.substring(a+1);
						t1.setText("pow("+p+")");
						totals = Math.pow(Double.parseDouble(p),Double.parseDouble(q));
					}
					catch (Exception e1)  {
						System.out.println(e1);
					}
					t2.setText(String.valueOf(totals));
				}
			}
			else if(source==reciB)  {
				try  {
					String s = t1.getText();
					total = 1/Float.parseFloat(s);
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(total));
			}
			else if(source==squB)  {
				try  {
					String s = t1.getText();
					t1.setText("sqr("+s+")");
					total = Float.parseFloat(s)*Float.parseFloat(s);
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(total));
			}
			else if(source==squrtB)  {
				try  {
					String s = t1.getText();
					t1.setText("sqrt("+s+")");
					totals = Math.sqrt(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==expB)  {
				try  {
					String s = t1.getText();
					t1.setText("exp("+s+")");
					totals = Math.exp(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==cB)  {
				t1.setText("");
				t2.setText("");
			}
			else if(source==ceB)  {
				String s = t1.getText();
				String b = s.substring(0,s.length()-1);
				t1.setText(b);
			}
			else if(source==ansB)   {
				String s = t2.getText();
				t1.setText(s);
				t2.setText("");
			}
			else if(source==delB)   {
				String s = t2.getText();
				if(s.isEmpty()==false)
					t2.setText("0");
			}
			else if(source==cosB)  {
				try  {
					String s = t1.getText();
					t1.setText("cos("+s+")");
					double degrees = Double.parseDouble(s);
					double radians = Math.toRadians(degrees);
					totals  = Math.cos(radians);
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==sinB)  {
				try  {
					String s = t1.getText();
					t1.setText("sin("+s+")");
					double degrees = Double.parseDouble(s);
					double radians = Math.toRadians(degrees);
					totals  = Math.sin(radians);
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==tanB)  {
				try  {
					String s = t1.getText();
					t1.setText("tan("+s+")");
					double degrees = Double.parseDouble(s);
					double radians = Math.toRadians(degrees);
					totals  = Math.tan(radians);
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==factB)  {
				int fact = 1;
				try   {
					String s = t1.getText();
					t1.setText("fact("+s+")");
					int a = Integer.parseInt(s);
					for(int i = 1;i <= a;i++)  {
						fact = fact*i;
					}
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(fact));
			}
			else if(source==logB)   {
				try  {
					String s = t1.getText();
					t1.setText("log10("+s+")");
					totals = Math.log10(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==degB)   {
				try  {
					String s = t1.getText();
					t1.setText("Degrees("+s+")");
					totals = Math.toDegrees(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==radB)   {
				try  {
					String s = t1.getText();
					t1.setText("Radians("+s+")");
					totals = Math.toRadians(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
			else if(source==modB)  {
				String s = t1.getText();
				if(s.contains("%")==true)   {
					int a = s.indexOf("%");
					t1.setText("mod("+s.substring(0,a)+")");
					int total = Integer.parseInt(s.substring(0,a))%Integer.parseInt(s.substring(a+1));
					t2.setText(String.valueOf(total));
				}
			}
			else if(source==cbrtB)  {
				try  {
					String s = t1.getText();
					t1.setText("cbrt("+s+")");
					totals = Math.cbrt(Double.parseDouble(s));
				}
				catch(Exception e1)  {
					System.out.println(e1);
				}
				t2.setText(String.valueOf(totals));
			}
		}
	}
	public static void main(String args[])  {
		// SET FRAME size,visibility AND MAKE OBJECT OF STANDARD CALCULATOR
		StandardCalculator jf=new StandardCalculator("Standard Calculator");
		jf.setComponents();
		Color c = new Color(212,235,242);
		jf.getContentPane().setBackground(c);
		jf.setSize(298,505);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}