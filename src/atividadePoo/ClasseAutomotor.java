package atividadePoo;
public class ClasseAutomotor {

	  String corAt;
	  String marcaAt;
	  String modeloAt;
	  String tipoAt;
	
	  public ClasseAutomotor() {
	    }
	  
	  public ClasseAutomotor( String corPar, String marcaPar, String modeloPar,String tipoPar) {
		  this.corAt = corPar;
		  this.marcaAt = marcaPar;
		  this.modeloAt = modeloPar;
		  this.tipoAt = tipoPar;
	    }

	  public String getCorAt() {
		  return corAt;
}

	  public void setCorAt(String corPar) {
		  this.corAt = corPar;
}

	  public String getMarcaAt() {
		  return marcaAt;
}

	  public void setMarcaAt(String marcaPar) {
		  this.marcaAt = marcaPar;
}

	  public String getTipoAt() {
		  return tipoAt;
}

	  public void setTipoAt(String tipoPar) {
		  this.tipoAt = tipoPar;
	}
}