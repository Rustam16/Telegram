package space.example.telegram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SettingsFragment extends Fragment {
    private Button btnGOOut;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        btnGOOut = view.findViewById(R.id.btn_go_out);
        btnGOOut.setOnClickListener(v -> {
            CustomAlertDialog dialog = new CustomAlertDialog(this);
            dialog.show();
        });
        return view;
    }
}