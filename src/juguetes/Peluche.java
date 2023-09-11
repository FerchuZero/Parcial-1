package src.juguetes;

public class Peluche implements Juguete {

    private int id;
    private String materialExterior;
    private String relleno;
    private String color;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public Peluche(int id, String materialExterior, String relleno, String color){
        this.id = id;
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

    public Peluche(Peluche peluche, int id){
        this.id = id;
        this.materialExterior = peluche.materialExterior;
        this.relleno = peluche.relleno;
        this.color = peluche.color;
    }

    public static PelucheBuilder builder(){
        return new PelucheBuilder();
    }

    public static class PelucheBuilder {

        private int id;
        private String materialExterior;
        private String relleno;
        private String color;

        public PelucheBuilder(){}

        public PelucheBuilder id(int id){
            this.id = id;
            return this;
        }

        public PelucheBuilder materialExterior(String materialExterior){
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color){
            this.color = color;
            return this;
        }

        public Peluche build(){
            return new Peluche(id, materialExterior, relleno, color);
        }

    }

    public Peluche clone(int id){
        return new Peluche(this, id);
    }

    public String toString() {
        return String.format("Peluche: Id: %3d | Material: %12s | Relleno: %13s | Color: %10s",
                             this.id, this.materialExterior, this.relleno, this.color);
    }

    public void setId(int id) {
        this.id = id;
    }

}
