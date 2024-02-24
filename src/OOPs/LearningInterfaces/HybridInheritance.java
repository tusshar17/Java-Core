package OOPs.LearningInterfaces;

public class HybridInheritance {

    public static void main(String[] args) {
        Result res = new Result();
        res.display();
    }
}



class Student{
    int roll = 101;
    int practical = 50;
}


class Exam extends Student{
    int theory = 100;
    int pm = theory + practical;
}


interface Project{
    int pmark = 200;
    void display();
}


class Result extends Exam implements Project{
    int sum = pm + Project.pmark;

    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Theory: " + theory);
        System.out.println("Practical: " + practical);
        System.out.println("Project: " + Project.pmark);
        System.out.println("Total Marks: " + sum);
    }
}