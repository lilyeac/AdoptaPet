package adoptapet.dawi.com.adoptapet.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import adoptapet.dawi.com.adoptapet.R;
import adoptapet.dawi.com.adoptapet.beans.Adoptado;
import adoptapet.dawi.com.adoptapet.util.DbConexion;
import adoptapet.dawi.com.adoptapet.util.Variables;

public class RecyclerAdapterAdoptado extends RecyclerView.Adapter<RecyclerViewHolderAdoptado>{

    FragmentManager fragmentManager;
    Context context;
    LayoutInflater inflater;
    List<Adoptado> lista;


    public RecyclerAdapterAdoptado(Context context, FragmentManager fragmentManager){
        this.context = context;
        this.fragmentManager = fragmentManager;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewHolderAdoptado onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recycler_adoptado, parent,false);
        RecyclerViewHolderAdoptado view = new RecyclerViewHolderAdoptado(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolderAdoptado holder, int position) {
        holder.textEdadAdoptado.setText(lista.get(position).getEdad_mas());
        holder.textNomAdoptado.setText(lista.get(position).getNom_mas());
        holder.textRazaAdoptado.setText(lista.get(position).getRaza_mas());
    }

    @Override
    public int getItemCount() {
        return obtenerMascotas().size();
    }



    public List<Adoptado> obtenerMascotas() {
        lista =new ArrayList<>();
        Adoptado adoptado = null ;
        try {
            DbConexion db = new DbConexion();
            String SQL = "select nom_mas, raza_mas, edad_mas from tb_adopcion a inner join tb_mascota m on a.id_mas = m.id_mas where id_usu = ? ";
            PreparedStatement pst = db.getConnection().prepareStatement(SQL);
            pst.setInt(1,Variables.getId_usu());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                adoptado = new Adoptado();
                adoptado.setNom_mas(rs.getString("nom_mas"));
                adoptado.setRaza_mas(rs.getString("raza_mas"));
                adoptado.setEdad_mas(rs.getString("edad_mas"));
                lista.add(adoptado);
            }

        } catch (Exception e) {
            Log.e("Error al listar", e.getMessage());
        }
        return lista;
    }

}


