package com.example.dosAcciones1;

import static com.example.dosAcciones1.MainActivity.idNotification;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dosAcciones1.databinding.ActivityDialBBinding;

public class DialActivityB extends Activity {

    private TextView mTextView;
    private ActivityDialBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDialBBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        NotificationManager notifMan = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notifMan.cancel(idNotification);
    }
}