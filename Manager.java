// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class Manager.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *20/01/2021 - 20:01:20
 * 
 */
public class Manager {
    
    /** The radio. */
    Radio radio;
    
    /** The radio AM. */
    RadioAM radioAM;
    
    /** The radio FM. */
    RadioFM radioFM;
    
    /** The fm. */
    boolean FM;
    
    /** The boton. */
    int boton;

    /**
     * Instantiates a new manager.
     */
    public Manager() {
        this.radioAM = new RadioAM();
        this.radioFM = new RadioFM();
        this.FM = true;
        this.radio = this.radioFM;
    }

    /**
     * Sets the boton.
     *
     * @param boton the new boton
     */
    public void setBoton(int boton) {
        this.boton = boton;
    }

    /**
     * Gets the boton.
     *
     * @return the boton
     */
    public int getBoton() {
        return boton;
    }

    /**
     * Gets the radio.
     *
     * @return the radio
     */
    public Radio getRadio() {
        return radio;
    }

    /**
     * Gets the radio AM.
     *
     * @return the radio AM
     */
    public RadioAM getRadioAM() {
        return radioAM;
    }

    /**
     * Gets the radio FM.
     *
     * @return the radio FM
     */
    public RadioFM getRadioFM() {
        return radioFM;
    }

    /**
     * Checks if is fm.
     *
     * @return true, if is fm
     */
    public boolean isFM() {
        return FM;
    }

    /**
     * Sets the radio.
     *
     * @param radio the new radio
     */
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    /**
     * Sets the radio AM.
     *
     * @param radioAM the new radio AM
     */
    public void setRadioAM(RadioAM radioAM) {
        this.radioAM = radioAM;
    }

    /**
     * Sets the radio FM.
     *
     * @param radioFM the new radio FM
     */
    public void setRadioFM(RadioFM radioFM) {
        this.radioFM = radioFM;
    }

    /**
     * Sets the fm.
     *
     * @param FM the new fm
     */
    public void setFM(boolean FM) {
        this.FM = FM;
    }
    
    /**
     * Cambiar estacion. Cambia la estación de radio
     */
    public void cambiarEstacion(){
        this.setFM(!this.isFM());
        if(this.isFM()){
            this.setRadio(this.getRadioFM());
        } else {
            this.setRadio(this.getRadioAM());
        }
    }
    
    /**
     * Siguiente. Cambia a la siguiente estación
     */
    public void siguiente(){
        this.radio.setEmisora(this.radio.siguienteEstacion());
    }
    
    /**
     * Anterior. Regresa a la emisora anterior
     */
    public void anterior(){
        this.radio.setEmisora(this.radio.estacionAnterior());
    }
    
    /**
     * Guardar. Guarda la estación en el botón
     *
     * @param boton the boton
     */
    public void guardar(int boton){
        this.radio.guardarEmisora(this.radio.getEmisora(), boton);
    }
    
    /**
     * Sets the.
     *
     * @param boton the boton
     */
    public void set(int boton){
        this.radio.seleccionarEmisora(boton);
    }
    
    /**
     * Estacion. Cambia de estación
     *
     * @return the string
     */
    public String estacion(){
        if(this.isFM()){
            return "FM";
        } 
        return "AM";
        
    }
    
}
