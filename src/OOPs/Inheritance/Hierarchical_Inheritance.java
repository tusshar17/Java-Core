package OOPs.Inheritance;


class Dad{
    Dad(){
        System.out.println("Dad Constructor");
    }
}

class Beta extends Dad{
    Beta(){
        System.out.println("Beta Constructor");
    }
}

class Beti extends Dad{
    Beti(){
        System.out.println("Beti Constructor");
    }
}



public class Hierarchical_Inheritance {

    public static void main(String[] args) {

        // creating beta object
        Beta beta = new Beta();

        // creating beti object
        Beti beti = new Beti();
    }
}
