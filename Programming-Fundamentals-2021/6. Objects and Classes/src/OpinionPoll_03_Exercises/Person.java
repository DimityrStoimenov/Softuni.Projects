package OpinionPoll_03_Exercises;

public class Person {
    private String person;
    private int age;

    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    public String getPerson() {

        return person;
    }

    public void setPerson(String person) {

        this.person = person;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
