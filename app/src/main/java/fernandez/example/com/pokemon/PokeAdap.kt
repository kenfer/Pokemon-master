package fernandez.example.com.pokemon

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pokemon_list_layout.view.*

/**
 * Created by smartstart on 3/7/18.
 */
class PokemonAdapter(private val pokemonList: ArrayList<Pokemon>) : RecyclerView.Adapter<CustomViewHolder>(){

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val pokemonPos: Pokemon = pokemonList[position]
        holder!!.view.pokemon_Name.text = pokemonPos.name
        val pokemonImage = holder.view.pokemon_Picture
        Picasso.with(holder.view.context).load(pokemonPos.sprites.front_default).into(pokemonImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pokemon_list_layout, parent, false)
        return CustomViewHolder(v)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}