class Calculator{

    int add(int a, int b){
        return a+b;        
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void sound(){
        System.out.println("animal sperks");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }

}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meews");
    }
}
class polymorpism{
    public static void main(String[]args){
        System.out.println("Method overloading");
        Calculator c = new Calculator();
        System.out.println("a+b:" +c.add(2,4));
        System.out.println("a+b:" +c.add(5.5,4.5));
        System.out.println("a+b+c:" +c.add(2,4, 4));

        System.out.println("Ovveriding");
        Animal a = new Dog();
        a.sound();
        Animal a1 = new Cat();
        a1.sound();
    }
}