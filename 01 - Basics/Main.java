// 1
// class Student{
//     String name;
//     int age;
//     void display (){
//         System.out.println("Name:"+name);
//         System.out.println("age:"+age);

//     }
// }
// class Main{
//     static void main(String[]args){
//         Student s1 = new Student();
//         s1.name ="saimon";
//         s1.age =22;

//         Student s2 = new Student();
//         s2.name = "robiul";
//         s2.age = 23;

//         s1.display();
//         s2.display();
//     }
// }


// 2
// class Student {

//     String name;                  // Instance variable
//     static String university = "ABC University";  // Static variable
// }

// class Main{
//     public static void main(String[] args) {

//     Student s1 = new Student();
//     s1.name = "Saimon";

//     Student s2 = new Student();
//     s2.name = "Rahim";

//     System.out.println("Student 1 Name: " + s1.name);
//     System.out.println("Student 1 University: " + s1.university);

//     System.out.println("Student 2 Name: " + s2.name);
//     System.out.println("Student 2 University: " + s2.university);
//     }
// }


// 3
// class Student{
//     String name;
//     int age;

//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     void display(){
//         System.out.println("name: "+name);
//         System.out.println("age "+age);
//     }
// }
// class Main{
//     static void main(String[]args){
//         Student s1 = new Student("saimmon", 22);
//         Student s2 = new Student("robiul", 33);

//         s1.display();
//         s2.display();
//     }
// }