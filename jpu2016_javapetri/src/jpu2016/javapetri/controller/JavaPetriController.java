package jpu2016.javapetri.controller;

import java.awt.Color;
import java.util.Random;

import jpu2016.javapetri.ihm.JavaPetriConsole;
import jpu2016.javapetri.model.JavaCell;
import jpu2016.javapetri.model.JavaPetri;
import jpu2016.javapetri.model.Position;

public class JavaPetriController {
	static private int WIDTH = 100;
	static private int HEIGHT = 100;
	static private int STRENGTH = 50;
	static private int NB_CELL_START = 10;
	private final JavaPetriConsole ihm;
	private final JavaPetri javaPetri;
	
	public JavaPetriController(){	
	this.javaPetri = new JavaPetri(100, 100);
	final Random rand = new Random();
		for (int i = 0; i < NB_CELL_START; i++) {
			javaPetri.addJavaCell(new JavaCell(javaPetri, new Position(rand.nextInt(WIDTH), rand.nextInt(HEIGHT)), STRENGTH, new Color(rand.nextInt())));
		}
		this.ihm = new JavaPetriConsole(this.javaPetri);
	}
	public void start(){
		
		this.javaPetri.animate();
	}
	}
