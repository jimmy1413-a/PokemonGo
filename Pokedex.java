
import java.util.ArrayList;
 import   java.lang.String;
public class Pokedex 
{
   String entrenador;
   private ArrayList<Pokemon> pokemones;
   static int agua;
   static int fuego;
   static int volador;
   static int dragon;
   static int planta;
   static int tierra;
   static int electrico;
   
    public Pokedex(String entrenador)
    { 
      this.entrenador = entrenador;
        this.pokemones = new ArrayList<>();
    }

   public void capturaPokemon(Pokemon P)
    {
        pokemones.add(P);
        
    if (P.getTipoPokemon().equals(TipoPokemon.AGUA)) {
        agua++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());
    } else if (P.tipo.equals(TipoPokemon.FUEGO)){
        fuego++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());
    } else if (P.tipo.equals(TipoPokemon.DRAGON)) {
        dragon++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());

    } else if (P.tipo.equals(TipoPokemon.PLANTA)) {
        planta++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());

    } else if (P.tipo.equals(TipoPokemon.ELECTRICO)) {  
        electrico++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());

    } else if (P.tipo.equals(TipoPokemon.TIERRA)) {
        tierra++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());

    } else if (P.tipo.equals(TipoPokemon.VOLADOR)){
        volador++;
        System.out.println("se ha capturado a: " + P.getNombre() + " que es de tipo: " + P.getTipoPokemon());

    }
    }
  
    
    public String toString(Pokemon p) {
        return "Pokemon: " + p.nombre ;
    }
    
   public void liberarPokemon(Pokemon pokemon)
    {
      pokemones.remove(pokemon);
      System.out.println("se ha liberado a: " + pokemon);
    }
   
    public void intercambiarPokemon(Pokemon Pnuevo, Pokemon Pantiguo)
    {
    this.capturaPokemon(Pnuevo);
    System.out.println("se ha intercambiado a: " + Pantiguo.toString() + " con: " + Pnuevo.toString());
    this.liberarPokemon(Pantiguo);
    }
    
    public void reiniciarPokedex()
    {
        pokemones.clear();
        System.out.println("todos sus pokemones se han liberado la pokedex se ha reiniciado");
    }
   
    public void mostrarPokedex()
    {
       if (pokemones.isEmpty()) {
        System.out.println("Pokédex vacía.");
    } else {
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon);
        }
    }
    }

    

   
    public void mediaPokemon()
    {
        int media = ((agua+fuego+dragon+planta+electrico+tierra+volador)/getPokemones().size());
        System.out.println("la media de sus pokemones: " + media);
      
    }
   
    /**Metodo de acceso a la propiedad entrenador*/
    public String getEntrenador(){
        return this.entrenador;
    }//end method getEntrenador

    /**Metodo de modificación a la propiedad entrenador*/
    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }//end method setEntrenador

    /**Metodo de acceso a la propiedad agua*/
    public int getAgua(){
        return this.agua;
    }//end method getAgua

    /**Metodo de modificación a la propiedad agua*/
    public void setAgua(int agua){
        this.agua = agua;
    }//end method setAgua

    /**Metodo de acceso a la propiedad fuego*/
    public int getFuego(){
        return this.fuego;
    }//end method getFuego

    /**Metodo de modificación a la propiedad fuego*/
    public void setFuego(int fuego){
        this.fuego = fuego;
    }//end method setFuego

    /**Metodo de acceso a la propiedad dragon*/
    public int getDragon(){
        return this.dragon;
    }//end method getDragon

    /**Metodo de modificación a la propiedad dragon*/
    public void setDragon(int dragon){
        this.dragon = dragon;
    }//end method setDragon

    /**Metodo de acceso a la propiedad planta*/
    public int getPlanta(){
        return this.planta;
    }//end method getPlanta

    /**Metodo de modificación a la propiedad planta*/
    public void setPlanta(int planta){
        this.planta = planta;
    }//end method setPlanta

    /**Metodo de acceso a la propiedad electrico*/
    public int getElectrico(){
        return this.electrico;
    }//end method getElectrico

    /**Metodo de modificación a la propiedad electrico*/
    public void setElectrico(int electrico){
        this.electrico = electrico;
    }//end method setElectrico

    /**Metodo de acceso a la propiedad roca*/
    public int getTierra(){
        return this.tierra;
    }//end method getRoca

    /**Metodo de modificación a la propiedad roca*/
    public void setTierra(int tierra){
        this.tierra = tierra;
    }//end method setRoca

    /**Metodo de acceso a la propiedad volador*/
    public int getVolador(){
        return this.volador;
    }//end method getVolador

    /**Metodo de modificación a la propiedad volador*/
    public void setVolador(int volador){
        this.volador = volador;
    }//end method setVolador

   
    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }
}//end method setVoladors

    
