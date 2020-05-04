
//test 4

public class Bidone extends Contenitore{

  private float altezza;
  private float raggio;
  
  public Bidone(String tipoContenuto,String codice,float altezza, float raggio){
	  super(tipoContenuto,codice);
	  
	  this.altezza=altezza;
	  this.raggio=raggio;
	  
  }

  
  public Boolean isStoccabile(String tipo, float dimensioni) {
	  if(super.getTipoContenuto().compareToIgnoreCase(tipo)==0) {
		  if((3.14*raggio*raggio*altezza)>=dimensioni) {
			  return true;
		  }
	  }
	  
	  return false;
}


@Override
public String toString() {
	return "Bidone [altezza=" + altezza + ", raggio=" + raggio + "]";
}
  
  
 


}
