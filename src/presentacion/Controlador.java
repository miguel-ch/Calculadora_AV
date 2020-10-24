/*
 *  Header
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Miguel
 */
public class Controlador {

    /* Vista y modelo */
    private final VistaCalculadora vista;
    private final Modelo modelo;

    public Controlador(VistaCalculadora vista) {
        this.vista = vista;
        this.modelo = vista.getModelo();
        Handler handler = new Handler();

        /* Listeners botones */
        this.vista.getBtnCero().addActionListener(handler);
        this.vista.getBtnUno().addActionListener(handler);
        this.vista.getBtnDos().addActionListener(handler);
        this.vista.getBtnTres().addActionListener(handler);
        this.vista.getBtnCuatro().addActionListener(handler);
        this.vista.getBtnCinco().addActionListener(handler);
        this.vista.getBtnSeis().addActionListener(handler);
        this.vista.getBtnSiete().addActionListener(handler);
        this.vista.getBtnOcho().addActionListener(handler);
        this.vista.getBtnNueve().addActionListener(handler);

        /* Operaciones */
        this.vista.getBtnSuma().addActionListener(handler);
        this.vista.getBtnRestar().addActionListener(handler);
        this.vista.getBtnMultiplicar().addActionListener(handler);
        this.vista.getBtnDivision().addActionListener(handler);
        this.vista.getBtnRaiz().addActionListener(handler);
        this.vista.getBtnCuadrado().addActionListener(handler);
        this.vista.getBtnInverso().addActionListener(handler);
        this.vista.getBtnPorcentaje().addActionListener(handler);

        /* Botones de signo, punto, igual */
        this.vista.getBtnPunto().addActionListener(handler);
        this.vista.getBtnSigno().addActionListener(handler);
        this.vista.getBtnIgual().addActionListener(handler);

        /* Botones auxiliares */
        this.vista.getBtnBorraDigito().addActionListener(handler);
        this.vista.getBtnBorraNumero().addActionListener(handler);
        this.vista.getBtnBorraTodo().addActionListener(handler);
        this.vista.getBtnInformacion().addActionListener(handler);

        /* Botones de Memoria */
        this.vista.getBtnMemoriaLimpiar().addActionListener(handler);
        this.vista.getBtnMemoriaAlmacena().addActionListener(handler);
        this.vista.getBtnMemoriaRecuperar().addActionListener(handler);
        this.vista.getBtnMemoriaAgregar().addActionListener(handler);
        this.vista.getBtnMemoriaSustraer().addActionListener(handler);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            /* Numeross */
            if (e.getSource() == vista.getBtnCero()) {
                modelo.actualizaNumero("0");
            }
            if (e.getSource() == vista.getBtnUno()) {
                modelo.actualizaNumero("1");
            }
            if (e.getSource() == vista.getBtnDos()) {
                modelo.actualizaNumero("2");
            }
            if (e.getSource() == vista.getBtnTres()) {
                modelo.actualizaNumero("3");
            }
            if (e.getSource() == vista.getBtnCuatro()) {
                modelo.actualizaNumero("4");
            }
            if (e.getSource() == vista.getBtnCinco()) {
                modelo.actualizaNumero("5");
            }
            if (e.getSource() == vista.getBtnSeis()) {
                modelo.actualizaNumero("6");
            }
            if (e.getSource() == vista.getBtnSiete()) {
                modelo.actualizaNumero("7");
            }
            if (e.getSource() == vista.getBtnOcho()) {
                modelo.actualizaNumero("8");
            }
            if (e.getSource() == vista.getBtnNueve()) {
                modelo.actualizaNumero("9");
            }

            /* Operaciones */
            if (e.getSource() == vista.getBtnSuma()) {
                modelo.suma();
            }
            if (e.getSource() == vista.getBtnRestar()) {
                modelo.resta();
            }
            if (e.getSource() == vista.getBtnMultiplicar()) {
                modelo.multiplicacion();
            }
            if (e.getSource() == vista.getBtnDivision()) {
                modelo.division();
            }
            if (e.getSource() == vista.getBtnRaiz()) {
                modelo.raizCuadrada();
            }
            if (e.getSource() == vista.getBtnCuadrado()) {
                modelo.elevaCuadrado();
            }
            if (e.getSource() == vista.getBtnInverso()) {
                modelo.inverso();
            }
            if (e.getSource() == vista.getBtnPorcentaje()) {
                modelo.porcentaje();
            }

            /* Botones auxiliares */
            if (e.getSource() == vista.getBtnBorraDigito()) {
                modelo.borraUltimoDigito();
            }
            if (e.getSource() == vista.getBtnBorraNumero()) {
                modelo.limpiarNumero();
            }
            if (e.getSource() == vista.getBtnBorraTodo()) {
                modelo.limpiarTodo();
            }

            /* Otros */
            if (e.getSource() == vista.getBtnPunto()) {
                modelo.actualizaNumero(".");
            }
            if (e.getSource() == vista.getBtnSigno()) {
                modelo.cambioSigno();
            }
            if (e.getSource() == vista.getBtnIgual()) {
                modelo.resultado();
            }
            if (e.getSource() == vista.getBtnInformacion()) {
                modelo.informacion();
            }

            /* Memoria */
            if (e.getSource() == vista.getBtnMemoriaLimpiar()) {
                modelo.limpiarMemoria();
            }
            if (e.getSource() == vista.getBtnMemoriaRecuperar()) {
                modelo.verMemoria();
            }
            if (e.getSource() == vista.getBtnMemoriaAlmacena()) {
                modelo.reemplazarMemoria();
            }
            if (e.getSource() == vista.getBtnMemoriaAgregar()) {
                modelo.agregarMemoria();
            }
            if (e.getSource() == vista.getBtnMemoriaSustraer()) {
                modelo.sustraterMemoria();
            }
        }
    }
}
