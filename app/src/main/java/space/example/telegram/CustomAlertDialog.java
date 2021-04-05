package space.example.telegram;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class CustomAlertDialog extends Dialog {
    public Fragment fragment;
    private Button btnNo, btnYes;

    public CustomAlertDialog(@NonNull Fragment fragment) {
        super(fragment.getContext());
        this.fragment = fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_alert);
        btnNo = findViewById(R.id.btn_no);
        btnYes = findViewById(R.id.btn_yes);

        btnNo.setOnClickListener(v -> {
            dismiss();
        });
        btnYes.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            fragment.startActivity(intent);
        });
    }
}
