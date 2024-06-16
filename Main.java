import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        String[] input = inputWindow();
        Parser p = new Parser();

    }

    public static void printHelp() {
        System.out.println("To translate from text to morse: " + 
             "-m <Text>");
         System.out.println("To translate from morse to text: " + 
             "-t <MorseCode>");
         System.out.println("To see a visual representation of text in " +
            "morse code: -d <Text>");
    }

    public static String[] inputWindow() {
        JFrame window = new JFrame("Morse Input");
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.PAGE_AXIS));

        JComboBox jcb = new JComboBox(new String[]{"-morse", "-text"});

        JTextArea jta = new JTextArea(5, 20);
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);

        JButton jb = new JButton("Translate");

        String[] output = new String[2];

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output[0] = (String)jcb.getSelectedItem();
                output[1] = jta.getText();
                System.out.println(Arrays.toString(output));
            }
        });

        window.add(jcb);
        window.add(jta);
        window.add(jb);
        window.setVisible(true);


        return output;
    }
}

