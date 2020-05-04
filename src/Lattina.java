
public class Lattina extends Contenitore {

  private float altezza;
  private float larghezza;
  private float profondita;
 
  public Lattina(String TipoContenuto,String codice,float a, float l, float p){
	  super(TipoContenuto,codice);
	  
	  this.altezza=a;
	  this.larghezza=l;
	  this.profondita=p;
  }

@Override
public Boolean isStoccabile(String tipo, float dimensioni) {
	if(tipo.compareToIgnoreCase(super.getTipoContenuto())==0) {
		if((altezza*larghezza*profondita)>=dimensioni) {
			return true;
		}
	}
	
	return false;
	
}

@Override
public String toString() {
	return "Lattina [altezza=" + altezza + ", larghezza=" + larghezza + ", profondita=" + profondita + "]";
}





}
