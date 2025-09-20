package University;

public class Teacher {
    private String name;
    private int TRN;

    public Teacher( String name, int TRN) {
        this.name = name;
        this.TRN = TRN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTRN() {
        return TRN;
    }

    public void setTRN(int TRN) {
        this.TRN = TRN;
    }
}
