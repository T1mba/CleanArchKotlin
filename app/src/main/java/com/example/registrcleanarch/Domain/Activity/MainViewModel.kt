package com.example.registrcleanarch.Domain.Activity

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Methods.MethodsMainWindow
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate

class MainViewModel(private val saveUserDate: MethodsMainWindow,private val context: Context) : ViewModel() {

private val resultLiveMutable = MutableLiveData<String>()
    val resultLive:LiveData<String> =resultLiveMutable


        fun save(name:String,email:String,password:String){
            if(name.isEmpty() && email.isEmpty() && password.isEmpty() || name.isEmpty() || email.isEmpty() || password.isEmpty()){
                return Toast.makeText(context,"Заполните данные",Toast.LENGTH_LONG).show()
            }
            else{
                val params =DateOfUserModel(userString = name,emailString = email,passwordString = password)
                val result = saveUserDate.execute(params)
                resultLiveMutable.value = "Save result = $result"
                return Toast.makeText(context,"Регистрация прошла успешно",Toast.LENGTH_LONG).show()
            }


        }

}