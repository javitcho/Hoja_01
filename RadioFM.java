// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class RadioFM.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *20/01/2021 - 20:00:43
 * 
 */
public class RadioFM extends Radio{
    
    /**
     * Constructor
     * Instantiates a new radio FM.
     */
    public RadioFM() {
        super(87.9, new double[]{87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9});
    }
    
    /**
     * Siguiente estacion.
     *Cambia de estación de radio (a la siguiente)
     * @return the double
     */
    @Override
    public double siguienteEstacion(){
        
            if (this.getEmisora() == 107.9) {
                return 87.9;   
            } 
       return this.getEmisora()+0.2; 
    }
            
    /**
     * Estacion anterior.
     *Cambia de estación de radio (a la anterior)
     * @return the double
     */
    @Override
    public double estacionAnterior(){
        if (this.getEmisora()==87.9) {
                return 107.9;   
            } 
       return this.getEmisora()-0.2; 
    }
}
