package com.teckja.smscarota;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.teckja.smscarota.databinding.M002FragmentBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = M002FragmentBinding.class.getName();
    private M002FragmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = M002FragmentBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }

    @Override
    public void onClick(View view) {

    }


}