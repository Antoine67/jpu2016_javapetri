import java.awt.Color;
import java.util.Random;

import jpu2016.javapetri.controller.JavaPetriController;
import jpu2016.javapetri.model.JavaCell;
import jpu2016.javapetri.model.JavaPetri;
import jpu2016.javapetri.model.Position;

public abstract class JavaPetriMain {

	public static void main(final String[] args) {
JavaPetriController javapetricontroller = new JavaPetriController();

javapetricontroller.start();

	}
}
