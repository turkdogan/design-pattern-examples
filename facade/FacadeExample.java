/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
import java.util.List;
import java.util.ArrayList;

public class FacadeExample {

    public static void main(String[] args) {
        SchoolFacade schoolFacade = new SchoolFacade();
        schoolFacade.addStudent(new Student(1, "Yuruyen Coni"));
        schoolFacade.addStudent(new Student(2, "Fargolarin Oglan"));
        schoolFacade.addTeacher(new Teacher(1, "Coni Lesh"));

        schoolFacade.listStudents();
        schoolFacade.listTeachers();
    }
}

class Teacher {

    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}

class TeacherDatabase {

    private List<Teacher> teacherList = new ArrayList<Teacher>();

    public void addTeacher(final Teacher teacher) {
        teacherList.add(teacher);
    }

    public void listTeachers() {
        for (final Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}

class StudentDatabase {

    private List<Student> studentList = new ArrayList<Student>();

    public void addStudent(final Student teacher) {
        studentList.add(teacher);
    }

    public void listStudents() {
        for (final Student student : studentList) {
            System.out.println(student);
        }
    }

}

class SchoolFacade {

    private StudentDatabase studentDatabase = new StudentDatabase();
    private TeacherDatabase teacherDatabase = new TeacherDatabase();

    public void addStudent(final Student student) {
        studentDatabase.addStudent(student);
    }

    public void listStudents() {
        studentDatabase.listStudents();
    }

    public void addTeacher(final Teacher teacher) {
        teacherDatabase.addTeacher(teacher);
    }

    public void listTeachers() {
        teacherDatabase.listTeachers();
    }
}
