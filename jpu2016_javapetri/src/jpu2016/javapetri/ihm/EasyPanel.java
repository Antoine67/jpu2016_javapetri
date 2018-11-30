package jpu2016.javapetri.ihm;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import jpu2016.javapetri.model.JavaPetri;

public class EasyPanel extends JPanel implements Observer{
	private static final long serialVersionUID = 3987064896591403626L;
	private final JavaPetri javaPetri;
public EasyPanel(final JavaPetri javaPetri){
	this.javaPetri = javaPetri;
	
}
public void update(final Observable arg0, final Object arg1) {
	 this.repaint();
	 }
protected void paintComponent(final Graphics graphics) {
	 graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
	 graphics.drawString("Step : " + this.javaPetri.getStep(), 0, 20);
	 graphics.drawString("JavaCell alive : " +
	this.javaPetri.getNbJavaCellAlive(), 0, 40);
	 graphics.drawString("JavaCell dead : " + this.javaPetri.getNbJavaCellDead(),
	0, 60);
	 } 

}
