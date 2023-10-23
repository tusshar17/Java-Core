package OOPs;

class Calculator{

    int a, b, total;

    void add(){
        total = a +b;
    }
}

public class HelloWorld {

    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        calc1.a = 70;
        calc1.b = 30;
        calc1.add();
        System.out.println("Addition : " + calc1.total);
    }
}
