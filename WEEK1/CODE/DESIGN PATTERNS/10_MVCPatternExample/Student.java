public class Student {
    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getGrade() { return grade; }
}