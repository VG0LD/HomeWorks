package Test;

public class Empty {


    private int s;
    private int b;

    public Empty(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
//        return "first: " + s + "\nsecond: " + b;
        return String.format("First: %s", s);
    }
}
