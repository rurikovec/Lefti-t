package GreenFoxOrganization;

public class Mentor extends GreenFoxOrganization.Person {

    String level;

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers");
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        level = "intermediate";
    }
}
