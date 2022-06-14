package com.example.registrcleanarch.Domain.Activity

import android.content.Context
import android.os.AsyncTask.execute
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Model.UseDate
class AuthViewModel(private val getUserDate: GetUserDate,private val context: Context) : ViewModel() {

    var mutableLiveDataUser = MutableLiveData<String>()
    val resultLiveDataUser = mutableLiveDataUser

    var mutableLiveDataEmail = MutableLiveData<String>()
    val resultLiveDataEmail = mutableLiveDataEmail

    var mutableLiveDataPassword = MutableLiveData<String>()
    val resultLiveDataPassword = mutableLiveDataPassword

    fun getData(): UseDate{

      //  if(mutableLiveDataUser.value.isNullOrEmpty()){
        //    return Toast.makeText(context,"Имя пользователя не существует",Toast.LENGTH_LONG).show()
        // }
        val result:UseDate = getUserDate.execute()
        mutableLiveDataUser.value = result.name
        mutableLiveDataEmail.value = result.email
        mutableLiveDataPassword.value = result.password


        return  result
    }
}

