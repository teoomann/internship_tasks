package Variables;

public class OgrenciSistemi {
    private String firstName;
    private String lastName;
    private int age;
    private String idNumber;

    public OgrenciSistemi(String firstName, String lastName, int age, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idNumber = idNumber;
    }

    public void print() {
        System.out.println("İsim: " + firstName);
        System.out.println("Soyisim: " + lastName);
        System.out.println("Yaş: " + age);
        System.out.println("Kimlik Numarası: " + idNumber);
    }
}

class Student extends OgrenciSistemi {
    private double gradeAverage;

    public Student(String firstName, String lastName, int age, String idNumber, double gradeAverage) {
        super(firstName, lastName, age, idNumber);
        this.gradeAverage = gradeAverage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dönem Sonu Not Ortalaması: " + gradeAverage);
    }
}
class Teacher extends OgrenciSistemi {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, int age, String idNumber, String department, String[] courses) {
        super(firstName, lastName, age, idNumber);
        this.department = department;
        this.courses = courses;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bölüm: " + department);
        System.out.println("Verdiği Dersler:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}
class Staff extends OgrenciSistemi {
    private String role;

    public Staff(String firstName, String lastName, int age, String idNumber, String role) {
        super(firstName, lastName, age, idNumber);
        this.role = role;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Görev Alanı: " + role);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ali", "Teoman", 20, "123456789", 85.5);
        Teacher teacher = new Teacher("Eva", "Okshituni", 35, "987654321", "Matematik", new String[]{"Mantık", "Geometri"});
        Staff staff = new Staff("Ahmet", "Demir", 40, "567890123", "Bina için Temizlik");

        OgrenciSistemi[] people = {student, teacher, staff};

        for (OgrenciSistemi person : people) {
            System.out.println("----------");
            person.print();
            System.out.println("----------");
        }
    }
}