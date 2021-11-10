package mini;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.*;

public class View extends JFrame {
	private JPanel[] tabPan;
	private int height,width;
	private JLabel[] labTab;
	private JLabel[] l;
	private JButton but;
	private ImageIcon[] img;
	private JLabel[] butTab;
	private JMenuBar menuBar;
	private Container c;
	private JPanel p;
	private View1 v;
	protected JScrollPane sP;
	private Border b;
	private String[] location;
	private Controller cont;
	public View(Model model) {
		// TODO Auto-generated constructor stub
		cont = new Controller(this,model);
		tabPan = new JPanel[6];
		labTab = new JLabel[4];
		butTab = new JLabel[6];
		location = new String[3];
		c = getContentPane();
		c.setLayout(null);
		l = new JLabel[7];
		img = new ImageIcon[3];
		height = 775;
		width = 1200;
		
		int h1=width/10,h2=width/6,h0=height-280;
		tabPan[1] = new JPanel();
		tabPan[1].setLayout(null);
		tabPan[1].setOpaque(true);
		tabPan[1].setBounds(20,3,width-56,h1);
		tabPan[1].setBackground(Color.decode("#0d0d0d"));
		
		l[1]= new JLabel(new ImageIcon("banner_paiment2.jpg"));
		tabPan[2] = new JPanel();
		tabPan[2].setBounds(20,h1+5,width-56,h2);
		tabPan[2].add(l[1]);
		tabPan[2].setBackground(Color.decode("#265c98"));
		
		tabPan[0] = new JPanel();
		tabPan[0].setBounds(20,h1+h2+10,width-56,h0*5/6-10);
		tabPan[0].setBackground(Color.decode("#0d0d0d"));
		tabPan[0].setLayout(null);
		tabPan[0].setBorder(BorderFactory.createMatteBorder(0, width/50,0, width/50, Color.decode("#1a1a1a")));

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		int w1=width*75/100, w2=w1/6,h3=width/25;
		ImageIcon im = new ImageIcon("Capture1.PNG");
		l[0] = new JLabel();
		l[0].setBounds(10,h1-105,200,100);
		l[0].setIcon(im);
		l[0].setBackground(Color.decode("#0d0d0d"));
		l[0].addMouseListener(cont);
		l[0].setOpaque(true);
		
		butTab[0] = new JLabel("PARTICULIER",(int) CENTER_ALIGNMENT);
		butTab[0].setForeground(Color.decode("#ff9933"));
		butTab[0].setBounds(0,0,w2-10,h3);

		butTab[1] = new JLabel("PROFESSIONNEL",(int) CENTER_ALIGNMENT);
		butTab[1].setForeground(Color.decode("#3399ff"));
		butTab[1].setBounds(w2-10,0,w2+20,h3);
		  
		butTab[2] = new JLabel("ENTREPRISE",(int) CENTER_ALIGNMENT);
		butTab[2].setForeground(Color.decode("#0059b3"));
		butTab[2].setBounds(2*w2+10,0,w2,h3);
		
		butTab[3] = new JLabel("ASSISTANCE",(int) CENTER_ALIGNMENT);
		butTab[3].setForeground(Color.decode("#e6e600"));
		butTab[3].setBounds(3*w2,0,w2+15,h3);
		
		butTab[4] = new JLabel("LE GROUPE MAROC TELECOM",(int) CENTER_ALIGNMENT);
		butTab[4].setForeground(Color.decode("#808080"));
		butTab[4].setBounds(4*w2+15,0,2*w2-10,h3);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(width*2/10,h1-h3,w1-10,h3);
//		menuBar.setBackground(Color.decode("#0d0d0d"));
		menuBar.setLayout(null);
		for(int i = 0;i<5;i++){
			butTab[i].addMouseListener(cont);
			butTab[i].setFont(new Font("adelle sans reguler",Font.BOLD,17));
			butTab[i].setBackground(Color.decode("#0d0d0d"));
			butTab[i].setOpaque(true);
			menuBar.add(butTab[i]);
		}
		int a=46,bw=width*2/7;
			location[0] = "phone.png";
			location[1] = "fixe.png";
			location[2] = "net.png";
			img[0] = new ImageIcon(new ImageIcon(location[0]).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			l[1]=new JLabel("<html><br><br>MOBILE<br><br><html>",img[0],JLabel.CENTER);
			l[1].setHorizontalTextPosition(JLabel.CENTER);
			l[1].setVerticalTextPosition(JLabel.BOTTOM);
			
			img[1] = new ImageIcon(new ImageIcon(location[1]).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			l[2]=new JLabel("<html><br><br>FIXE<br><br><html>",img[1],JLabel.CENTER);
			l[2].setHorizontalTextPosition(JLabel.CENTER);
			l[2].setVerticalTextPosition(JLabel.BOTTOM);
			
			img[2] = new ImageIcon(new ImageIcon(location[2]).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			l[3]=new JLabel("<html><br><br>INTERNET<br><br><html>",img[2],JLabel.CENTER);
			l[3].setHorizontalTextPosition(JLabel.CENTER);
			l[3].setVerticalTextPosition(JLabel.BOTTOM);

		for(int i=1;i<4;i++){
			l[i].setBounds(a,50,bw,height*4/10-30);
			l[i].setFont(new Font("INFORMAL011 BT", Font.BOLD, 20));
			l[i].setForeground(Color.decode("#808080"));
			l[i].setBackground(Color.decode("#1a1a1a"));
			l[i].addMouseListener(cont);
			l[i].setOpaque(true);
			a=a+bw+12;
			tabPan[0].add(l[i]);
		}
		l[4]=new JLabel("Maroc Telecom met à votre disposition le service de paiement en ligne qui vous permet de régler vos factures du Fixe, Mobile et Internet en ligne par carte bancaire en toute sécurité.");
		l[4].setBounds(width/60+20,0,width*29/30,50);
		l[4].setForeground(Color.WHITE);
		
		l[5]=new JLabel(" Besoin d'assistance? Consultez le guide en ligne",(int) CENTER_ALIGNMENT); 
		l[5].setBounds(width/2-180,h0*5/6-75,300,20);
		l[5].setForeground(Color.decode("#ff8000"));
		l[5].addMouseListener(cont);
		
		l[6] = new JLabel("Conditions générales d'utilisation de ce service",(int) CENTER_ALIGNMENT);
		l[6].setBounds(width/2-180,h0*5/6-55,300,20);
		l[6].setForeground(Color.decode("#ff8000"));
		l[6].addMouseListener(cont);
		
		tabPan[0].add(l[4]);
		tabPan[0].add(l[5]);
		tabPan[0].add(l[6]);
				//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		tabPan[1].add(l[0]);
		tabPan[1].add(menuBar);
		((JComponent) getContentPane()).setBorder(new LineBorder(Color.BLUE, 2));
		c.setBackground(Color.decode("#0d0d0d"));
		c.add(tabPan[0]);
		c.add(tabPan[1]);
		c.add(tabPan[2]);
		setBounds(100,0,width,height);
		setTitle("Mini Projet");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JLabel[] getButTab(){
		return butTab;
	}
	public void setBackg(int i){
		butTab[i].setBackground(butTab[i].getForeground());
		butTab[i].setForeground(Color.WHITE);
	}
	public void removeBackg(int i){
		butTab[i].setForeground(butTab[i].getBackground());
		butTab[i].setBackground(Color.decode("#0d0d0d"));
	}
	public void setIcon(int i,int a){
		int b = 100;
		b+=a*5;
		img[i-1] = new ImageIcon(new ImageIcon(location[i-1]).getImage().getScaledInstance(b,b, Image.SCALE_DEFAULT));
		l[i].setIcon(img[i-1]);
	}
	public JLabel[] getL() {
		// TODO Auto-generated method stub
		return l;
	}
	public void switche(int i) {
		// TODO Auto-generated method stub
		if(i==1){
			tabPan[3] = new JPanel();
			tabPan[4] = new JPanel();
			c.remove(tabPan[0]);
			c.remove(tabPan[2]);
			tabPan[3].setBounds(20,width/10+5,width-70,width/8);
			tabPan[4].setBounds(20,width/8+width/10+12,width-70,height-width/8-width/10-54+400);
			c.add(tabPan[3]);
			c.add(tabPan[4]);
			
			repaint();
			v = new View1(this,tabPan[3],tabPan[4],1200,775,cont);

			repaint();
		}
		if(i==0){
			c.remove(tabPan[0]);
			c.remove(tabPan[2]);
			if(tabPan[3]!=null){
				c.remove(tabPan[3]);
				c.remove(tabPan[4]);
				c.remove(v.getSC());
			}
			c.add(tabPan[0]);
			c.add(tabPan[2]);
			repaint();
		}
	}
	public JFrame getF(){
		return this;
	}
	public JPanel getP() {
		// TODO Auto-generated method stub
		return (JPanel) c;
	}
	public View1 getV(){
		return v;
	}
}
