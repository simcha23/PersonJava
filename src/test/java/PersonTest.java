import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testEmptyName(){



        Person person = new Person("Ryan", 30, "male",new String[]{
                "hardarse", "agile", "ssd hard drives"
        });

//        Assert.assertEquals(person.Hello(),"Hello, " +
//                "My name is Ryan and I am 30 years old. My interests are being a hardarse, agile and ssd hard drives.");

        Assert.assertEquals(person.Hello(),"Hello, " + "My name is Ryan and I am 30 years old. My interests are being a hardarse, agile and ssd hard drives.");
        Assert.assertEquals(person.getName(),"Ryan");
        Assert.assertEquals(person.getAge(),30);
        Assert.assertEquals(person.getGender(),"male");
        Assert.assertEquals(person.getInterests(),new String[]{
                "hardarse", "agile", "ssd hard drives"});
    }
}
