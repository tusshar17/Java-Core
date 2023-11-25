package OOPs.Inheritance;


class Parent{
    int a,b;

    void setData(int x, int y){
        a = x;
        b = y;
    }
}

class Child extends Parent{
    int add(){
        int sum = a+b;
        return sum;
    }

    void display(){
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Sum = " + add());
    }
}


public class SingleInheritance {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.setData(3,2);
        obj.display();
    }
}
