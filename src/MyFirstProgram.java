import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class MyFirstProgram {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setPenColor(Color.blue);
	    Tortoise.penDown();
	    Tortoise.move(50);
	    Tortoise.turn(90);
	    Tortoise.move(50);
	    Tortoise.turn(90);
	    Tortoise.move(50);
	    Tortoise.turn(90);
	    Tortoise.move(50);
	    Tortoise.turn(90);
		
	}
}
