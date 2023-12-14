package com.example.asg_mobprog.adapter;


public PokemonAdapter extends RecylerView.Adapter<PokemonViewHolder> {
    LayoutInflater layoutInflater;
    ArrayList<Pokemon> pokemons;

    public PokemonAdapter(Context context, ArrayList<Pokemon> pokemons){
        this.layoutInflater = LayoutInflater.from(context);
        this.pokemons = pokemons;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.animal_view, parent, false);
            return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
            Pokemon pokemon = pokemons.get(position);
            String imageUrl = pokemon.getSprites();
            Glide.with(ctx)
            .load(imageUrl)
            .into(holder.iv);
            holder.name.setText("Name: " + pokemon.getName());
            holder.width.setText("Width: " + pokemon.getWeight());
            holder.height.setText("Height: " + pokemon.getHeight());
    }

    @Override
    public int getItemCount() {
            return pokemons.size();
    }
}
