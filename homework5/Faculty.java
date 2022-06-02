import java.util.Arrays;
import java.util.Objects;

public class Faculty {
    private Course[] courses = new Course[0];
    private int size = 0;
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        Course[] newCourses = new Course[courses.length + 1];
        System.arraycopy(courses, 0, newCourses, 0, courses.length);
        newCourses[newCourses.length - 1] = course;
        courses = newCourses;
        size++;
    }

    public Faculty(Course[] courses, String name) {
        this.courses = courses;
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "courses=" + Arrays.toString(courses) +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
