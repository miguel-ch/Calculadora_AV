/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Miguel
 */
public class Calculadora {

    /* Atributos */
    private Operador[] operadores;
    private Operaciones operacion;

    /* Constructor */
    public Calculadora() {
        
        /* Inicializa los atributos */
        this.operadores = new Operador[2];
        this.operadores[0] = new Operador();
        this.operadores[1] = new Operador();
        this.operacion = Operaciones.SIN_OPERACION;
    }

    /* Añade un operador a la lista */
    public void agregarOperador(BigDecimal operador) {
        if (!operadores[0].valorAsignado) {
            operadores[0].numero = operador;
            operadores[0].valorAsignado = true;
        } else {
            operadores[1].numero = operador;
            operadores[1].valorAsignado = true;
        }
    }

    /* Realiza la operacion base que se encuentre almacenada */
    public BigDecimal operacionesBasicas(Operaciones operacionRecibida) {

        /* Verifica que existan los operadores para continuar */
        if (operadores[0].valorAsignado && operadores[1].valorAsignado && this.operacion != Operaciones.SIN_OPERACION) {

            /* Opera los numero dependiendo de la operacion almacenada */
            switch (this.operacion) {
                case SUMA:
                    this.operadores[0].numero = operadores[0].numero.add(operadores[1].numero);
                    break;
                case RESTA:
                    this.operadores[0].numero = operadores[0].numero.subtract(operadores[1].numero);
                    break;
                case MULTIPLICACION:
                    this.operadores[0].numero = operadores[0].numero.multiply(operadores[1].numero);
                    break;
                case DIVISION:
                    this.operadores[0].numero = operadores[0].numero.divide(operadores[1].numero, 14, RoundingMode.CEILING);
                    break;
            }
            
            /* Despues de realizar la operacion limpia el segundo digito para dar espacio */
            operadores[1].numero = new BigDecimal(0);
            operadores[1].valorAsignado = false;
        }

        /* Si la operacion recibida existe la almacena, si no se mantiene la ya existente */
        this.operacion = operacionRecibida == Operaciones.SIN_OPERACION ? this.operacion : operacionRecibida;
        return operadores[0].numero;
    }

    /* Realiza otras operaciones a un numero recibido */
    public BigDecimal operacionesOtras(Operaciones operacion, BigDecimal numero) {

        switch (operacion) {
            case RAIZ_CUADRADA:
                return BigDecimal.valueOf(Math.sqrt(numero.doubleValue()));
            case CUADRADO:
                return numero.pow(2);
            case INVERSO:
                return new BigDecimal(1).divide(numero, 14, RoundingMode.CEILING);
            case PORCENTAJE:
                return numero.multiply(operadores[0].numero.divide(new BigDecimal(100), 14, RoundingMode.CEILING));
        }
        return numero;
    }

    /* Devuelve el numero con cambio de signo */
    public BigDecimal cambiarSigno(BigDecimal num) {
        return num.negate();
    }

    /* Limpiar */
    public void limpiar() {
        this.operadores = new Operador[2];
        this.operadores[0] = new Operador();
        this.operadores[1] = new Operador();
        this.operacion = Operaciones.SIN_OPERACION;
    }

    /* Maneja los operadores de numeros */
    private class Operador {
        BigDecimal numero = new BigDecimal(0);
        boolean valorAsignado = false;
    }
}
