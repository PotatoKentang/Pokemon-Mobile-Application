



public class PokemonViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView width;
    public TextView height;
    public ImageView iv;
    public PokemonViewHolder(@NonNull View itemView) {
        super(itemView);
        name = findViewById(R.id.textViewName);
        width = findViewById(R.id.textViewWidth);
        height = findViewById(R.id.textViewHeight);
        iv = findViewById(R.id.imageViewPokemon);
    }
}
