
import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class Radio.
 *
 * @author javi-
 */
/**
 * @author jiio2
 *20/01/2021 - 20:01:04
 * 
 */
public abstract class Radio implements Interfaz {

    /** The emisora. */
    private double emisora;
    
    /** The botones. */
    //inicializo mi atributo botones con todas las estaciones FM 87.9
    private double botones[];

    /**
     * Instantiates a new radio.
     *
     * @param emisora the emisora
     * @param botones the botones
     */
    /*
    * @constructor no tiene todos los atributos puesto que botones es inicializado antes y es igual para todas las radios.
    */
    public Radio(double emisora, double botones[]){
        this.emisora = emisora;
        this.botones = botones;
    }
    
    /**
     * Gets the emisora.
     *
     * @return the emisora
     */
    /*
    * Setters y Getters para encapsular mis atributos
    */
    public double getEmisora() {
        return this.emisora;
    }
    
    /**
     * Sets the emisora.
     *
     * @param emisora the new emisora
     */
    //Este setter tambiÃ©n modifica la estacion para que haya congruencia
    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    /**
     * Gets the boton.
     *
     * @param i the i
     * @return the boton
     */
    public double getBoton(int i) {
        return this.botones[i];
    }

    /**
     * Sets the boton.
     *Este mñetodo coloca el nombre de la emisora seleccionada en el botón
     * @param emisora the emisora
     * @param i the i
     */
    public void setBoton(double emisora, int i) {
        this.botones[i] = emisora;
    }

    /**
     * Guardar emisora.
     *este método guarda la emisora en el botón que el usuario ha seleccionado
     * @param emisora the emisora
     * @param boton the boton
     */
    @Override
    public void guardarEmisora(double emisora, int boton) {
        this.botones[boton] = emisora;

    }

    /**
     * Seleccionar emisora.
     *Este seter selecciona la emisora guarda en el botón 
     *si no existe una emisora guardada se utiliza la predeterminada de AM/FM dependiendo el caso
     * @param boton the boton
     * @return the double
     */
    @Override
    public double seleccionarEmisora(int boton) {
        this.setEmisora(this.getBoton(boton));
        return this.botones[boton];
    }

}
