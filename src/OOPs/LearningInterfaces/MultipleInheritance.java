package OOPs.LearningInterfaces;


class FatherClass{                      // Super Class
    int a = 10;                         // Instance Variable

    int add(int y){                     // Method
        int b = y;                      // Local Variable
        return a+b;
    }
}


interface MotherInterface{              // Interface
    int c = 30;                         // Public Static Final

    void display();                     // Abstract Method
}


class SonClass extends FatherClass implements MotherInterface{

    int m = a * MotherInterface.c;       // accessing class and interface variables
    int sum = add(20);                   // calling method

    public void display() {              // Defining interface abstract method
        System.out.println("Addition : " + sum);
        System.out.println("Multiplication : " + m);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        SonClass obj = new SonClass();
        obj.display();
    }
}
