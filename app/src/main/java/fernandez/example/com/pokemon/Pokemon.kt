package fernandez.example.com.pokemon

/**
 * Created by smartstart on 3/7/18.
 */
data class Pokemon(val name: String = "", val sprites: PokemonSprite)

data class PokemonSprite(val front_default: String = "")