package edu.unicauca.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.unicauca.principal.R;
import edu.unicauca.principal.Usuario;
import edu.unicauca.principal.databinding.ListaUsuariosBinding;

public class AdaptadorUsuariosBinding extends RecyclerView.Adapter<AdaptadorUsuariosBinding.ViewHoder> {

    ArrayList<Usuario> listaUsuarios;
    Context ctx;

    public AdaptadorUsuariosBinding(ArrayList<Usuario> listaUsuarios, Context ctx) {
        this.listaUsuarios = listaUsuarios;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListaUsuariosBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.lista_usuarios, null, false);
        return new ViewHoder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        Usuario usuario = getListaUsuarios().get(position);
        holder.binding.setUsuario(usuario);

    }

    @Override
    public int getItemCount() {
        return getListaUsuarios().size();
    }


    public ArrayList<Usuario> getListaUsuarios() {
        if(listaUsuarios == null)
            listaUsuarios = new ArrayList<Usuario>();
        return listaUsuarios;
    }

    public class ViewHoder extends RecyclerView.ViewHolder{

        ListaUsuariosBinding binding;


        public ViewHoder(@NonNull ListaUsuariosBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }
    }



}
