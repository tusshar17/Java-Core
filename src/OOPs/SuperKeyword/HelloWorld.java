package OOPs.SuperKeyword;


class Father{
    int a = 10;
}


class Son extends Father{
    int a = 20;

    void display(){
        System.out.println("Value of A : " + a);
        System.out.println("Value of A from super class : " + super.a);
    }
}


public class HelloWorld {

    public static void main(String[] args) {
        Son obj = new Son();
        obj.display();
    }
}
