package OOPs.MethodOverriding;


class Father{
    void display(){
        System.out.println("Father class display method called");
    }
}

class Son extends Father{
    void display(){
        System.out.println("Son class display method called");
    }
}

class Daughter extends Father{
    void display(){
        System.out.println("Daughter class display method called");
    }
}


public class Example {
    public static void main(String[] args) {

        // father object
        Father father = new Father();
        father.display();

        // son object
        Son son = new Son();
        son.display();

        // daughter object
        Daughter daughter = new Daughter();
        daughter.display();


    }
}
