/** 
* The Display class uses the Parser to convert given text or morse code into
* a flashing "light", being represented by changing the background of a panel
* to and from black based on the morse code.
*
* @author Meruzhan Sargsyan
*/

import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

class Display {
    private JFrame display;
    private JPanel panel;
    private final int XSIZE = 150;
    private final int YSIZE = 150;
    private final int DOTTIME = 1000; // 1 second
    private final int DASHTIME = 3000; // 3 seconds
    private final int TIMEBETWEENSYMBOLS = 1000; // 1 seconds
    private final int TIMEBETWEENLETTERS = 3000; // 3 seconds
    private final int TIMEBETWEENWORDS = 7000; // 7 seconds

    /** 
    * Constructor creates a JPanel and JFrame of size XSIZE and YSIZE
    * and adds the Panel to the Frame.
    * Sets the background of the frame to BLACK
    */
    Display() {
        display = new JFrame();
        panel = new JPanel();

        display.setSize(XSIZE, YSIZE);
        display.setDefaultCloseOperation(display.EXIT_ON_CLOSE);

        panel.setSize(XSIZE, YSIZE);
        panel.setBackground(Color.BLACK);

        display.add(panel);
        display.setVisible(true);
        display.show();
    }

    void displayMorseAsLight(String morseCode) {
        char[] arrMorse = morseCode.toCharArray();

        while(true) {
            for(int i = 0; i < arrMorse.length; i++) {
                try {
                    switch(arrMorse[i]) {
                        case '.':
                            lightOn(DOTTIME);
                            break;
                        case '-':
                            lightOn(DASHTIME);
                            break;
                        case '/':
                            Thread.sleep(TIMEBETWEENWORDS);
                    }
                } catch(Exception ex) {
                    System.out.println(ex.getMessage());
                }
                
            }
            try {
                Thread.sleep(TIMEBETWEENWORDS);   
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
             
        }
    }

    void lightOn(int time) {
        panel.setBackground(Color.WHITE);
        try {
            Thread.sleep(time);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        panel.setBackground(Color.BLACK);
        try {
            Thread.sleep(TIMEBETWEENSYMBOLS);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}