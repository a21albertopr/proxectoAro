package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Alberto
 */
public class Aro {
    public static final double MINIMO = 0.0;

    private int CoordenadaX;
    private int coordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        CoordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        CoordenadaX=valorX;
    }

    public int obterX() {
        return CoordenadaX;
    }

    public void establecerY(int valorY) {
        coordenadaY=valorY;
    }

    public int obterY() {
        return coordenadaY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + CoordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        CoordenadaX=CoordenadaX + trasladarx;
        coordenadaY=coordenadaY + trasladary;
    }
}