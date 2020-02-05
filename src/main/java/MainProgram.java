public class MainProgram {
    public static void main(String args[]) {


        Person person=new Person("Ryan", 30, "male",new String[]{
                "hardarse", "agile", "ssd hard drives"
        });

        System.out.println(person.Hello());
    }
}
