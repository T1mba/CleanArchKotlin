package com.example.registrcleanarch.Domain.Activity

import android.app.AlertDialog
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.registrcleanarch.Data.Repository.RegsImpl
import com.example.registrcleanarch.Data.Storage.DateSharedPref
import com.example.registrcleanarch.Domain.Methods.MethodsMainWindow
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.reflect.Method

class MainActivity : AppCompatActivity() {
    private val vm by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val userError  = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.UserInputError)
        val userText   =  findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.userEditText)
        val emailError = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.emailError)
        val emailText = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.emailText)
        val passwordEmail = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.passwordError)
        val logButton = findViewById<Button>(R.id.LogButton)
        val passwordText = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.passwordEdiText)
        vm.resultLive.observe(this) {

        }
        logButton.setOnClickListener {
            // Клик по кнопке "Зарегистрироваться
            val userStringText = userText.text.toString()
            val emailStringText = emailText.text.toString()
            val passwordStringText = passwordText.text.toString()
            vm.save( name = userStringText,email = emailStringText,password = passwordStringText)

        }


    }

    fun haveButtonClick(view: View) {
        // Клик по кнопке "Есть аккаунт"
        startActivity(Intent(this, AuthActivity::class.java))
    }

}