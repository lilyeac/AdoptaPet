package adoptapet.dawi.com.adoptapet.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import adoptapet.dawi.com.adoptapet.R;

public class RecyclerViewHolderLista extends RecyclerView.ViewHolder {

    TextView textNombreItem,textEstado, textRazaItem;
    ImageView imgItem;

    public RecyclerViewHolderLista(View itemView) {
        super(itemView);
        textNombreItem = itemView.findViewById(R.id.textNombreItem);
        imgItem = itemView.findViewById(R.id.imgItem);
        textEstado =itemView.findViewById(R.id.textEstado);
        textRazaItem =itemView.findViewById(R.id.textRazaItem);
    }
}
