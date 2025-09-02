 package atividadePoo;
 public class ClasseCaminhoes extends ClasseAutomotor{
	 String cargaSuportadaAt;
	 
	 public ClasseCaminhoes( String corPar, String marcaPar, String modeloPar,String tipoPar) {
		 
		 super(corPar,marcaPar, modeloPar, tipoPar);
		 
		  this.corAt = corPar;
		  this.marcaAt = marcaPar;
		  this.modeloAt = modeloPar;
		  this.tipoAt = tipoPar;
	    }
	 
	 public String getcargaSuportadaAt() {
		  return cargaSuportadaAt;
}

	  public void setcargaSuportadaAt(String cargaSuportadaPar) {
		  this.cargaSuportadaAt = cargaSuportadaPar;
}

}
