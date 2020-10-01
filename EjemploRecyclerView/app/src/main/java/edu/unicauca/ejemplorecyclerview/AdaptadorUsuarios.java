package edu.unicauca.ejemplorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.ViewHolderUsuario> {
    ArrayList<Usuario> listaUsuarios;


    public AdaptadorUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public ViewHolderUsuario onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_usuarios, null, false);
        return new ViewHolderUsuario(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderUsuario holder, int position) {
        holder.tvNombre.setText(listaUsuarios.get(position).getNombre());
        holder.tvDescripcion.setText(listaUsuarios.get(position).getDescripcion());

        int value = getImageResource(listaUsuarios.get(position).getFoto());
        holder.ivFoto.setImageResource(value);

    }

    public int getImageResource(int pos) {
        switch (pos) {
            case 1:
                return R.drawable.img1;
            case 2:
                return R.drawable.img2;
            case 3:
                return R.drawable.img3;
            case 4:
                return R.drawable.img4;
            case 5:
                return R.drawable.img5;
            case 6:
                return R.drawable.img6;
            case 7:
                return R.drawable.img7;
            case 8:
                return R.drawable.img8;
            case 9:
                return R.drawable.img9;
            case 10:
                return R.drawable.img10;
            default:
                return R.drawable.img1;

        }
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class ViewHolderUsuario extends RecyclerView.ViewHolder {
        TextView tvNombre;
        TextView tvDescripcion;
        ImageView ivFoto;

        public ViewHolderUsuario(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.idNombre);
            tvDescripcion = itemView.findViewById(R.id.idDescripcion);
            ivFoto = itemView.findViewById(R.id.idImagen);
        }
    }
}
