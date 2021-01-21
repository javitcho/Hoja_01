// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class RadioAM.
 *
 * @author Mejia
 */

/**
 * @author jiio2
 *20/01/2021 - 20:00:54
 * 
 */
public class RadioAM extends Radio{
    
    /**
     * Constructor 
     * Instantiates a new radio AM.
     */
    public RadioAM() {
        super(530, new double[]{530,530,530,530,530,530,530,530,530,530,530,530});
    }
    
    /**
     * Siguiente estacion.
     *Cambia de estación de radio (a la siguiente)
     * @return the double
     */
    @Override
    public double siguienteEstacion(){
        
            if (this.getEmisora() == 1610) {
                return 530;   
            } 
       return this.getEmisora()+10; 
    }
            
    /**
     * Estacion anterior.
     *Cambia de estación de radio (a la anterior)
     * @return the double
     */
    @Override
    public double estacionAnterior(){
        if (this.getEmisora()==530) {
                return 1610;   
            } 
       return this.getEmisora()-10; 
    }
    
}
