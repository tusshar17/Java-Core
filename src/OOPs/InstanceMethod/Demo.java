package OOPs.InstanceMethod;

public class Demo {

    public void display(){
        System.out.println("I'm inside instance function display");
    }

    // nesting of an instance method
    public void sayHello(String name){
        System.out.println("Hello " + name);

        System.out.println("** calling instance method display() inside instance method sayHello() **");
        display(); // can call another instance method inside an instance method without creating any object
    }


    public static void main(String[] args) {

      //  display();    ----> can not call an instance method inside a static function without creating object

        Demo obj = new Demo();
        obj.display();

        System.out.println("=========================");

        obj.sayHello("World");

    }
}
