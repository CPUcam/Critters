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

public class Vulture extends Bird {

    private boolean hungry;
    //Constructor
    public Vulture() {
        hungry = true;
    }
    //Is black
    public Color getColor() {
        return Color.BLACK;
    }
    //Doesn't eat if not hungry, eats if hungry
    public boolean eat() {
        if (hungry) {
            hungry = false;
            return true;
        }
        else return true;
    }
    //Roars if opponent is ant, pounces otherwise
    public Attack fight(String opponent) {
        hungry = true;
        if (opponent.equals("%")) {
            return Attack.ROAR;
        }
        return Attack.POUNCE;
    }
}