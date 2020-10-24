/*
 *  Header
 */
package logica;

import java.math.BigDecimal;

/**
 *
 * @author Miguel
 */
public class Memoria {

    /* Atributos */
    private BigDecimal valor;

    public Memoria() {
    }

    public void agregar(BigDecimal num) {
        valor = valor == null ? new BigDecimal(0).add(num) : valor.add(num);
    }

    public void sustraer(BigDecimal num) {
        valor = valor == null ? new BigDecimal(0).subtract(num) : valor.subtract(num);
    }

    public BigDecimal getValor() {
        if (valor == null) {
            valor = new BigDecimal(0);
        }
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
