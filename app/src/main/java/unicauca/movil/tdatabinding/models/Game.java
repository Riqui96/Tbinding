package unicauca.movil.tdatabinding.models;



public class Game {
    String nombre, genero, img, descripcion;
    boolean mayor18;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMayor18() {
        return mayor18;
    }

    public void setMayor18(boolean mayor18) {
        this.mayor18 = mayor18;
    }
}
