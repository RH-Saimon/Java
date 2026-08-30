class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    int StudentId;

    Student(String name, int age, int StudentId){
        super(name, age);

        this.StudentId = StudentId;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Student ID:"+StudentId);
    }
}
class Inheritance{
    public static void main(String[]args){
        Student s = new Student("Saimon", 22, 1092);
        s.display();
    }
}