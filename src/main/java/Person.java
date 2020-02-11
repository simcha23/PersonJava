import java.util.ArrayList;
public class Person {
    private String name;
    private int age;
    private String gender;
    private ArrayList interests;
    public Person(String name, int age, String gender, ArrayList interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    public String getGender() {
        return gender;
    }
    public ArrayList getInterests() {
        return interests;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String Hello() {

        ArrayList last = new ArrayList();
          for(int i=0; i<interests.size()-1;i++){
              last.add(interests.get(i));
          }

        String items = last.toString();
        items = items.substring(1,items.length()-1);

        String output ="Hello, My name is " + name + " and I am " + age + " years old. My interests are being a " + items + " and " + interests.get(interests.size()-1) + ".";
        return output;

    }
}