

// 1. Abstract Class: Student
abstract class Student {
    private String name;
    protected int age;
    // Constructor-ka Student
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

// 2. Class-ka CollageStudent
class CollageStudent extends Student {
    String schoolName;

    public CollageStudent(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    public void display() {
        System.out.println(" Collage Student");
        System.out.println("Magaca: " + getName());
        System.out.println("age: " + age);
        System.out.println("school name: " + schoolName);
    }
}

class UniversityStudent extends Student {
    String universityName;

    public UniversityStudent(String name, int age, String universityName) {
        super(name, age);
        this.universityName = universityName;
    }

    @Override
    public void display() {
        System.out.println(" University Student");
        System.out.println("Name : " + getName());
        System.out.println("Age: " + age);
        System.out.println("university name: " + universityName);
    }
}

// 4. Class-ka Undergraduate
class Undergraduate extends UniversityStudent {
    String project;

    public Undergraduate(String name, int age, String universityName, String project) {
        super(name, age, universityName);
        this.project = project;
    }

    @Override
    public void display() {
        System.out.println(" Undergraduate Student");
        System.out.println("Name : "+ getName());
        System.out.println("Age : " + age);
        System.out.println("university Name: " + universityName);
        System.out.println("Project : " + project);
    }
}










