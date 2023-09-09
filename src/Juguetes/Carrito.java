package src.Juguetes;

public class Carrito implements Juguete{
    private int id;
    private String marca;
    private int numeroPuertas;
    private String color;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public Carrito(int id, String marca, int numeroPuertas, String color) {
        this.id = id;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }

    public static CarritoBuilder builder(){
        return new CarritoBuilder();
    }

    public static class CarritoBuilder {
        private int id;
        private String marca;
        private int numeroPuertas;
        private String color;

        public CarritoBuilder(){
        }

        public CarritoBuilder id(int id){
            this.id = id;
            return this;
        }

        public CarritoBuilder marca(String marca){
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeroPuertas(int numeroPuertas){
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public CarritoBuilder color(String color){
            this.color = this.color;
            return this;
        }

        public Carrito build(){
            return new Carrito(id, marca, numeroPuertas, color);
        }

    }
}
