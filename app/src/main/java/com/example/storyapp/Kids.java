package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.storyapp.databinding.ActivityKidsBinding;

public class Kids extends AppCompatActivity {

    ActivityKidsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKidsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}