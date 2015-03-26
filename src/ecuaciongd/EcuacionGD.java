package ecuaciongd;

public class EcuacionGD {

    MiVentana mv;
    Graficar  gr;
    public EcuacionGD() {
  
        mv = new MiVentana(this);
        mv.setVisible(true);
    }

    public static void main(String[] args) {
        new EcuacionGD();
    }

}
