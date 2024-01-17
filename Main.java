public class Main {
    public static void main(String[] args) {
        Parser p = new Parser();

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
        }
    }
}