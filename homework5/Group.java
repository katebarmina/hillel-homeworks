import java.util.Arrays;

public class Group {
    private Student[] students = new Student[0];
    private String name;
    private Course course;
    private int size = 0;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
        size++;
    }

    public Group(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Group(Student[] students, String name, Course course) {
        this.students = students;
        this.name = name;
        this.course = course;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", name='" + name + '\'' +
                ", course=" + course.getCourseNumber() +
                '}';
    }
}
