public class Main {
    public static void main(String[] args) {
        Parser p = new Parser();

        if(args.length != 2) {
            System.out.println("Incorrect usage, type " + " '-h help' " + 
                " for help");
            return;
        }

        if("-m".equals(args[0])) {
            System.out.println(p.convertTextToMorse(args[1]));
        } else if("-d".equals(args[0])) {
            Display d = new Display();
            try {
                d.displayMorseAsLight(p.convertTextToMorse(args[1]));
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } else if("-t".equals(args[0])) {
            System.out.println(p.convertMorseToText(args[1]));
        } else if("-h".equals(args[0])) { 
            System.out.println("To translate from text to morse: " + 
                "-m <Text>");
            System.out.println("To translate from morse to text: " + 
                "-t <MorseCode>");
            System.out.println("To see a visual representation of text in " +
                "morse code: -d <Text>");
        } else {
            System.out.println("Incorrect usage, type -h for help");
        }
    }
}

// TODO: fix incorrect input for -t and -d and -m and so on...