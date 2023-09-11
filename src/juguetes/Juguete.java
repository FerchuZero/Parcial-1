package src.juguetes;

public interface Juguete {
    String getColor();
    int getId();
    Juguete clone(int id);
    void setId(int id);
}
