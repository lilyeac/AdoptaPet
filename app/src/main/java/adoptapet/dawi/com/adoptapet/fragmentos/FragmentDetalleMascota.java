package adoptapet.dawi.com.adoptapet.fragmentos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.PreparedStatement;

import adoptapet.dawi.com.adoptapet.R;
import adoptapet.dawi.com.adoptapet.util.DbConexion;
import adoptapet.dawi.com.adoptapet.util.Variables;

public class FragmentDetalleMascota extends Fragment {

    View view;
    ImageView imglista;
    TextView textRaza, textDescripcion, textEdad, textSexo, textNombre;
    Button btnAdoptar;
    String id_mascota;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detalleta_mascota, container, false);
        id_mascota = getArguments().getString("id_mascota");
        imglista = view.findViewById(R.id.imglista);
        textRaza = view.findViewById(R.id.textRaza);
        textDescripcion = view.findViewById(R.id.textDescripcion);
        textEdad = view.findViewById(R.id.textEdad);
        textSexo = view.findViewById(R.id.textSexo);
        textNombre = view.findViewById(R.id.textNombre);
        btnAdoptar = view.findViewById(R.id.btnAdoptar);

        textNombre.setText(getArguments().getString("nombre_mascota"));
        textRaza.setText(getArguments().getString("raza_mascota"));
        textDescripcion.setText(getArguments().getString("descripcion_mascota"));
        textSexo.setText(getArguments().getString("sexo_mascota"));
        textEdad.setText(getArguments().getString("edad_mascota"));
        imglista.setImageResource(getArguments().getInt("img_mascota"));

        btnAdoptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Adopción")
                            .setMessage("¿Estas seguro que desea adoptar esta mascota?")
                            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    update();
                                    Toast.makeText(getContext(), "Se notificará al dueño su solicitud.", Toast.LENGTH_LONG).show();
                                    dialog.dismiss();
                                    getFragmentManager().beginTransaction()
                                            .replace(R.id.framgnet_incial, new FragmentListar())
                                            .commit();
                                }
                            })
                            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    builder.create().show();
                //
            }
        });

        return view;
    }

    public int update() {
        int resultado = 0,resultado1 = 0;
        try {
            DbConexion db = new DbConexion();
            PreparedStatement pst = db.getConnection().prepareStatement("update tb_mascota set id_estado = 2 where id_mas = ?");
            pst.setString(1, id_mascota);
            resultado = pst.executeUpdate();
            if(resultado != 0) {
                PreparedStatement pst1 = db.getConnection().prepareStatement("insert into tb_adopcion values ( ? , ?)");
                pst1.setInt(1, Variables.getId_usu());
                pst1.setInt(2,Integer.parseInt(id_mascota));
                resultado1 = pst1.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado1;
    }
}
