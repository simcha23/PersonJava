import org.junit.Assert;
import org.junit.Test;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


public class PersonTest {

    @Test
    public void testEmptyName(){


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

        Assert.assertEquals(person.Hello(),"Hello, " +
                "My name is Ryan and I am 30 years old. My interests are being a hardarse, agile and ssd hard drives.");

        Assert.assertEquals(person.Hello(),"Hello, " + "My name is Ryan and I am 30 years old. My interests are being a hardarse, agile and ssd hard drives.");
        Assert.assertEquals(person.getName(),"Ryan");
        Assert.assertEquals(person.getAge(),30);
        Assert.assertEquals(person.getGender(),"male");
        Assert.assertEquals(person.getInterests(), Arrays.asList("hardarse, agile, ssd hard drives") );
    }
}
