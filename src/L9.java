import javax.swing.JOptionPane;


public class L9{

    public static void main(String[] args) {

       String firstName;
       String lastName;

       firstName = JOptionPane.showInputDialog("What be your name?");
       lastName = JOptionPane.showInputDialog("What is your last name?");

        JOptionPane.showMessageDialog(null, " Hello There " + firstName +  " " + lastName + "!!");

        //ALL INPUT US CONSIDERED STRING DATA

        //Pro tip: Separate like data type variables on one line with a comma
        int mph, minutes;
        double hours, distance;

        mph = Integer.parseInt(JOptionPane.showInputDialog("What was your speed?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, in minutes, did you travel?"));

       hours = minutes/60.0;
       distance = hours * mph;

       JOptionPane.showMessageDialog(null, "You Traveled " + distance + " miles.");



        System.exit(0);
    }


}
