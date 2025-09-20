package computer;

public class RAMMemory {
    private int GBs;
    private String type;

    public RAMMemory(int gbs, String type) {
        this.GBs = gbs;
        this.type = type;
    }

    public int getGBs() {
        return GBs;
    }

    public void setGBs(int GBs) {
        this.GBs = GBs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
