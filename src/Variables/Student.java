package Variables;

public class Ogrenci extends Person {

    private String school;

    public Ogrenci(String name, String surname, String age, String school) {
        super(name, surname, age);
        this.school = school;
    }

    public Ogrenci() {
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
