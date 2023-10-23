package models;

public class Console {
    private String name;
    private String gen;
    private int inage;

    public Console(String name, String gen, int inage) {
        this.name = name;
        this.gen = gen;
        this.inage = inage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getInage() {
        return inage;
    }

    public void setInage(int inage) {
        this.inage = inage;
    }
}
