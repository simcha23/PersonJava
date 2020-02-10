import java.util.ArrayList;
public class Person {
    private String name;
    private int age;
    private String gender;
    private String[] interests;
    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    public String getGender() {
        return gender;
    }
    public String[] getInterests() {
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
        for(int i=0; i<interests.length-1;i++){
            last.add(interests[i]);
        }
        //assigning the last interest entered to a text string which i will use to display
        String text = last.toString();
        //The line above displays with square brackets
        //hence i use a substring to get only the text and not the square brackets
        text=text.substring(1,text.length()-1);
        String txt="Hello, My name is "+ name+" and I am " + age +" years old." +
                " My interests are being a " + text+ " "+ "and" + " " +(interests[interests.length-1])+".";
        return txt;
    }
}