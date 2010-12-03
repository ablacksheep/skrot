import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Rasmus
 */

public class InterfaceTester {
    /**
     * 
     * 
     * Test interfaces
     */
    private static void applikasjon() {
        //Fetch the interface to be tested
    	InterfaceCommand frame = new InterfaceCommand();
    	frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                applikasjon();
            }
        });
    }
}