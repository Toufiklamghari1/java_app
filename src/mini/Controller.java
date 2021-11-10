package mini;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ScrollPaneConstants;
import javax.swing.Scrollable;

public class Controller implements KeyListener, ActionListener, MouseListener, AdjustmentListener {
	private Model m;
		private View v;
		private int a=0;
	public Controller(View v,Model model) {
		// TODO Auto-generated constructor stub
		this.v = v;
		this.m = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		for(int i=0;i<v.getV().getTextTab().length;i++){
			if(e.getSource().equals(v.getV().getTextTab()[i]))
				v.getV().removeE(i);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(v.getV().getB1())){
			if(v.getV().getTextTab()[0].getText().length()!=8)
				v.getV().setE(0);
			for(int i=1;i<v.getV().getTextTab().length;i++){
				if(v.getV().getTextTab()[i].getText().equals(""))
					v.getV().setE(i);
			}
			if(!v.getV().getTextTab()[2].getText().contains("@")){
				v.getV().setE(2);
			}
			if(!v.getV().getTextTab()[2].getText().equals(v.getV().getTextTab()[3].getText())){
				v.getV().getTextTab()[2].setText("");
				v.getV().getTextTab()[3].setText("");
				v.getV().setE(2);
				v.getV().setE(3);
			}
		}
		if(e.getSource().equals(v.getV().getB2())){
			System.out.println("annuler");	
		}
		for(int i=0;i<v.getV().getLabBut().length;i++){
			if(e.getSource().equals(v.getV().getLabBut()[i])){
				if(a==4)
					return;
				else{
					System.out.println("toufik");
					a++;
					v.getV().removeE(1);
					v.getV().getTextTab()[1].setText(v.getV().getTextTab()[1].getText()+i);
					return;
				}
				
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<v.getButTab().length;i++){
			if(e.getSource().equals(v.getButTab()[i])){
				v.setBackg(i);
				return;
			}
		}
		for(int i=1;i<4;i++){
			if(e.getSource().equals(v.getL()[i])){
				v.setIcon(i,1);
				return;
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<v.getButTab().length;i++){
			if(e.getSource().equals(v.getButTab()[i])){
				v.removeBackg(i);
				return;
			}
		}
		for(int i=1;i<4;i++){
			if(e.getSource().equals(v.getL()[i])){
				v.setIcon(i,-1);
				return;
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<v.getButTab().length;i++){
			if(e.getSource().equals(v.getButTab()[i])){
				System.out.println("but tab");
				return;
			}
				
		}
		if(e.getSource().equals(v.getL()[0])){
			v.switche(0);
			return;
		}
		for(int i=1;i<4;i++){
			if(e.getSource().equals(v.getL()[1])){
				v.switche(1); 
				return;
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		a= 40/10;
		v.getP().setBounds(0,-a*e.getValue(),1200,775+a*e.getValue());
		v.getV().getSC().setBounds(1200-36, 2+a*e.getValue(), 17, 735);
		return;
	}
	private void setBorder(int i){
		v.getV().getTextTab()[i].setBorder(BorderFactory.createMatteBorder( 3,3,3,3, Color.decode("#ff3300")));
	}

}
