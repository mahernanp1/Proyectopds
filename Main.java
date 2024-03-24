import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    private JButton boton_aceptar1;
    private JButton boton_aceptar3;
    private JButton boton_aceptar2;
    private JButton boton_aceptar4;
    private JButton boton_aceptar5;
    private JTextField texto_nombre;
    private JTextField texto_edad;
    private JTextField texto_genero;
    private JTextField texto_dieta;
    private JTextField texto_dieta;
    private JLabel label_nombre;
    private JLabel label_edad;
    private JLabel label_genero;
    private JLabel label_dieta;
    private JLabel label_horas de sueño;
    private JLabel label_medicamentos;
    private JTextField texto_medicamentos;
    private JButton boton_aceptar6;

    public MyPanel() {
        //construct components
        boton_aceptar1 = new JButton ("aceptar");
        boton_aceptar3 = new JButton ("aceptar");
        boton_aceptar2 = new JButton ("aceptar");
        boton_aceptar4 = new JButton ("aceptar");
        boton_aceptar5 = new JButton ("aceptar");
        texto_nombre = new JTextField (5);
        texto_edad = new JTextField (5);
        texto_genero = new JTextField (5);
        texto_dieta = new JTextField (5);
        texto_dieta = new JTextField (5);
        label_nombre = new JLabel ("Nombre:");
        label_edad = new JLabel ("Edad:");
        label_genero = new JLabel ("Genero:");
        label_dieta = new JLabel ("Habitos alimenticios:");
        label_horas de sueño = new JLabel ("Horas de sueño:");
        label_medicamentos = new JLabel ("Medicamentos:");
        texto_medicamentos = new JTextField (5);
        boton_aceptar6 = new JButton ("aceptar");

        //set components properties
        label_nombre.setToolTipText ("ingrese su nombre");
        label_edad.setToolTipText ("ingrese su edad");
        label_genero.setToolTipText ("ingrese su genero");
        label_dieta.setToolTipText ("ingrese si tiene algun tipo de dieta");
        label_horas de sueño.setToolTipText ("ingrese sus horas de sueño");
        label_medicamentos.setToolTipText ("ingrese si ingiere algun medicamento");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 574));
        setLayout (null);

        //add components
        add (boton_aceptar1);
        add (boton_aceptar3);
        add (boton_aceptar2);
        add (boton_aceptar4);
        add (boton_aceptar5);
        add (texto_nombre);
        add (texto_edad);
        add (texto_genero);
        add (texto_dieta);
        add (texto_dieta);
        add (label_nombre);
        add (label_edad);
        add (label_genero);
        add (label_dieta);
        add (label_horas de sueño);
        add (label_medicamentos);
        add (texto_medicamentos);
        add (boton_aceptar6);

        //set component bounds (only needed by Absolute Positioning)
        boton_aceptar1.setBounds (230, 95, 100, 20);
        boton_aceptar3.setBounds (230, 155, 100, 20);
        boton_aceptar2.setBounds (230, 125, 100, 20);
        boton_aceptar4.setBounds (230, 180, 100, 20);
        boton_aceptar5.setBounds (230, 210, 100, 20);
        texto_nombre.setBounds (100, 90, 100, 25);
        texto_edad.setBounds (100, 120, 100, 25);
        texto_genero.setBounds (100, 150, 100, 25);
        texto_dieta.setBounds (125, 180, 100, 25);
        texto_dieta.setBounds (100, 210, 100, 25);
        label_nombre.setBounds (0, 95, 100, 25);
        label_edad.setBounds (0, 120, 100, 25);
        label_genero.setBounds (0, 150, 100, 25);
        label_dieta.setBounds (0, 180, 120, 25);
        label_horas de sueño.setBounds (0, 210, 100, 25);
        label_medicamentos.setBounds (0, 240, 100, 25);
        texto_medicamentos.setBounds (100, 240, 100, 25);
        boton_aceptar6.setBounds (230, 240, 100, 20);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
