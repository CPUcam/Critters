/**
 * @authors: Student 1: Raul Camacho
 *
 *           
 * CS312 Assignment 11.
 *
 *  On my honor, Raul Camacho, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 * A class to simulate an environment with animals.
 *
 * Canvas Group Number: 20
 * Student 1: Raul Camacho
 * UTEID: rac3983
 * email address: rcamacho96@gmail.com
 * Section 5 digit ID: 51705
 * Grader name: Kaivan Wadia
 * Number of slip days used on this assignment: 0
 */

// Stone objects are displayed as S and always stay put.
// They always pick ROAR in a fight.
//
import java.awt.*;

public class Stone extends Critter {
	// method comment goes here
	public Attack fight(String opponent) {
		return Attack.ROAR;
	}

	// method comment goes here
	public Color getColor() {
		return Color.GRAY;
	}

	// method comment goes here
	public String toString() {
		return "S";
	}
}
