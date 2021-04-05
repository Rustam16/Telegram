package space.example.telegram;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import space.example.telegram.ChatDetailFragment.ChatDetailFragment;


public class SecondFragment extends Fragment {
    private RecyclerView rvList;
    private RecyclerAdapter adapter;
    private Button btnSettings;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        adapter = new RecyclerAdapter(itemChat -> {
            ChatDetailFragment firstFragment = new ChatDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("user Name", itemChat.getChatName());
            bundle.putString("user last message", itemChat.getLastMassage());
            bundle.putString("user time", itemChat.getUserTime());
            firstFragment.setArguments(bundle);

            this.getFragmentManager().beginTransaction().replace(R.id.a_container, firstFragment).addToBackStack(null).commit();
        });
        btnSettings = view.findViewById(R.id.btn_settings);



        rvList = view.findViewById(R.id.rv_list);
        setRvList();
        rvList.setAdapter(adapter);
        btnSettings.setOnClickListener(v -> {
            SettingsFragment fragment = new SettingsFragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction().replace(R.id.a_container,fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        return view;
    }

    private void setRvList() {
        adapter.adding(new ItemChat("dd", "sfggzdghgzs", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));
        adapter.adding(new ItemChat("dd", "ss", "10:09"));

    }

}