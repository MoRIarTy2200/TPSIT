import java.util.*;

public class Deposito {


  private String nome;
  private String luogo;
  private Contenitore[] cont;
  private int c;


  public Deposito(String nome, String luogo){
	  this.nome=nome;
	  this.luogo=luogo;
	  c=0;
	  
	  cont=new Contenitore[10];
  }


  public boolean addContenitore(Contenitore co){
	  if(c<=10) {
		  cont[c]=co;
		  c++;  
		  return true;
	  }
	  
	  return false;

  }



  public boolean delContenitore(String codice){
	  
	  for(int i=0;i<c;i++) {
		  if(cont[i].getCodice().compareTo(codice)==0) {
			  for(int j=i;j<c;j++)
				  cont[j]=cont[j+1];
			c--;
			return true;
		  }
	  }
	  
	  return false;
  }



  public Contenitore[] ceraSpecifico(String prodotto,float dimensione){
	  
	  Contenitore[] out=new Contenitore[10];
	  int con=0;
	  
	  for(int i=0;i<c;i++) {
		 if(cont[i].isStoccabile(prodotto, dimensione)) {
			 out[con]=cont[i];
			 con++;
		 }
	  }
	  
	  
	  return out;
  }
  
  
  public Contenitore getContenitore(int pos) {
	  return cont[pos];
  }
  
  

  @Override
public String toString() {
	return "Deposito [nome=" + nome + ", luogo=" + luogo + ", cont=" + Arrays.toString(cont) + ", c=" + c + "]";
}


public static void main(String[] args) {
	  Deposito d=new Deposito("test","test");
	  
	  d.addContenitore(new Bidone("test","10",1,6));
	  d.addContenitore(new Lattina("test1","20",2,5,10));
	  d.addContenitore(new Bidone("test","30",3,5));
	  d.addContenitore(new Lattina("test","40",4,5,10));
	  d.addContenitore(new Bidone("test1","55",5,5));
	  
	  System.out.println(d);
	  

	  System.out.println(Arrays.toString(d.ceraSpecifico("test1",10)));
	  
	  
	  d.delContenitore("1");
	  System.out.println(d);
  }
  

}
