class Student {
    String name ;
    int age;

    Student(){
        name = "unknown";
        age = 0;
    }
    Student(String name){
        this.name = name;
        age = 0;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("name :" + name);
        System.out.println("age :" + age);
    }
}
class constructor{
    static void main(String[]args){
        Student s1 = new Student();
        Student s2 = new Student("hasan");
        Student s3 = new Student("saimon", 22);

        s1.display();
        s2.display();
        s3.display();

    }
}