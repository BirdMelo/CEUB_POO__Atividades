package computer;

public class Processor {
    private String brand;
    private String hz;

    public Processor(String brand, String hz) {
        this.brand = brand;
        this.hz = hz;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getHz() {
        return hz;
    }

    public void setHz(String hz) {
        this.hz = hz;
    }
}
