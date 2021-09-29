package adoptapet.dawi.com.adoptapet.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import adoptapet.dawi.com.adoptapet.R;
import adoptapet.dawi.com.adoptapet.beans.Mascota;
import adoptapet.dawi.com.adoptapet.beans.Usuario;
import adoptapet.dawi.com.adoptapet.fragmentos.FragmentDetalleMascota;
import adoptapet.dawi.com.adoptapet.util.DbConexion;

public class RecyclerAdapterLista extends RecyclerView.Adapter<RecyclerViewHolderLista> {

    FragmentManager fragmentManager;
    Context context;
    LayoutInflater inflater;
    List<Mascota> lista;
    private RequestQueue requestQueue;
  //  List<Mascota> listaMascota;

    public RecyclerAdapterLista(Context context, FragmentManager fragmentManager){
        this.context = context;
        this.fragmentManager = fragmentManager;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewHolderLista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recycler_listar,parent,false);
        RecyclerViewHolderLista view = new RecyclerViewHolderLista(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolderLista holder, final int position) {
        holder.imgItem.setImageResource(imgMascota[position]);
        holder.textNombreItem.setText(obtenerMascotas().get(position).getNom_mas());
        holder.textRazaItem.setText(obtenerMascotas().get(position).getRaza_mas());
        if(obtenerMascotas().get(position).getId_estado() == 1){
            holder.textEstado.setText("Disponible");
        }else if(obtenerMascotas().get(position).getId_estado() == 2){
            holder.imgItem.setEnabled(false);
            holder.textEstado.setText("Adopciòn en Proceso");
        }else{
            holder.imgItem.setEnabled(false);
            holder.textEstado.setText("Adoptado.");
        }
        holder.imgItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle argumentos = new Bundle();
                argumentos.putString("id_mascota",String.valueOf(lista.get(position).getId_mas()));
                argumentos.putString("nombre_mascota",lista.get(position).getNom_mas());
                argumentos.putString("descripcion_mascota",lista.get(position).getDes_mas());
                argumentos.putString("edad_mascota",lista.get(position).getEdad_mas());
                argumentos.putString("sexo_mascota",lista.get(position).getSexo_mas());
                argumentos.putString("raza_mascota",lista.get(position).getRaza_mas());
                argumentos.putInt("img_mascota",imgMascota[position]);
                FragmentDetalleMascota f = new FragmentDetalleMascota();
                f.setArguments(argumentos);
                fragmentManager.beginTransaction()
                        .replace(R.id.framgnet_incial, f)
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    private Integer[] imgMascota =
            {R.drawable.bulldog2,
                    R.drawable.bulldog1,
                    R.drawable.cocker1,
                    R.drawable.cocker2,
                    R.drawable.doberman1,
                    R.drawable.doberman2,
                    R.drawable.grandanes1,
                    R.drawable.grandanes2,
                    R.drawable.labrador1,
                    R.drawable.labrador2,
                    R.drawable.mastin1,
                    R.drawable.mastin2,
                    R.drawable.pasto1,
                    R.drawable.pastor2,
                    R.drawable.pequines1,
                    R.drawable.pequines2,
                    R.drawable.salchicha1,
                    R.drawable.salchicha2,
                    R.drawable.schnauzer2,
                    R.drawable.schnauzer1};


    public List<Mascota> obtenerMascotas() {
        lista =new ArrayList<>();
        Mascota mascota = null ;
        try {
            DbConexion db = new DbConexion();
            String SQL = "Select * from tb_mascota ";
            PreparedStatement pst = db.getConnection().prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setId_mas(rs.getInt("id_mas"));
                mascota.setNom_mas(rs.getString("nom_mas"));
                mascota.setRaza_mas(rs.getString("raza_mas"));
                mascota.setEdad_mas(rs.getString("edad_mas"));
                mascota.setDes_mas(rs.getString("des_mas"));
                mascota.setSexo_mas(rs.getString("sexo_mas"));
                mascota.setId_estado(rs.getInt("id_estado"));
                lista.add(mascota);
            }
            if (lista.size() != 0) {
              /*  Variables.setId_tipo_perfil(user.getId_tipo_perfil());
                Variables.setLogin(user.getLogin_email());
                Variables.setPassword(user.getPassword());*/
            }

        } catch (Exception e) {
            Log.e("Error al listar", e.getMessage());
        }


        return lista;
    }

    public List<Mascota> obtenerMascotas_() {
        lista =new ArrayList<>();
  //      listaMascota = new ArrayList<>();
      //  Mascota mascota = null ;
        String url = "http://192.168.1.5:8080/Proyecto_AdoptaPets/get/obtenerMascotas";
        requestQueue = Volley.newRequestQueue(context);

        Log.e("1","Inicio");

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(

                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        try{
                         //   List<Mascota> listaMascota = new ArrayList<>();
                            Log.e("2","ListaMascota");
                            // Loop through the array elements
                            for(int i=0;i<response.length();i++){
                                // Get current json object
                                JSONObject jsMascota = response.getJSONObject(i);
                                Mascota mascota = new Mascota();
                                mascota.setId_mas(Integer.parseInt(jsMascota.getString("idMas")));
                                mascota.setNom_mas(jsMascota.getString("nomMas"));
                                mascota.setRaza_mas(jsMascota.getString("razaMas"));
                                mascota.setEdad_mas(jsMascota.getString("edadMas"));
                                mascota.setDes_mas(jsMascota.getString("desMas"));
                                mascota.setSexo_mas(jsMascota.getString("sexoMas"));
                                mascota.setId_estado(Integer.parseInt(jsMascota.getString("idEstado")));

                             /*   String id_mas = jsMascota.getString("idMas");
                                String nom_mas = jsMascota.getString("nomMas");
                                String raza_mas = jsMascota.getString("razaMas");
                                String edad_mas = jsMascota.getString("edadMas");
                                String tam_mas = jsMascota.getString("tamMas");
                                String des_mas = jsMascota.getString("desMas");
                                String vac_mas = jsMascota.getString("vacMas");
                                String id_estado = jsMascota.getString("idEstado");
*/
                             //   Log.e("3",nom_mas);

                             /*   int idMas = Integer.parseInt(id_mas);
                                int idEstado = Integer.parseInt(id_estado);*/

                                lista.add(mascota);
                            //    lista.add(new Mascota(idMas,nom_mas,raza_mas,edad_mas,tam_mas,des_mas,vac_mas,idEstado));
                            }



                        }catch (JSONException e){
                            e.printStackTrace();
                            Log.e("4","Error");
                        }
                    }

                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Log.e("5","ErrorVolley");

                    }
                }
        );
        requestQueue.add(jsonArrayRequest);

         Log.e("6","Fin");

    //    Log.e("7",String.valueOf(lista.get(0).getNom_mas()));
        return lista;
    }

    public void listaMascota(){
        obtenerMascotas_();
    }

    @Override
    public int getItemCount() {
        return obtenerMascotas().size();
    }
}
