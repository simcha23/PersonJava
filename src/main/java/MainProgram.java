import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainProgram {
    private static Object ArrayList;

    public static void main(String args[]) {


        ArrayList<String> interests =new ArrayList<>();

        String firstName = JOptionPane.showInputDialog("Enter your Name");
        String age = JOptionPane.showInputDialog("Enter your Age");
        String gender = JOptionPane.showInputDialog("Enter your Gender");

        int count = 1;
        for(int x = 0 ; x <= interests.size() ; x++){

            String name = JOptionPane.showInputDialog("Enter your interest " + count + " or press 'Stop' to terminate");

            if(name.trim().equalsIgnoreCase("stop")){

                break;
            }
            interests.add(name);
            count++;
        }

        if(interests.size() == 0){
            interests.add("no interests");
        }

        Person person=new Person(firstName, Integer.parseInt(age), gender, interests);

        System.out.println(person.Hello());
    }
}
