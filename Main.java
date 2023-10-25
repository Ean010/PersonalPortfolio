public class Main {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("abc");
        System.out.println ("Student name: " +s.getName());

        s.setAge(20);
        System.out.println ("Student age: " +s.getAge());
    }
}

class Student{
    private String name;
    private int age;

    public String getName() {
      return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }
}