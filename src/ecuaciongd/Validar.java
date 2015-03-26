package ecuaciongd;

public class Validar {

    public boolean EsNumero(String digito) {
        try {
            Double.parseDouble(digito);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
