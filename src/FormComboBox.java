import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FormComboBox extends JFrame implements ItemListener {

    private JPanel paneliz, panelde,  panelRadio, panelForm, panelContainer;
    private JLabel nombre, apellidos, telefono, ine, listEstados ,estado;
    private JComboBox<String> estados;
    private JButton btnQuery;
    private JTextField text1, text2, text3, text4, text5;
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup buttonGroup;

    private static final String[] listaEstados = ListaEstados.listaEstados;

    public FormComboBox() {
        initControl();
        configFrame();
        setControl();
        configPanel();
        llenarCombo();
        add(panelContainer);
        estados.addItemListener(this);

    }
    private void query(){
        btnQuery.addActionListener(e -> {
            Formulario formulario = new Formulario();
            formulario.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){
        paneliz = new JPanel();
        panelde = new JPanel();
        panelRadio = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        nombre = new JLabel();
        apellidos = new JLabel();
        telefono = new JLabel();
        ine = new JLabel();
        estado = new JLabel();
        listEstados = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        estados = new JComboBox<>();
        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        radio3 = new JRadioButton();
        btnQuery = new JButton();
        buttonGroup = new ButtonGroup();
    }

    private void configFrame(){
        setTitle("formulario.Formulario");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(450, 380);
    }

    private void setControl(){
        nombre.setText("Nombre:");
        apellidos.setText("Apellidos:");
        telefono.setText("Telefono:");
        ine.setText("INE");
        listEstados.setText("Lista Estados:");
        estado.setText("Estado:");
        radio1.setText("Deshabilita uno");
        radio2.setText("Deshabilita dos");
        radio3.setText("Deshabilita todo");
    }



    private void configPanel(){
        paneliz.setLayout(new GridLayout(6, 0));
        paneliz.add(nombre);
        paneliz.add(apellidos);
        paneliz.add(telefono);
        paneliz.add(ine);
        paneliz.add(listEstados);
        paneliz.add(estado);

        panelde.setLayout(new GridLayout(6, 0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);
        panelde.add(estados);
        panelde.add(text5);

        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(380, 200));
        panelForm.add(paneliz);
        panelForm.add(panelde);

        panelRadio.setLayout(new FlowLayout());
        panelRadio.setPreferredSize(new Dimension(380, 50));
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        buttonGroup.add(radio3);
        panelRadio.add(radio1);
        panelRadio.add(radio2);
        panelRadio.add(radio3);

        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelRadio);
    }


    private void llenarCombo(){
        for (String s: listaEstados) {
            estados.addItem(s);
        }
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == estados){
            String item = (String) estados.getSelectedItem();
            text5.setText(item);
        }
    }
}