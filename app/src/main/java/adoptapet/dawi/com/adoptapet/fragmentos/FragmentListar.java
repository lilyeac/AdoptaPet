package adoptapet.dawi.com.adoptapet.fragmentos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adoptapet.dawi.com.adoptapet.R;
import adoptapet.dawi.com.adoptapet.adapter.RecyclerAdapterLista;

public class FragmentListar extends Fragment {

    View view;
    RecyclerView recyclerListar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_listar,container,false);
        mostrarListaMascotas(view);
        return view;
    }


     public void mostrarListaMascotas(View view){
        RecyclerAdapterLista adapter = new RecyclerAdapterLista(getContext(),getActivity().getSupportFragmentManager());
         recyclerListar = view.findViewById(R.id.recyclerListar);
         recyclerListar.setAdapter(adapter);
         recyclerListar.setHasFixedSize(true);
         recyclerListar.setLayoutManager(new LinearLayoutManager(view.getContext()));

    }

}
