package OOPs.AbstractClass;


abstract class Father{
    abstract void display();
}

class Son extends Father{
    void display(){
        System.out.println("Abstract method defined in Son class");
    }
}

class Daughter extends Father{
    void display(){
        System.out.println("Abstract method defined in Daughter class");
    }
}


public class Example {

    public static void main(String[] args) {

        Son son = new Son();
        son.display();

        Daughter daughter = new Daughter();
        daughter.display();
    }
}
