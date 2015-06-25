import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the variable in
 * this recipe. 2. ask students what Tortoise commands they think they will use
 * to make picture in the laminated hand-outs.
 */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 350; // the size of the black part of the star
		int flameSize = 250; // the length of the flaming arm

		Tortoise.setX(1000);
		Tortoise.setY(370);

	

		Tortoise.show();
	Tortoise.setAnimal(Animals.Spider);


		Tortoise.setSpeed(10);

	
		for (int i = 0; i < 120; i++) {
			Tortoise.turn(45);

			Tortoise.move(64);
			Tortoise.setPenColor(Colors.getRandomColor());

			Tortoise.turn(-40);

			Tortoise.move(flameSize);

			Tortoise.turn(170);

			Tortoise.move(flameSize);

			Tortoise.turn(64);
			  Tortoise.setPenColor(Color.black);
			Tortoise.move(baseSize);

		}

		


	}

}
