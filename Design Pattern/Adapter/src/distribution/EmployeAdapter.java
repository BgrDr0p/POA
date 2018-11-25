package distribution;

public class EmployeAdapter implements IUtilisateur {

  private   Employe employe;

  public EmployeAdapter(Employe employe)
  {
      this.employe = employe;
  }

  @Override
    public void AfficherUtilisateur()
  {
      employe.AfficherNom();
      employe.AfficherPoste();
  }



}
