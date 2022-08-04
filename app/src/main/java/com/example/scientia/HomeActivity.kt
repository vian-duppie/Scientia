package com.example.scientia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.scientia.databinding.ActivityHomeBinding
import com.google.android.material.textfield.TextInputLayout

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater);

        setContentView(binding.root);

        binding.acbBtnStart.setOnClickListener {
            val username = binding.etNameInput.text;
            val inputLayout = binding.tfTextInputLayout;
            if ( username.length > 8 ) {
                inputLayout.setError("This name is too long.");
            } else if ( username.length < 1 ) {
                inputLayout.setError("Please enter your name.")
            } else {
                val intent = Intent(this, CategoryActivity::class.java);
                startActivity(intent);
            }
        }

    }
}