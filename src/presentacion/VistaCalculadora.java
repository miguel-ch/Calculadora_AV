package presentacion;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel
 */
public class VistaCalculadora extends javax.swing.JFrame {

    /* Modelo y controlador */
    private final Modelo modelo;
    private final Controlador controlador;

    /* Constructor */
    public VistaCalculadora(Modelo modelo) {

        /* Constructor clase padre */
        super("Calculadora");
        initComponents();

        /* Agrega el modelo y el controlador */
        this.modelo = modelo;
        this.controlador = new Controlador(this);
    }

    /* Getters */
    public Controlador getControlador() {
        return controlador;
    }

    public Modelo getModelo() {
        return modelo;
    }

    //Proceso y numero
    public JLabel getLblProceso() {
        return lblProceso;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    //Botones
    public JButton getBtnBorraDigito() {

        return btnBorraDigito;
    }

    public JButton getBtnBorraTodo() {
        return btnBorraTodo;
    }

    public JButton getBtnBorraNumero() {
        return btnBorraNumero;
    }

    public JButton getBtnCero() {
        return btnCero;
    }

    public JButton getBtnCinco() {
        return btnCinco;
    }

    public JButton getBtnCuadrado() {
        return btnCuadrado;
    }

    public JButton getBtnCuatro() {
        return btnCuatro;
    }

    public JButton getBtnDivision() {
        return btnDivision;
    }

    public JButton getBtnDos() {
        return btnDos;
    }

    public JButton getBtnInverso() {
        return btnInverso;
    }

    public JButton getBtnIgual() {
        return btnIgual;
    }

    public JButton getBtnMemoriaLimpiar() {
        return btnMemoriaLimpiar;
    }

    public JButton getBtnMemoriaAlmacena() {
        return btnMemoriaAlmacena;
    }

    public JButton getBtnMemoriaAgregar() {
        return btnMemoriaAgregar;
    }

    public JButton getBtnMemoriaSustraer() {
        return btnMemoriaSustraer;
    }

    public JButton getBtnMemoriaRecuperar() {
        return btnMemoriaRecuperar;
    }

    public JButton getBtnInformacion() {
        return btnInformacion;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnNueve() {
        return btnNueve;
    }

    public JButton getBtnOcho() {
        return btnOcho;
    }

    public JButton getBtnPorcentaje() {
        return btnPorcentaje;
    }

    public JButton getBtnPunto() {
        return btnPunto;
    }

    public JButton getBtnRaiz() {
        return btnRaiz;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JButton getBtnSeis() {
        return btnSeis;
    }

    public JButton getBtnSiete() {
        return btnSiete;
    }

    public JButton getBtnSigno() {
        return btnSigno;
    }

    public JButton getBtnSuma() {
        return btnSuma;
    }

    public JButton getBtnTres() {
        return btnTres;
    }

    public JButton getBtnUno() {
        return btnUno;
    }

    //Metodo initComponents();
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        lblProceso = new javax.swing.JLabel();
        btnMemoriaAlmacena = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnMemoriaSustraer = new javax.swing.JButton();
        btnMemoriaAgregar = new javax.swing.JButton();
        btnBorraNumero = new javax.swing.JButton();
        btnMemoriaLimpiar = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnInverso = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnBorraTodo = new javax.swing.JButton();
        btnBorraDigito = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMemoriaRecuperar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnSigno = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();

        setBackground(new java.awt.Color(60, 60, 60));
        setMinimumSize(new java.awt.Dimension(370, 500));
        getContentPane().setLayout(null);

        pnlContenido.setBackground(new java.awt.Color(60, 60, 60));
        pnlContenido.setMaximumSize(new java.awt.Dimension(370, 500));
        pnlContenido.setMinimumSize(new java.awt.Dimension(370, 500));
        pnlContenido.setPreferredSize(new java.awt.Dimension(370, 500));
        pnlContenido.setLayout(null);

        lblProceso.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblProceso.setForeground(new java.awt.Color(186, 186, 186));
        lblProceso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProceso.setMaximumSize(new java.awt.Dimension(350, 20));
        lblProceso.setMinimumSize(new java.awt.Dimension(350, 20));
        lblProceso.setPreferredSize(new java.awt.Dimension(350, 20));
        lblProceso.setRequestFocusEnabled(false);
        pnlContenido.add(lblProceso);
        lblProceso.setBounds(10, 10, 350, 20);

        btnMemoriaAlmacena.setBackground(new java.awt.Color(51, 51, 51));
        btnMemoriaAlmacena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMemoriaAlmacena.setForeground(new java.awt.Color(255, 255, 255));
        btnMemoriaAlmacena.setText("MS");
        btnMemoriaAlmacena.setBorder(null);
        btnMemoriaAlmacena.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMemoriaAlmacena.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMemoriaAlmacena.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnMemoriaAlmacena);
        btnMemoriaAlmacena.setBounds(250, 95, 50, 30);

        btnInformacion.setBackground(new java.awt.Color(51, 51, 51));
        btnInformacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/informacion.png"))); // NOI18N
        btnInformacion.setBorder(null);
        btnInformacion.setMaximumSize(new java.awt.Dimension(50, 50));
        btnInformacion.setMinimumSize(new java.awt.Dimension(50, 50));
        btnInformacion.setOpaque(false);
        btnInformacion.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnInformacion);
        btnInformacion.setBounds(310, 95, 50, 30);

        btnMemoriaSustraer.setBackground(new java.awt.Color(51, 51, 51));
        btnMemoriaSustraer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMemoriaSustraer.setForeground(new java.awt.Color(255, 255, 255));
        btnMemoriaSustraer.setText("M-");
        btnMemoriaSustraer.setBorder(null);
        btnMemoriaSustraer.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMemoriaSustraer.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMemoriaSustraer.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnMemoriaSustraer);
        btnMemoriaSustraer.setBounds(190, 95, 50, 30);

        btnMemoriaAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnMemoriaAgregar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMemoriaAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnMemoriaAgregar.setText("M+");
        btnMemoriaAgregar.setBorder(null);
        btnMemoriaAgregar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMemoriaAgregar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMemoriaAgregar.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnMemoriaAgregar);
        btnMemoriaAgregar.setBounds(130, 95, 50, 30);

        btnBorraNumero.setBackground(new java.awt.Color(51, 51, 51));
        btnBorraNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorraNumero.setForeground(new java.awt.Color(255, 255, 255));
        btnBorraNumero.setText("CE");
        btnBorraNumero.setBorder(null);
        btnBorraNumero.setMaximumSize(new java.awt.Dimension(50, 50));
        btnBorraNumero.setMinimumSize(new java.awt.Dimension(50, 50));
        btnBorraNumero.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnBorraNumero);
        btnBorraNumero.setBounds(100, 135, 80, 50);

        btnMemoriaLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnMemoriaLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMemoriaLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnMemoriaLimpiar.setText("MC");
        btnMemoriaLimpiar.setBorder(null);
        btnMemoriaLimpiar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMemoriaLimpiar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMemoriaLimpiar.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnMemoriaLimpiar);
        btnMemoriaLimpiar.setBounds(10, 95, 50, 30);

        btnPorcentaje.setBackground(new java.awt.Color(51, 51, 51));
        btnPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorder(null);
        btnPorcentaje.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPorcentaje.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPorcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnPorcentaje);
        btnPorcentaje.setBounds(10, 135, 80, 50);

        btnInverso.setBackground(new java.awt.Color(51, 51, 51));
        btnInverso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnInverso.setForeground(new java.awt.Color(255, 255, 255));
        btnInverso.setText("1/x");
        btnInverso.setBorder(null);
        btnInverso.setMaximumSize(new java.awt.Dimension(50, 50));
        btnInverso.setMinimumSize(new java.awt.Dimension(50, 50));
        btnInverso.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnInverso);
        btnInverso.setBounds(10, 195, 80, 50);

        btnCuadrado.setBackground(new java.awt.Color(51, 51, 51));
        btnCuadrado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        btnCuadrado.setText("x²");
        btnCuadrado.setBorder(null);
        btnCuadrado.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCuadrado.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCuadrado.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnCuadrado);
        btnCuadrado.setBounds(100, 195, 80, 50);

        btnBorraTodo.setBackground(new java.awt.Color(51, 51, 51));
        btnBorraTodo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorraTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnBorraTodo.setText("C");
        btnBorraTodo.setBorder(null);
        btnBorraTodo.setMaximumSize(new java.awt.Dimension(50, 50));
        btnBorraTodo.setMinimumSize(new java.awt.Dimension(50, 50));
        btnBorraTodo.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnBorraTodo);
        btnBorraTodo.setBounds(190, 135, 80, 50);

        btnBorraDigito.setBackground(new java.awt.Color(51, 51, 51));
        btnBorraDigito.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorraDigito.setForeground(new java.awt.Color(255, 255, 255));
        btnBorraDigito.setText("<");
        btnBorraDigito.setBorder(null);
        btnBorraDigito.setMaximumSize(new java.awt.Dimension(70, 50));
        btnBorraDigito.setMinimumSize(new java.awt.Dimension(70, 50));
        btnBorraDigito.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnBorraDigito);
        btnBorraDigito.setBounds(280, 135, 80, 50);

        btnDivision.setBackground(new java.awt.Color(51, 51, 51));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("÷");
        btnDivision.setBorder(null);
        btnDivision.setMaximumSize(new java.awt.Dimension(70, 50));
        btnDivision.setMinimumSize(new java.awt.Dimension(70, 50));
        btnDivision.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnDivision);
        btnDivision.setBounds(280, 195, 80, 50);

        btnMemoriaRecuperar.setBackground(new java.awt.Color(51, 51, 51));
        btnMemoriaRecuperar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMemoriaRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnMemoriaRecuperar.setText("MR");
        btnMemoriaRecuperar.setBorder(null);
        btnMemoriaRecuperar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMemoriaRecuperar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMemoriaRecuperar.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnMemoriaRecuperar);
        btnMemoriaRecuperar.setBounds(70, 95, 50, 30);

        btnRaiz.setBackground(new java.awt.Color(51, 51, 51));
        btnRaiz.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setText("√");
        btnRaiz.setBorder(null);
        btnRaiz.setMaximumSize(new java.awt.Dimension(50, 50));
        btnRaiz.setMinimumSize(new java.awt.Dimension(50, 50));
        btnRaiz.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnRaiz);
        btnRaiz.setBounds(190, 195, 80, 50);

        btnMultiplicar.setBackground(new java.awt.Color(51, 51, 51));
        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("×");
        btnMultiplicar.setBorder(null);
        btnMultiplicar.setMaximumSize(new java.awt.Dimension(70, 50));
        btnMultiplicar.setMinimumSize(new java.awt.Dimension(70, 50));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnMultiplicar);
        btnMultiplicar.setBounds(280, 255, 80, 50);

        btnNueve.setBackground(new java.awt.Color(102, 102, 102));
        btnNueve.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.setBorder(null);
        btnNueve.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNueve.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNueve.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnNueve);
        btnNueve.setBounds(190, 255, 80, 50);

        btnOcho.setBackground(new java.awt.Color(102, 102, 102));
        btnOcho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.setBorder(null);
        btnOcho.setMaximumSize(new java.awt.Dimension(50, 50));
        btnOcho.setMinimumSize(new java.awt.Dimension(50, 50));
        btnOcho.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnOcho);
        btnOcho.setBounds(100, 255, 80, 50);

        btnSiete.setBackground(new java.awt.Color(102, 102, 102));
        btnSiete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setBorder(null);
        btnSiete.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSiete.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSiete.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnSiete);
        btnSiete.setBounds(10, 255, 80, 50);

        btnCuatro.setBackground(new java.awt.Color(102, 102, 102));
        btnCuatro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.setBorder(null);
        btnCuatro.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCuatro.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCuatro.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnCuatro);
        btnCuatro.setBounds(10, 315, 80, 50);

        btnCinco.setBackground(new java.awt.Color(102, 102, 102));
        btnCinco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setBorder(null);
        btnCinco.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCinco.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCinco.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnCinco);
        btnCinco.setBounds(100, 315, 80, 50);

        btnSeis.setBackground(new java.awt.Color(102, 102, 102));
        btnSeis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setBorder(null);
        btnSeis.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSeis.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSeis.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnSeis);
        btnSeis.setBounds(190, 315, 80, 50);

        btnRestar.setBackground(new java.awt.Color(51, 51, 51));
        btnRestar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.setBorder(null);
        btnRestar.setMaximumSize(new java.awt.Dimension(70, 50));
        btnRestar.setMinimumSize(new java.awt.Dimension(70, 50));
        btnRestar.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnRestar);
        btnRestar.setBounds(280, 315, 80, 50);

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setBorder(null);
        btnSuma.setMaximumSize(new java.awt.Dimension(70, 50));
        btnSuma.setMinimumSize(new java.awt.Dimension(70, 50));
        btnSuma.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnSuma);
        btnSuma.setBounds(280, 375, 80, 50);

        btnTres.setBackground(new java.awt.Color(102, 102, 102));
        btnTres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setBorder(null);
        btnTres.setMaximumSize(new java.awt.Dimension(50, 50));
        btnTres.setMinimumSize(new java.awt.Dimension(50, 50));
        btnTres.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnTres);
        btnTres.setBounds(190, 375, 80, 50);

        btnDos.setBackground(new java.awt.Color(102, 102, 102));
        btnDos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.setBorder(null);
        btnDos.setMaximumSize(new java.awt.Dimension(50, 50));
        btnDos.setMinimumSize(new java.awt.Dimension(50, 50));
        btnDos.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnDos);
        btnDos.setBounds(100, 375, 80, 50);

        btnUno.setBackground(new java.awt.Color(102, 102, 102));
        btnUno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setBorder(null);
        btnUno.setMaximumSize(new java.awt.Dimension(50, 50));
        btnUno.setMinimumSize(new java.awt.Dimension(50, 50));
        btnUno.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnUno);
        btnUno.setBounds(10, 375, 80, 50);

        btnSigno.setBackground(new java.awt.Color(102, 102, 102));
        btnSigno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSigno.setForeground(new java.awt.Color(255, 255, 255));
        btnSigno.setText("±");
        btnSigno.setBorder(null);
        btnSigno.setMaximumSize(new java.awt.Dimension(50, 50));
        btnSigno.setMinimumSize(new java.awt.Dimension(50, 50));
        btnSigno.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnSigno);
        btnSigno.setBounds(10, 435, 80, 50);

        btnCero.setBackground(new java.awt.Color(102, 102, 102));
        btnCero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.setBorder(null);
        btnCero.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCero.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCero.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnCero);
        btnCero.setBounds(100, 435, 80, 50);

        btnPunto.setBackground(new java.awt.Color(102, 102, 102));
        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(null);
        btnPunto.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPunto.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPunto.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlContenido.add(btnPunto);
        btnPunto.setBounds(190, 435, 80, 50);

        btnIgual.setBackground(new java.awt.Color(0, 0, 102));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(null);
        btnIgual.setMaximumSize(new java.awt.Dimension(70, 50));
        btnIgual.setMinimumSize(new java.awt.Dimension(70, 50));
        btnIgual.setPreferredSize(new java.awt.Dimension(70, 50));
        pnlContenido.add(btnIgual);
        btnIgual.setBounds(280, 435, 80, 50);

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(60, 60, 60));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumero.setText("0");
        txtNumero.setBorder(null);
        pnlContenido.add(txtNumero);
        txtNumero.setBounds(10, 34, 350, 50);

        getContentPane().add(pnlContenido);
        pnlContenido.setBounds(0, 0, 370, 500);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorraDigito;
    private javax.swing.JButton btnBorraNumero;
    private javax.swing.JButton btnBorraTodo;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnInverso;
    private javax.swing.JButton btnMemoriaAgregar;
    private javax.swing.JButton btnMemoriaAlmacena;
    private javax.swing.JButton btnMemoriaLimpiar;
    private javax.swing.JButton btnMemoriaRecuperar;
    private javax.swing.JButton btnMemoriaSustraer;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSigno;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel lblProceso;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
