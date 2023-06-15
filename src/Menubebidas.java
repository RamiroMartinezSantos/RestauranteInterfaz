import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menubebidas extends JFrame {
IngresarBebdidas ingresarBebdidas = new IngresarBebdidas();
private JPanel paneliz, panelde, panelButton, panelForm, panelContainer;
private JLabel nombrebebida,describcionbebida,preciobebida;
private JTextField text1, text2, text3;
private JButton btnQuery,boton1,regresar;
private static ArrayList<Bebidas> lista = new ArrayList<>();
EventClick eventClick = new EventClick();
public Menubebidas() {

    initControl();
    configFrame();
    setControl();
    configPanel();
    add(panelContainer);
    query();
    query1();

}

private void query(){
    btnQuery.addActionListener(e -> {
        MostrarBebidas mostrarBebidas = new MostrarBebidas();
        mostrarBebidas.setVisible(true);
        this.setVisible(false);
    });
}

    private void query1(){
        regresar.addActionListener(e -> {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.setVisible(false);
        });
    }

private void initControl(){
    paneliz = new JPanel();
    panelde = new JPanel();
    panelButton = new JPanel();
    panelForm = new JPanel();
    panelContainer = new JPanel();

    nombrebebida = new JLabel();
    describcionbebida = new JLabel();
    preciobebida = new JLabel();


    text1 = new JTextField();
    text2 = new JTextField();
    text3 = new JTextField();

    boton1 = new JButton();
    btnQuery = new JButton();
    regresar = new JButton();

}



private void configFrame(){
    setTitle("Menu Comida");
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setResizable(false);
    setSize(550, 300);
}

private void setControl(){

    nombrebebida.setText("Nombre de la bebida");
    describcionbebida.setText("Describcion de la bebida");
    preciobebida.setText("Precio de la bebida");

    boton1.setText("Aceptar");
    btnQuery.setText("Consultar");
    regresar.setText("Regresar");
}


private void configPanel(){

    paneliz.setLayout(new GridLayout(6, 0));
    paneliz.add(nombrebebida);
    paneliz.add(describcionbebida);
    paneliz.add(preciobebida);


    panelde.setLayout(new GridLayout(6, 0));
    panelde.add(text1);
    panelde.add(text2);
    panelde.add(text3);

    panelForm.setLayout(new GridLayout(1, 1));
    panelForm.setPreferredSize(new Dimension(500, 100));

    panelForm.add(paneliz);
    panelForm.add(panelde);

    panelButton.setLayout(new FlowLayout());
    panelButton.setPreferredSize(new Dimension(150, 50));
    panelButton.add(boton1);
    boton1.addActionListener(eventClick);
    panelButton.add(btnQuery);
    panelButton.add(regresar);

    panelContainer.setLayout(new GridLayout(4, 0));
    panelContainer.add(panelForm);
    panelContainer.add(panelButton);

    add(panelContainer);
}
public static ArrayList<Bebidas> getElemento(){
    return lista;
}

    public class EventClick implements ActionListener {
        public EventClick(){
            lista = new ArrayList<>();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = text1.getText();
            String descripcion = text2.getText();
            String precio = text3.getText();

            lista.add(new Bebidas(nombre,descripcion,precio));

            ingresarBebdidas.ingresar(ingresarBebdidas.getBebidas(),nombre,descripcion,precio);

            text1.setText(" ");
            text2.setText(" ");
            text3.setText(" ");
        }
    }
}

