public class ZombiePlant {
  private int potency;
  private int treatments;

  public ZombiePlant(int potency, int treatments) {
    this.potency = potency;
    this.treatments = treatments;
  }

  public int treatmentsNeeded() {
    return treatments;
  }

  public boolean isDangerous() {
    return !(treatments == 0);
  }

  public void treat(int p) {
    if (p <= 0) { return; }
    if (p <= 10 && treatments != 0) {
      treatments--;
    }
    else {
      treatments++;
    }
  }

  public int getPotencyRequired() { return potency; }
}