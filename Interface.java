interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable{
    private String name;

    public Duck(String name){
        this.name = name;
    }
    @Override
    public void fly(){
        System.out.println(name + " flies over the pond");
    }
     @Override
    public void swim(){
        System.out.println(name + " swims across the pond");
    }
}

class Interface{
    public static void main(String[] args) {
        Duck d = new Duck("King");
        d.fly();
        d.swim();
    }
}