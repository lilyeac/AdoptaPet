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
import adoptapet.dawi.com.adoptapet.adapter.RecyclerAdapterAdoptado;

public class FragmentAdoptado extends Fragment {

    View view;
    RecyclerView recyclerAdoptado;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_adoptado,container,false);
        mostrarAdoptados(view);
        return view;
    }

    public void mostrarAdoptados(View view){
        RecyclerAdapterAdoptado adapter = new RecyclerAdapterAdoptado(getContext(),getActivity().getSupportFragmentManager());
        recyclerAdoptado = view.findViewById(R.id.recyclerAdoptado);
        recyclerAdoptado.setAdapter(adapter);
        recyclerAdoptado.setHasFixedSize(true);
        recyclerAdoptado.setLayoutManager(new LinearLayoutManager(view.getContext()));

    }
}
