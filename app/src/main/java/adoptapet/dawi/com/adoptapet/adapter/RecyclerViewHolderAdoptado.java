package adoptapet.dawi.com.adoptapet.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import adoptapet.dawi.com.adoptapet.R;

public class RecyclerViewHolderAdoptado extends RecyclerView.ViewHolder {

    TextView textNomAdoptado, textRazaAdoptado, textEdadAdoptado;

    public RecyclerViewHolderAdoptado(View itemView) {
        super(itemView);
        textNomAdoptado= itemView.findViewById(R.id.textNomAdoptado);
        textRazaAdoptado = itemView.findViewById(R.id.textRazaAdoptado);
        textEdadAdoptado = itemView.findViewById(R.id.textEdadAdoptado);
    }
}
