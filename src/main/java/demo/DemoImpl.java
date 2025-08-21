package demo;

public class DemoImpl implements IDemo{
    @Override
    public double getdata() {
        System.out.println("version base de donnees");
        return 202.5;

    }
}
