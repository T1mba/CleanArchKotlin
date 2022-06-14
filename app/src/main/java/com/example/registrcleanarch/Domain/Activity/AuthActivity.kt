package com.example.registrcleanarch.Domain.Activity

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.registrcleanarch.Data.Repository.RegsImpl
import com.example.registrcleanarch.Data.Storage.DateSharedPref
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate
import com.example.registrcleanarch.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class AuthActivity : AppCompatActivity() {

    private val vm by viewModel<AuthViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val user = findViewById<TextView>(R.id.User)
        val email = findViewById<TextView>(R.id.Email)
        val password = findViewById<TextView>(R.id.Pssword)
        val button = findViewById<Button>(R.id.GetDateButton)

        vm.resultLiveDataUser.observe(this){
            user.text = it
        }

        vm.resultLiveDataEmail.observe(this){
            email.text = it
        }

        vm.resultLiveDataPassword.observe(this){
            password.text = it
        }
            // Кнопка получения данных
        button.setOnClickListener {

            vm.getData()
        }
    }
}