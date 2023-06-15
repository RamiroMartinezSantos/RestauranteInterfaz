import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {
    private JPanel paneliz, panelde, panelButton, panelForm, panelContainer;
    private JButton bebidas,comida;
    public MenuPrincipal() {

        initControl();
        configFrame();
        setControl();
        configPanel();
        add(panelContainer);
        query1();
        query();

    }

    private void query1(){
        bebidas.addActionListener(e -> {
            Menubebidas menubebidas = new Menubebidas();
            menubebidas.setVisible(true);
            this.setVisible(false);
        });
    }

    private void query(){
        comida.addActionListener(e -> {
            Formulario formulario = new Formulario();
            formulario.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){
        paneliz = new JPanel();
        panelde = new JPanel();
        panelButton = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();

        bebidas = new JButton();
        comida = new JButton();

    }



    private void configFrame(){
        setTitle("Restaurante");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(550, 300);
    }

    private void setControl(){
        bebidas.setText("Ingresar Bebidas");
        comida.setText("Ingresar Comida");
    }


    private void configPanel(){

        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(500, 100));

        panelForm.add(paneliz);
        panelForm.add(panelde);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(150, 50));
        panelButton.add(comida);
        panelButton.add(bebidas);

        panelContainer.setLayout(new GridLayout(4, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelButton);

        add(panelContainer);
    }
}
