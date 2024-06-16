import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] input = openInputWindow();
        Parser p = new Parser();

        /*if(inputs[0].equals("-h")) {
            printHelp();
        }

        if(args.length != 2) {
            System.out.println("Incorrect usage, type " + " '-h' " + 
                " for help");
            return;
        }

        if("-morse".equals(args[0])) {
            System.out.println(p.convertTextToMorse(args[1]));
        } else if("-d".equals(args[0])) {
            Display d = new Display();
            try {
                d.displayMorseAsLight(p.convertTextToMorse(args[1]));
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else if("-text".equals(args[0])) {
            System.out.println(p.convertMorseToText(args[1]));
        } else {
            System.out.println("Incorrect usage, type -h for help");
        }*/
    }

    public static void printHelp() {
        System.out.println("To translate from text to morse: " + 
             "-m <Text>");
         System.out.println("To translate from morse to text: " + 
             "-t <MorseCode>");
         System.out.println("To see a visual representation of text in " +
            "morse code: -d <Text>");
    }

    public static String[] openInputWindow() {
        JFrame window = new JFrame("Morse Input");
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.PAGE_AXIS));

        JComboBox jcb = new JComboBox(new String[]{"-morse", "-text"});

        JTextArea jta = new JTextArea(5, 20);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);

        JButton jb = new JButton("Translate");

        window.add(jcb);
        window.add(jta);
        window.add(jb);
        window.setVisible(true);

        return new String[]{"a", "b"};
    }
}

