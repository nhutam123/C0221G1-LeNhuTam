package model.bean;

public class Degree {
    private int id;
    private String degree;

    public Degree() {
    }

    public Degree(int id, String degree) {
        this.id = id;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
