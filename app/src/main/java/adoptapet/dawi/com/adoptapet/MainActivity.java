package adoptapet.dawi.com.adoptapet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import adoptapet.dawi.com.adoptapet.beans.Usuario;
import adoptapet.dawi.com.adoptapet.util.DbConexion;
import adoptapet.dawi.com.adoptapet.util.Variables;

public class MainActivity extends AppCompatActivity {

    Button btnAcceder;
    EditText editUsuario, editPassword;
    TextView textRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAcceder = findViewById(R.id.btnAcceder);
        editUsuario = findViewById(R.id.editUsuario);
        editPassword = findViewById(R.id.editPassword);
        textRegistrar = findViewById(R.id.textRegistrar);

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(obtenerUsuario() != 0) {
                    Intent intent = new Intent(MainActivity.this, Navegacion.class);
                    startActivity(intent);
                }else{
                    editPassword.setText("");
                    editUsuario.setText("");
                    editUsuario.requestFocus();
                    Toast.makeText(getBaseContext(), "Usuario o contraseña incorrectos.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public int obtenerUsuario() {
        List<Usuario> lista =new ArrayList<>();
        Usuario user = null ;
        try {
            DbConexion db = new DbConexion();
            String SQL = "Select * from tb_usuario where login = ? and password = ? ";
            PreparedStatement pst = db.getConnection().prepareStatement(SQL);
            pst.setString(1, editUsuario.getText().toString());
            pst.setString(2, editPassword.getText().toString());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user = new Usuario();
                user.setId_usu(rs.getInt("id_usu"));
                user.setNom_usu(rs.getString("nom_usu"));
                user.setApe_usu(rs.getString("ape_usu"));
                user.setDir_usu(rs.getString("dir_usu"));
                user.setNum_usu(rs.getString("num_usu"));
                user.setCel_usu(rs.getString("cel_usu"));
                user.setEmail_usu(rs.getString("email_usu"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                lista.add(user);
            }
            if (lista.size() != 0) {
                Variables v = new Variables();
                v.setId_usu(user.getId_usu());
                v.setNom_usu(user.getNom_usu());
                v.setApe_usu(user.getApe_usu());
                v.setCel_usu(user.getCel_usu());
                v.setCorreo_usu(user.getEmail_usu());
                v.setLogin(user.getLogin());
                v.setPassword(user.getPassword());
                v.setDir_usu(user.getDir_usu());
                v.setNum_usu(user.getNum_usu());
                v.setPassword(user.getPassword());
            }

        } catch (Exception e) {
            Log.e("Error al listar", e.getMessage());
        }


        return lista.size();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
