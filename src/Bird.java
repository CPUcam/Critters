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

public class Bird extends Critter {
    private int count;
    private String prevMove;
    //Constructor
    public Bird() {
        count = 1;
        prevMove = ">";
    }
    //Is blue
    public Color getColor() {
        return Color.BLUE;
    }
    //Never eats, always false
    public boolean eat() {
        return false;
    }
    //Roars if opponent is ant, pounces otherwise
    public Attack fight(String opponent) {
        if (opponent.equals("%")) {
            return Attack.ROAR;
        }
        return Attack.POUNCE;
    }
    //north for 3, east for 3, south for 3, west for 3 and repeat
    public Direction getMove() {
        Direction d = Direction.CENTER;
        if (count <= 3) {
            prevMove = "^";
            d = Direction.NORTH;
        }
        else if (count > 3 && count <= 6) {
            prevMove = ">";
            d = Direction.EAST;
        }
        else if (count > 6 && count <= 9) {
            prevMove = "V";
            d = Direction.SOUTH;
        }
        else if (count > 9 && count <= 12) {
            prevMove = "<";
            d = Direction.WEST;
            if (count == 12) {
                count = 0;
            }
        }
        count++;
        return d;
    }
    //Returns string of the last move, determined in getMove()
    public String toString() {
        return prevMove;
    }
}