import java.util.ArrayList;

public class IngresarBebdidas {
    public ArrayList<Bebidas> bebidas;
    public IngresarBebdidas(){bebidas = new ArrayList<>();}
    public void ingresar(ArrayList<Bebidas> bebidas, String nombre, String descripcion, String precio){
        bebidas.add(new Bebidas(nombre,descripcion,precio));
    }
    public ArrayList<Bebidas> getBebidas() {
        return bebidas;
    }
}

