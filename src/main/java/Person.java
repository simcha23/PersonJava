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
        String txt="Hello, My name is "+ name+" and I am " + age +" years old." +
                " My interests are being a " + interests[0] + ", "+interests[1]+" and "+interests[2] + ".";
       return txt;
    }




}
