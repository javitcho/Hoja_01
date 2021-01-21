/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi-
 */
public interface Interfaz {
    /**
     * Cambia de emisora a la siguiente posible. En FM sube por 02, en AM por 10. Al llegar al final del dial lo reinicia.
     *
     * @return devuelve la dirección de la emisora que está justamente después de la actual; dependiendo de si está en AM o FM
     */
    public double siguienteEstacion();
    /**
     * Cambia de emisora a la anterior posible. en FM baja por 0.2, en Am por 10. Al llegar al inicio del dial se reinicia.
     *
     * @return devuelve la dirección de la emisora que está justamente detrás de la actual; dependiendo de si está en AM o FM
     */
    public double estacionAnterior();

    /**
     * Guarda la emisora en el botón correspondiente.
     *
     * @param emisora es el double de la dirección de la emisora que se va a
     * guardar en el botón.
     * @param boton es el botón en el que se guardará la emisora
     * correspondiente.
     */
    public void guardarEmisora(double emisora, int boton);

    /**
     * Selecciona la emisora en el botón que se indique.
     *
     * @param boton es el número del botón en donde está guardada la emisora que
     * se está seleccionando
     * @return devuelve el valor de la emisora en double, o la dirección de
     * ésta.
     */
    public double seleccionarEmisora(int boton);
}
