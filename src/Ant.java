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

import java.awt.*;

public class Ant extends Critter {

    private boolean walk;
    private int count;
    //constructor
    public Ant(boolean walkSouth) {
        walk = walkSouth;
        count = 0;
    }
    //Always eats
    public boolean eat() {
        return true;
    }
    //Always Scratches
    public Attack fight(String opponent) {
        return Attack.SCRATCH;
    }
    //If walkSouth is true, zig-zags S,E. Otherwise zig-zags N,E
    public Direction getMove() {
        Direction d = Direction.CENTER;
        count++;
        if (walk && count % 2 == 1) {
            d = Direction.SOUTH;
        }
        else if (walk && count % 2 == 0) {
            d = Direction.EAST;
        }
        else if (!walk && count % 2 == 0) {
            d = Direction.NORTH;
        }
        else if (!walk && count % 2 == 1) {
            d = Direction.EAST;
        }
        return d;
    }
    //Is Red
    public Color getColor() {
        return Color.RED;
    }
    //Returns "%"
    public String toString() {
        return "%";
    }
}