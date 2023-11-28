package OOPs.Inheritance;


class Father{
    Father(){
        System.out.println("Constructor of Father Class");
    }
}

class Son extends Father{
    Son(){
        System.out.println("Constructor of Son Class");
    }
}

class GrandSon extends Son{
    GrandSon(){
        System.out.println("Constructor of Grandson class");
    }
}

public class MultiLevel_Inheritance {

    public static void main(String[] args) {
        GrandSon obj = new GrandSon();
        
    }
}
