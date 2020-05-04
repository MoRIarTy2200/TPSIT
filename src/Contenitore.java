import java.util.*;

abstract public class Contenitore {

  protected String TipoContenuto;
  protected String codice;
  

  public Contenitore(String TipoContenuto,String codice){
	  this.TipoContenuto=TipoContenuto;
	  this.codice=codice;
	  
  }




public String getTipoContenuto() {
	return TipoContenuto;
}




public String getCodice() {
	return codice;
}




abstract public Boolean isStoccabile(String tipo, float dimensioni);




}
