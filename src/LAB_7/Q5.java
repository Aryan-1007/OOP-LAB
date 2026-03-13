package LAB_7;

abstract class ProjectBase {
    public abstract void debug();
}

class ModuleA extends ProjectBase {
    public void debug() {
        System.out.println("Debugging Module A");
    }
}

class ModuleB extends ProjectBase {
    public void debug() {
        System.out.println("Debugging Module B");
    }
}

public class Q5 {
    public static void main(String[] args) {
        ProjectBase a = new ModuleA();
        ProjectBase b = new ModuleB();

        a.debug();
        b.debug();
    }
}
