package LAB_3.Q4.figPackage;

public abstract class Figure {
    protected double r, a, v;
    protected double pi = 3.142;

    public abstract void calcArea();

    public abstract void calcVolume();

    public abstract void dispArea();

    public abstract void dispVolume();
}
