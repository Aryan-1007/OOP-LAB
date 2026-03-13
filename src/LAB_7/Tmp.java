package LAB_7;

import java.util.*;

public class Tmp {
    public static void main(String[] args)
    {
        Tmp g = new Tmp();

        System.out.println("Hashcode is: " + g.hashCode());

        // Making the object eligible for garbage collection
        g = null;

        System.gc();
        System.out.println("Hashcode is: " + g.hashCode());
        // Adding a short delay to allow GC to act
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of the garbage collection");
    }

    // Defining the finalize method
    @Override protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}