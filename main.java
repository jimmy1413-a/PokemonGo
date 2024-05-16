

public class main
{
    public static void main(String[] args){
        Pokemon a = new Pokemon ("arturo",TipoPokemon.AGUA);
        Pokemon b = new Pokemon ("julio",TipoPokemon.VOLADOR);
        Pokemon c = new Pokemon ("princesa",TipoPokemon.FUEGO);
        Pokemon d = new Pokemon ("bluey",TipoPokemon.TIERRA);
        Pokemon e = new Pokemon ("blaze",TipoPokemon.DRAGON);
        
        Pokedex pokedex = new Pokedex("RAMIRO");
        pokedex.capturaPokemon(a);
        pokedex.capturaPokemon(b);
        pokedex.capturaPokemon(c);
        pokedex.capturaPokemon(d);
        
        
        
        
        pokedex.intercambiarPokemon(e,d);
        pokedex.liberarPokemon(b);
        
        pokedex.mostrarPokedex();
        
        pokedex.mediaPokemon();
        
        pokedex.reiniciarPokedex();
        pokedex.mostrarPokedex();
        
        
    }
        
}
