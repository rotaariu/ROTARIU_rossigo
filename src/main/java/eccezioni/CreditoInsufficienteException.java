package eccezioni;

public class CreditoInsufficienteException extends RossiGoException {
    private final double creditoAttuale;

    public CreditoInsufficienteException(String message, double creditoAttuale) {
        super(message);
        this.creditoAttuale = creditoAttuale;
    }

    public double getCreditoAttuale() {
        return creditoAttuale;
    }
}
