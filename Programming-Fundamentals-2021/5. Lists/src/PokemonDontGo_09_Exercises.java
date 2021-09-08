import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09_Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pokemonList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
       int sumOfPokemonsRemovedValues = 0;
        int indexToRemove = 0;
        while(!pokemonList.isEmpty()) {
           int indexOfPokemonList = Integer.parseInt(scan.nextLine());
           if (indexOfPokemonList < 0) {
               indexToRemove = pokemonList.remove(0);
               sumOfPokemonsRemovedValues += indexToRemove;
               pokemonList.add(0,pokemonList.get(pokemonList.size() -1));
           } else if (indexOfPokemonList > pokemonList.size() - 1) {
               indexToRemove = pokemonList.remove(pokemonList.size() - 1);
               sumOfPokemonsRemovedValues += indexToRemove;
               pokemonList.add(pokemonList.get(0));
           } else {
               indexToRemove = pokemonList.remove(indexOfPokemonList);
               sumOfPokemonsRemovedValues += indexToRemove;
           }
           for (int i = 0; i <= pokemonList.size() - 1 ; i++) {
               if(pokemonList.get(i) <= indexToRemove) {
                   pokemonList.set(i,pokemonList.get(i) + indexToRemove);
               } else {
                   pokemonList.set(i, pokemonList.get(i) - indexToRemove);
               }
           }
       }
        System.out.print(sumOfPokemonsRemovedValues);

    }
}
