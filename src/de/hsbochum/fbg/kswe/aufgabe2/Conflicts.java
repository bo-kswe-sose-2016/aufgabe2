package de.hsbochum.fbg.kswe.aufgabe2;

/**
 *
 * @author Matthes Rieke <m.rieke@52north.org>
 */
public class Conflicts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculate the distance from 52N Office to HSBochum
        Point point52n = new Point(51.935025, 7.651961);
        Point pointHsb = new Point(51.447655, 7.270567);
        
        System.out.println(String.format("Distance between 52N Office and HS Bochum is %s",
                point52n.distanceTo(pointHsb)));
    }
    
}
