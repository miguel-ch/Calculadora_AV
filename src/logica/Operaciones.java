/*
 *  Header
 */
package logica;

/**
 *
 * @author Miguel
 */
public enum Operaciones {

    /* Operaciones Basicas */
    SIN_OPERACION(Grupos.OPERACIONES_BASICAS),
    SUMA(Grupos.OPERACIONES_BASICAS),
    RESTA(Grupos.OPERACIONES_BASICAS),
    MULTIPLICACION(Grupos.OPERACIONES_BASICAS),
    DIVISION(Grupos.OPERACIONES_BASICAS),
    /* Operaciones Otras */
    RAIZ_CUADRADA(Grupos.OPERACIONES_OTRAS),
    CUADRADO(Grupos.OPERACIONES_OTRAS),
    INVERSO(Grupos.OPERACIONES_OTRAS),
    PORCENTAJE(Grupos.OPERACIONES_OTRAS);

    /* Grupos de las operaciones */
    public enum Grupos {
        OPERACIONES_BASICAS,
        OPERACIONES_OTRAS,
    }

    private final Grupos grupo; //El grupo que separa las operaciones

    /* Cuando es creado el enum se separa por grupos */
    Operaciones(Grupos grupo) {
        this.grupo = grupo;
    }

    /* Retorna el grupo al que pertenece la operacion */
    public Grupos grupoPerteneciente() {
        return grupo;
    }

    /* Verifica si una operacion pertenece a un grupo recibido como parametro */
    public boolean perteneceAlGrupo(Grupos grupo) {
        return this.grupo == grupo;
    }
}
