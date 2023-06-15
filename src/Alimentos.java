public class Alimentos {
    public String nombre;
    public String descripcion;
    public String precio;
    public Alimentos(String nombre, String descripcion, String precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return nombre + "nombre" + descripcion + "descripcion" + precio + "precio";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }
}
