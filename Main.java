public class Main {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "abc";
        System.out.println ("Student name: " +s.name);
    }
}

class Student{
    private String name;
}