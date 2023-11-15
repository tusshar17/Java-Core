package OOPs.StaticMethod;

public class StaticMethod_vs_InstanceVariable {
    
    int instanceVariable = 5;
    
    static int staticVariable = 10;

    public static void main(String[] args) {
        
        // accessing static variable
        System.out.println(staticVariable);
        
        // accessing instance variable
//        System.out.println(instanceVariable); ----> will throw an exception
    }
}
