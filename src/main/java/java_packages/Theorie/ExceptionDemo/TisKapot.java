package java_packages.Theorie.ExceptionDemo;

public class TisKapot extends RuntimeException {

    private String wrom;

    public TisKapot(String message, String wrom) {
        super(message);
        this.wrom = wrom;
    }

    public String getWrom() {
        return wrom;
    }
}
