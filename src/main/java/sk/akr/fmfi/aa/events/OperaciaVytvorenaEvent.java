package sk.akr.fmfi.aa.events;

// Udalost. Moze niest dodatocne informacie.
public class OperaciaVytvorenaEvent {

	private Operacia operacia;

	public OperaciaVytvorenaEvent(Operacia operacia) {
		this.operacia = operacia;
	}

	public Operacia getOperacia() {
		return operacia;
	}
}
