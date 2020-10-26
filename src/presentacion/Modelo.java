/*
 *  Header calc
 */
package presentacion;

import java.math.BigDecimal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import logica.Calculadora;
import logica.Memoria;
import logica.Operaciones;

/**
 *
 * @author Miguel
 */
public class Modelo {

    private enum Estados {
        ERROR,
        RECIBE_DIGITOS,
        MUESTRA_NUMERO,
        COMPLETO_OPERACION,
    }

    /* Vista y sistema */
    private VistaCalculadora vista;
    private Calculadora calculadora;
    private Memoria memoria;
    private Estados estado;
    private boolean tomaNumero;

    /* Constructor */
    public Modelo() {
        this.calculadora = new Calculadora();
        this.memoria = new Memoria();
        this.estado = Estados.RECIBE_DIGITOS;
        this.tomaNumero = true;
    }

    /* Inicia la vista */
    public void iniciar() {

        /* Caracteristicas de la ventana */
        getVista().setSize(385, 535);
        getVista().setResizable(false);
        getVista().setLocationRelativeTo(null);
        getVista().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getVista().setIconImage(new ImageIcon(getClass().getResource("/presentacion/imagenes/calculadora.png")).getImage());
        getVista().setVisible(true);
    }

    /* Limpia el numero en pantalla y activa los botones */
    public void limpiarNumero() {
        estadoBotones(true);
        vista.getTxtNumero().setText("0");
    }

    /* Limpia los valores internos de calculadora y la pantalla */
    public void limpiarTodo() {
        calculadora.limpiar();
        limpiarNumero();
        vista.getLblProceso().setText("");
    }

    /* Agrega un caracter que puede ser un punto o digito al numero ya existente */
    public void actualizaNumero(String caracter) {

        /* Si el estado no esta en recibe trabaja con un numero nuevo */
        String tempNumero = estado == Estados.RECIBE_DIGITOS ? vista.getTxtNumero().getText().trim() : "0";

        /* Agrega o quita el digito al numero */
        switch (caracter) {
            case "<":
                tempNumero = tempNumero.length() <= 1 ? "0" : tempNumero.substring(0, tempNumero.length() - 1);
                break;
            case ".":
                tempNumero = tempNumero.contains(".") ? tempNumero : tempNumero + caracter;
                break;
            default:
                tempNumero = tempNumero.equals("0") ? caracter : tempNumero + caracter;
                break;
        }

        /* Verifica el estado de vista para limpiar el numero y mostrarlo */
        if (estado == Estados.COMPLETO_OPERACION || estado == Estados.ERROR) {
            limpiarTodo();
        }
        estado = Estados.RECIBE_DIGITOS;
        vista.getTxtNumero().setText(tempNumero);
    }

    /* Quita el ultimo digito al numero */
    public void borraUltimoDigito() {
        actualizaNumero("<");
    }

    /* Cambia el numero a positivo si es negativo y viceversa */
    public void cambioSigno() {

        /* Crea un big decimal temporal, que es negado desde calculadora y retornado para obtener su valor */
        BigDecimal nuevoNum = calculadora.cambiarSigno(new BigDecimal(vista.getTxtNumero().getText()));
        vista.getTxtNumero().setText(nuevoNum.toPlainString());
    }

    /* Ejecuta las operaciones en calculadora y muestra el resultado en pantalla */
    private void ejecutaOperacion(Operaciones operacion) {

        /* Variables temporales */
        BigDecimal nuevoNumero;
        BigDecimal numeroUso = new BigDecimal(vista.getTxtNumero().getText().trim());

        try {
            
            /* Dependiendo del grupo de las operaciones se da un orden para añadir los operadores */
            switch (operacion.grupoPerteneciente()) {

                case OPERACIONES_BASICAS:
                    calculadora.agregarOperador(numeroUso);
                    nuevoNumero = calculadora.operacionesBasicas(operacion);
                    break;
                case OPERACIONES_OTRAS:
                    nuevoNumero = calculadora.operacionesOtras(operacion, numeroUso);
                    calculadora.agregarOperador(nuevoNumero);
                    break;
                default:
                    calculadora.agregarOperador(numeroUso);
                    nuevoNumero = calculadora.operacionesBasicas(operacion);
            }

            /* Despues de realizar la operacion actualiza los numeros */
            vista.getTxtNumero().setText(nuevoNumero.stripTrailingZeros().toPlainString());
            actualizaProceso(operacion, numeroUso.toPlainString());
            estado = Estados.MUESTRA_NUMERO;

        } catch (NumberFormatException | ArithmeticException e) {

            /* Si existe un error bloquea y limpia todos los datos */
            limpiarTodo();
            estadoBotones(false);
            estado = Estados.ERROR;

            //Vista
            vista.getTxtNumero().setText("Error al operar");
            if (e.getMessage() != null && e.getMessage().equals("/ by zero")) {
                vista.getTxtNumero().setText("Division entre cero!");
            }
        }
    }

    /* Actualiza el proceso que se encuentra en pantalla agregando la operacion */
    private void actualizaProceso(Operaciones operacion, String numero) {

        String caracter; //Caracter que representa la operacion

        /* Dependiendo de la operacion almacena el simbolo de operacion */
        switch (operacion) {
            case SUMA:
                caracter = "+";
                break;
            case RESTA:
                caracter = "-";
                break;
            case MULTIPLICACION:
                caracter = "×";
                break;
            case DIVISION:
                caracter = "÷";
                break;
            case RAIZ_CUADRADA:
                caracter = "√(" + numero + ")";
                break;
            case CUADRADO:
                caracter = numero + "²";
                break;
            case INVERSO:
                caracter = "(1/" + numero + ")";
                break;
            case PORCENTAJE:
                caracter = numero + "%";
                break;
            default:
                caracter = "=";
                break;
        }

        /* Si es de las operaciones basicas verifica si debe tomar el numero en pantalla */
        if (operacion.perteneceAlGrupo(Operaciones.Grupos.OPERACIONES_BASICAS)) {
            caracter = tomaNumero ? numero + " " + caracter : caracter;
            tomaNumero = true;
        } else { //No es de operaciones basicas, se puede haber ejecutado una raiz, cuadrado, etc., No toma el siguiente digito
            tomaNumero = false;
        }
        vista.getLblProceso().setText(vista.getLblProceso().getText() + " " + caracter);
    }

    /* Metodos que son llamados desde controlador */
    public void suma() {
        ejecutaOperacion(Operaciones.SUMA);
    }

    public void resta() {
        ejecutaOperacion(Operaciones.RESTA);
    }

    public void multiplicacion() {
        ejecutaOperacion(Operaciones.MULTIPLICACION);
    }

    public void division() {
        ejecutaOperacion(Operaciones.DIVISION);
    }

    public void raizCuadrada() {
        ejecutaOperacion(Operaciones.RAIZ_CUADRADA);
    }

    public void elevaCuadrado() {
        ejecutaOperacion(Operaciones.CUADRADO);
    }

    public void inverso() {
        ejecutaOperacion(Operaciones.INVERSO);
    }

    public void porcentaje() {
        ejecutaOperacion(Operaciones.PORCENTAJE);
    }

    public void resultado() {

        /* Ejecuta la operacion por defecto y limpia la calculadora */
        if (estado != Estados.ERROR) {
            ejecutaOperacion(Operaciones.SIN_OPERACION);
            calculadora.limpiar();
            estado = Estados.COMPLETO_OPERACION;
        } else {
            limpiarTodo();
        }
    }

    public void limpiarMemoria() {
        getMemoria().setValor(new BigDecimal(0));
        estado = Estados.MUESTRA_NUMERO;
    }

    public void verMemoria() {
        vista.getTxtNumero().setText(getMemoria().getValor().stripTrailingZeros().toPlainString());
        estado = Estados.MUESTRA_NUMERO;
    }

    public void agregarMemoria() {
        getMemoria().agregar(new BigDecimal(vista.getTxtNumero().getText()));
        estado = Estados.MUESTRA_NUMERO;
    }

    public void sustraterMemoria() {
        getMemoria().sustraer(new BigDecimal(vista.getTxtNumero().getText()));
        estado = Estados.MUESTRA_NUMERO;
    }

    public void reemplazarMemoria() {
        getMemoria().setValor(new BigDecimal(vista.getTxtNumero().getText()));
        estado = Estados.MUESTRA_NUMERO;
    }

    public void informacion() {
        JOptionPane.showMessageDialog(null,
                "BOTONES DE DIGITACION:\n"
                + "\n[1...9] : Escriben el numero correspondiente en memoria"
                + "\n[.] : Escribe un punto siguiente al numero en pantalla como parte decimal"
                + "\n[±] : Cambia el valor de un numero, si es positivo pasa a ser negativo y viceversa"
                + "\n[<] : Borra el ultimo digito del numero en pantalla"
                + "\n\nBOTONES DE OPERACIONES:\n"
                + "\n[+] : Suma el numero que se encuentra en pantalla con el proximo numero que se escribe"
                + "\n[-] : Resta al numero en pantalla el proximo numero que se escribe"
                + "\n[×] : Multiplica el numero en pantalla por el proximo que se escribe"
                + "\n[÷] : Divide el numero en pantalla por el proximo que se escribe"
                + "\n[√] : Calcula la raiz cuadrada del numero en pantalla"
                + "\n[x²] : Eleva el numero en pantalla al cuadrado"
                + "\n[%] : Calcula el valor del porcentaje escrito en pantalla del numero anterior"
                + "\n[1/x] : Calcula el inverso de un numero"
                + "\n\nBOTONES DE MEMORIA:\n"
                + "\n[MC] : Limpia el valor almacenado en memoria"
                + "\n[MR] : Usa el valor almacenado en memoria como nuevo numero"
                + "\n[M+] : Suma el numero que se encuentra en pantalla al valor en memoria"
                + "\n[M-] : Resta el numero que se encuentra en pantalla al valor en memoria"
                + "\n[MS] : Reemplaza el numero que se encuentra en pantalla por valor en memoria"
                + "\n\nOTROS BOTONES:\n"
                + "\n[CE] : Limpia todos los datos de la calculadora"
                + "\n[C] : Borra el digito que se encuentra en pantalla"
                + "\n[=] : Realiza la operacion almacenada y la muestra en pantalla",
                "Instrucciones de la calculadora", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Actualizacion de los botones */
    private void estadoBotones(boolean estado) {

        /* Botones de memoria */
        vista.getBtnMemoriaLimpiar().setEnabled(estado);
        vista.getBtnMemoriaRecuperar().setEnabled(estado);
        vista.getBtnMemoriaAgregar().setEnabled(estado);
        vista.getBtnMemoriaSustraer().setEnabled(estado);
        vista.getBtnMemoriaAlmacena().setEnabled(estado);

        /* Auxiliares */
        vista.getBtnSigno().setEnabled(estado);
        vista.getBtnPunto().setEnabled(estado);

        /* Operaciones de la calculadora */
        vista.getBtnSuma().setEnabled(estado);
        vista.getBtnRestar().setEnabled(estado);
        vista.getBtnMultiplicar().setEnabled(estado);
        vista.getBtnDivision().setEnabled(estado);
        vista.getBtnRaiz().setEnabled(estado);
        vista.getBtnCuadrado().setEnabled(estado);
        vista.getBtnInverso().setEnabled(estado);
        vista.getBtnPorcentaje().setEnabled(estado);
    }

    /* Getters y setters */
    public VistaCalculadora getVista() {
        if (vista == null) {
            vista = new VistaCalculadora(this);
        }
        return vista;
    }

    public Calculadora getCalculadora() {
        if (calculadora == null) {
            calculadora = new Calculadora();
        }
        return calculadora;
    }

    public Memoria getMemoria() {
        if (memoria == null) {
            memoria = new Memoria();
        }
        return memoria;
    }
}
