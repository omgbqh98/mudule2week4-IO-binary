import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int id;
    private int giaTien;

    public Product() {
    }

    public Product(String name, int id, int giaTien) {
        this.name = name;
        this.id = id;
        this.giaTien = giaTien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", giaTien=" + giaTien +
                '}';
    }
}
