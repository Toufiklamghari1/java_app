
package mini;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PasswordView;


public class View1{
    private int width,height;
    private JLabel[] l;
    private JPanel[] tabPan;
    //>>>>>>>>>>>>>>>>>>>
    private JTextField textTab[];
    private JLabel b1,b2;
    private JLabel labBut[];
    private JCheckBox chek;
    private JScrollBar sc;
    private JLabel[] erreur;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>
    public View1(View view, JPanel p0,JPanel p1, int w,int h, Controller cont){ 
    	width = w;
    	height =h;
    	l = new JLabel[10];
    	tabPan = new JPanel[3];
    	tabPan[0] = p0;
    	tabPan[1] = p1;
    	tabPan[1].setLayout(null);
		tabPan[1].setBackground(Color.decode("#0d0d0d"));
		tabPan[1].setBorder(BorderFactory.createMatteBorder( 0,width/50,0, width/50, Color.decode("#1a1a1a")));
		tabPan[0].setBackground(Color.DARK_GRAY);
		///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    	chek = new JCheckBox("<html>J'ai lu et j'accepte les conditions particulières d'utilisation, notamment la mention relative à la protection des données personnelles</html>");
    	labBut = new JLabel[10];
    	tabPan[2] = new JPanel();
    	tabPan[2].setBackground(Color.decode("#404040"));
    	tabPan[2].setBounds(40,70,width-150,height-200);
    	tabPan[2].setOpaque(true);
    	tabPan[2].setLayout(null);
    	tabPan[1].add(tabPan[2]);
    	
    	textTab = new JTextField[4];
    	try{
    		textTab[0] = new JFormattedTextField(new MaskFormatter(" 06 ## ## ## ## "));
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	tabPan[2].add(textTab[0]);
    	textTab[1] = new JPasswordField();
    	textTab[1].setDisabledTextColor(Color.BLACK);
    	textTab[1].setEnabled(false);
    	textTab[1].setForeground(Color.black);
    	textTab[1].setFont(new Font( "",Font.BOLD,40));
    	tabPan[2].add(textTab[1]);
    	
    	for(int i =2;i<4;i++){
    		textTab[i]= new JTextField();
    		textTab[i].setFont(new Font("", Font.BOLD, 17));
    		tabPan[2].add(textTab[i]);
    	}
    	for(int i =0;i<4;i++){
    		if(i!=1)
    			textTab[i].addKeyListener(cont);
    	}
    	
    	b1 = new JLabel("PAYER EN LIGNE",JLabel.CENTER);
    	b1.setBounds(width/2-155,height-73,140,30);
    	b1.setBackground(Color.decode("#ff8000"));
    	b1.setForeground(Color.white);
    	b1.setOpaque(true);
    	b1.addMouseListener(cont);
    	tabPan[1].add(b1);
    	
    	b2 = new JLabel("ANNULER",JLabel.CENTER);
    	b2.setBounds(width/2-10,height-73,120,30);
    	b2.setBackground(Color.decode("#ff8000"));
    	b2.setForeground(Color.white);
    	b2.setOpaque(true);
    	b2.addMouseListener(cont);
    	tabPan[1].add(b2);
    	
    	
    	l[0] = new JLabel("Paiement de facture en ligne",JLabel.CENTER);
    	l[2] = new JLabel("Exemple numéro téléphone (06 XX XX XX)");
    	l[3] = new JLabel("Saisissez votre Numéro de Téléphone Mobile :");
    	l[4] = new JLabel("Cliquez pour composer les chiffres de votre Code fidélio :");
    	l[5] = new JLabel("Saisissez votre adresse mail de notification");
    	l[6] = new JLabel("Confirmez votre adresse mail de notification");
    	l[1] = new JLabel("Pour consulter et payer en ligne vos factures du Mobile, veuillez suivre les étapes suivantes :");
    	l[7] = new JLabel("A propos du code fidélio : Vous pouvez récupérer votre code fidélio en envoyant un SMS au 1111 avec le texte « code »");
    	l[8] = new JLabel("<html>Conformément à la loi 09-08, vous disposez d'un droit d'accès, de rectification et d'opposition au traitement de vos données personnelles. Ce traitement a été déclaré à la CNDP sous le N°A-T 246/2013.</html>");
    	
		l[0].setForeground(Color.decode("#e6e6e6"));
		l[0].setBackground(Color.decode("#1a1a1a"));
		l[0].setFont(new Font("Verdana body copy", Font.BOLD, 20));
		l[0].setOpaque(true);
		l[0].setBounds(0, 0,width-56,width/40);
		tabPan[1].add(l[0]);
		
		l[1].setForeground(Color.white);
		l[1].setFont(new Font("", Font.BOLD, 15));
		l[1].setBounds(30,40,width-56,16);
		tabPan[1].add(l[1]);
		
		for(int i=3;i<7;i++){
			 l[i].setFont(new Font("", Font.BOLD, 16));
			 l[i].setForeground(Color.decode("#66b3ff"));
			 tabPan[2].add(l[i]);
		}
		
		l[3].setBounds(10,8,400,20);
		textTab[0].setBounds(15,42,300,40);
		textTab[0].setFont(new Font("", Font.BOLD, 17));
		l[2].setForeground(Color.decode("#999999"));
		l[2].setBounds(340,52,300,20);
		tabPan[2].add(l[2]);
		
		l[4].setBounds(10,110,440,20);
		int a=15,b=170,c=75,d=45;
		for(int i=0;i<10;i++){
			if(i<=4){
				labBut[i] = new JLabel(""+i,JLabel.CENTER);
				labBut[i].setForeground(Color.white);
				labBut[i].setFont(new Font("", Font.BOLD, 25));
				labBut[i].setBackground(Color.decode("#000000"));
				labBut[i].setOpaque(true);
				labBut[i].setBounds(a+i*c+i*5,b,c,d);
				labBut[i].addMouseListener(cont);
				tabPan[2].add(labBut[i]);
				if(i==4)
					b = b+d+5;
			}
			if(i>4){
				labBut[i] = new JLabel(""+i,JLabel.CENTER);
				labBut[i].setForeground(Color.white);
				labBut[i].setFont(new Font("", Font.BOLD, 25));
				labBut[i].setBackground(Color.decode("#000000"));
				labBut[i].setOpaque(true);
				labBut[i].setBounds(-25+a+(-5+i)*c+i*5,b,c,d);
				labBut[i].addMouseListener(cont);
				tabPan[2].add(labBut[i]);
			}
		}
		textTab[1].setBounds(500,200,250,30);
		textTab[1].setBackground(Color.decode("#e6e6e6"));
		
		l[7].setBounds(10,340,1000,20);
		l[7].setFont(new Font("", Font.BOLD, 16));
		l[7].setForeground(Color.decode("#f2f2f2"));
		tabPan[2].add(l[7]);
		
		l[5].setBounds(13,390,400,20);
		textTab[2].setBounds(20,430,450,40);
		tabPan[2].add(textTab[2]);
		
		l[6].setBounds(550,390,400,20);
		textTab[3].setBounds(555,430,450,40);
		tabPan[2].add(textTab[3]);
		
		l[8].setBounds(10,500,width-140,60);
		l[8].setFont(new Font("", Font.BOLD, 15));
		l[8].setForeground(Color.white);
		tabPan[2].add(l[8]);
		
		chek.setBounds(40,height-110,1000,25);
		chek.setFont(new Font("", Font.BOLD, 15));
		chek.setBackground(Color.decode("#0d0d0d"));
		chek.setForeground(Color.white);
		tabPan[1].add(chek);

		sc = new JScrollBar();
		sc.setBounds(width-36, 2, 17, 735);
		view.getContentPane().add(sc);
		sc.addAdjustmentListener(cont);
		
		erreur = new JLabel[4];
		erreur[0] = new JLabel("tu doit saisir 10 chiffre");
		erreur[1] = new JLabel("le code fedilio compose de 4 chifre");
		erreur[2] = new JLabel("tu doit saisir une address mail valid");
		erreur[3] = new JLabel("les deux address sont pas les meme");
		for(int i=0;i<erreur.length;i++){
			if(i==1)
				erreur[i].setBounds(textTab[i].getX()+5,textTab[i].getY()+30,300,20);
			else
				erreur[i].setBounds(textTab[i].getX()+5,textTab[i].getY()+40,300,20);
			erreur[i].setForeground(Color.decode("#ff471a"));
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    }
    public void setE(int i){
    	tabPan[2].add(erreur[i]);
    	textTab[i].setBorder(BorderFactory.createMatteBorder( 3,3,3,3, Color.decode("#ff3300")));
    	tabPan[2].repaint();
    }
    public void removeE(int i){
    	tabPan[2].remove(erreur[i]);
    	textTab[i].setBorder(BorderFactory.createMatteBorder( 3,3,3,3, Color.decode("#ffffff")));
    	tabPan[2].repaint();
    }
    public JScrollBar getSC(){
    	return sc;
    }
	public JTextField[] getTextTab() {
		return textTab;
	}
	public void setTextTab(JTextField[] textTab) {
		this.textTab = textTab;
	}
	public JLabel[] getL() {
		return l;
	}
	public JLabel getB1() {
		return b1;
	}
	public JLabel getB2() {
		return b2;
	}
	public JLabel[] getLabBut() {
		return labBut;
	}
	public JCheckBox getChek() {
		return chek;
	}
	public JScrollBar getSc() {
		return sc;
	}
}
