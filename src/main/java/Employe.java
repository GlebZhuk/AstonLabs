public class Employe {

    private String status;
    private String fullName;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employe(String status, String fullName, String email, String number, int salary, int age) {
        this.status = status;
        this.fullName = fullName;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "status='" + status + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public static void aboutPeople(Employe employe) {
        System.out.println(employe.toString());
    }
}
