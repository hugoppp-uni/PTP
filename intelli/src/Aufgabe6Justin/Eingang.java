package Aufgabe6Justin;


public class Eingang implements Gatter {
  /**
   * EingangsWert des Gatters
   */
  private boolean wert;

  public Eingang(boolean wert) {
    this.wert = wert;
  }

  /**
   * Getter für den Wert am Gatterausgang
   *
   * @return Ausgangswert des Gatters
   */
  @Override
  public boolean getOutput() {
    return wert;
  }

  /**
   * Umwandlung des Objektes in ein selbstbeschreibendes Textsegment
   *
   * @return Beschreibung des Gatters
   */
  @Override
  public String toString() {
    return wert ? " WAHR " : " FALSCH ";
  }
}
