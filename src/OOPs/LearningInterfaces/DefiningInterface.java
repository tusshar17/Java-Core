package OOPs.LearningInterfaces;

public class DefiningInterface {

    public static void main(String[] args) {
        Son1 obj = new Son1();
        obj.display();

        Son2 obj1 = new Son2();
        obj1.display();
        obj1.add();
    }
}


// defining an interface
interface Father{

    public static final int mark = 100;
    int roll = 102; // by default public static final

    // all methods in interface are by default public
    public void display();
    // int add(int x, int y);
}


//
interface Mother{
    int mark = 200;
    void add();
}


// one interface extending another interface
interface Son extends Father{
    int attendance = 75;
    void putData();
}


// one interface extending more than one interface
interface Daughter extends Father, Mother{
    int attendance = 85;
    void putData();
}


// ------- Implementing Interface ---------

// one class implements one interface
class Son1 implements Father{
    int mark1 = 20;
    int sum = Father.mark + mark1;
    public void display(){
        System.out.println("Roll : " + Father.roll);
        System.out.println("Total Marks : " + sum);
    }
}


// one class implementing more than one interfaces
class Son2 implements Father, Mother{

    public void display(){
        System.out.println("Roll : " + Father.roll);
    }

    public void add(){
        int sum = Father.mark + Mother.mark;
        System.out.println("Sum : " + sum);
    }

}