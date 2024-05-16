
public class Pokemon
{
    public String nombre;
    public TipoPokemon tipo;
    
    public Pokemon(String nombre,TipoPokemon tipo)
    {
      this.nombre = nombre;
      this.tipo = tipo;
    }

    //metodos
    
    public void mostrarPokemon()
    {
      System.out.println ("El pokemos es:"+ nombre + "Y es de tipo: " + tipo );
    }
    
    @Override
    public String toString() {
        return "Pokemon: " + nombre + ", Tipo: " + tipo ;
    }
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad tipo*/
     TipoPokemon getTipoPokemon(){
        return this.tipo;
    }//end method getTipo

    /**Metodo de modificación a la propiedad tipo*/
    public void setTipo(TipoPokemon tipo){
        this.tipo = tipo;
    }//end method setTipo

}