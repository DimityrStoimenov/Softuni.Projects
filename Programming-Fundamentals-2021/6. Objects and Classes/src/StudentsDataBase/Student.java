package StudentsDataBase;

public class Student {
    private String firstName;
    private  String lastName;
    private int age;
    private String birthTown;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
   public void setAge(int age) {

        this.age = age;
    }
    public String getBirthTown() {

        return birthTown;
    }
    public void setBirthTown(String birthTown) {

        this.birthTown = birthTown;
    }
    public Student(String firstName, String lastName, int age, String birthTown) {
        this.firstName =firstName;
        this.lastName= lastName;
        this. age = age;
        this.birthTown= birthTown;
    }
}
