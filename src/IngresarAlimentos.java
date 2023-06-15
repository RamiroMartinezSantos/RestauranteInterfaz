import java.util.ArrayList;
public class IngresarAlimentos {
    public ArrayList<Alimentos> alimentos;
    public IngresarAlimentos(){alimentos = new ArrayList<>();}
    public void ingresar(ArrayList<Alimentos> alimentos, String nombre, String descripcion, String precio){
        alimentos.add(new Alimentos(nombre,descripcion,precio));
    }
    public ArrayList<Alimentos> getAlimentos() {
        return alimentos;
    }
}

