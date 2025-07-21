class Student{
    private String name;
    Student(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }
}

public class Programmer {
    public static void main(String[] args) {
        Student s = new Student("kuldeep");
        System.out.println(s.getName());
    }
}
