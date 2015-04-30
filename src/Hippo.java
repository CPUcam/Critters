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
import java.util.Random;

public class Hippo extends Critter {

    private int count;
    private int maxHunger;
    private int moveCount;
    private boolean isHungry;
    private Random rand;
    private int r;
    //Constructor
    public Hippo (int hunger, int seed) {
        maxHunger = hunger;
        isHungry = true;
        rand = new Random(seed);
        count = hunger;
        moveCount = 1;
        r = rand.nextInt(4);
    }
    //Gray if hungry, white if not hungry
    public Color getColor() {
        if (isHungry) {
            return Color.GRAY;
        }
        return Color.WHITE;
    }
    //Eats for the amount of times it was hungry, then does not eat.
    public boolean eat() {
         if (count <= maxHunger && count > 0) {
             count--;
             if (count == 0) {
                 isHungry = false;
             }
             return true;
         }
         return false;
    }
    //Scratches if hungry, pounces is not hungry
    public Attack fight(String opponent) {
        if (isHungry) {
            return Attack.SCRATCH;
        }
        return Attack.POUNCE;
    }
    //Moves in random direction for five movements, then picks new random direction
    public Direction getMove() {
        Direction d = Direction.CENTER;
        if (moveCount <=5) {
            moveCount++;
            if (r == 0) {
                d = Direction.NORTH;
            } else if (r == 1) {
                d = Direction.SOUTH;
            } else if (r == 2) {
                d = Direction.EAST;
            } else if (r == 3) {
                d = Direction.WEST;
            }
        }
            if (moveCount > 5) {
                r = rand.nextInt(4);
                moveCount = 1;
            }
        return d;
    }
    //Returns amount of hunger until it reaches zero
    public String toString() {
        return "" + count;
    }
}