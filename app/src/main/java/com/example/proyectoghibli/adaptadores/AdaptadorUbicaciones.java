package com.example.proyectoghibli.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoghibli.R;
import com.example.proyectoghibli.model.Ubicacion;

import java.util.List;

public class AdaptadorUbicaciones extends RecyclerView.Adapter<AdaptadorUbicaciones.UbicacionViewHolder> {

    private List<Ubicacion> ubicaciones;
    private Context context;

    public AdaptadorUbicaciones(List<Ubicacion> ubicaciones, Context context) {
        this.ubicaciones = ubicaciones;
        this.context = context;
    }

    @NonNull
    @Override
    public UbicacionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ubicacion, parent, false);
        return new UbicacionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UbicacionViewHolder holder, int position) {
        Ubicacion location = ubicaciones.get(position);
        holder.name.setText(location.getName());
        holder.climate.setText("Clima: " + location.getClimate());
        holder.terrain.setText("Terreno: " + location.getTerrain());
        holder.surfaceWater.setText("Aguas superficiales: " + location.getSurface_water());
    }

    @Override
    public int getItemCount() {
        return ubicaciones.size();
    }

    public static class UbicacionViewHolder extends RecyclerView.ViewHolder {
        TextView name, climate, terrain, surfaceWater;

        public UbicacionViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textName);
            climate = itemView.findViewById(R.id.textClimate);
            terrain = itemView.findViewById(R.id.textTerrain);
            surfaceWater = itemView.findViewById(R.id.textSurfaceWater);
        }
    }
}
