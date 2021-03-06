package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Alberto
 */
public class Aro {

    /**
     * @return the CoordenadaX
     */
    public int getCoordenadaX() {
        return CoordenadaX;
    }

    /**
     * @param CoordenadaX the CoordenadaX to set
     */
    public void setCoordenadaX(int CoordenadaX) {
        this.CoordenadaX = CoordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *
     */
    public static final double MINIMO = 0.0;

    /**
     *
     */
    public static final double LIMITERADIO = 0.0 ;
            
    private int CoordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     *
     */
    public Aro() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        CoordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    /**
     *
     * @param valorX
     */
    public void establecerX(int valorX) {
        setCoordenadaX(valorX);
    }

    /**
     *
     * @param valorY
     */
    public void establecerY(int valorY) {
        setCoordenadaY(valorY);
    }

    /**
     *
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        setRadio(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    /**
     *
     * @return
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}