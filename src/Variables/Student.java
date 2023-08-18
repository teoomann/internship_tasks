package Variables;

public class Student extends Person {

    private String school;

    public Student(String name, String surname, String age, String school) {
        super(name, surname, age);
        this.school = school;
    }

    public Student() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String getSurname() {
        return "Soyadı=" + super.getSurname();
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
