package com.example.registrcleanarch.Data.Storage

import android.content.Context
import com.example.registrcleanarch.Domain.Model.DateOfUserModel


private const val SharedPrefsName = "User_Prefs"
private const val Key_UserName = "Name"
private const val Key_Email = "Email"
private const val Key_Password = "Password"

class DateSharedPref(context: Context) : UserDateStorage {

    private val sharedPreferences = context.getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE)
    override fun regs(storageModel: StorageModel): Boolean {
        sharedPreferences.edit().putString(Key_UserName, storageModel.userName).apply()
        sharedPreferences.edit().putString(Key_Email, storageModel.email).apply()
        sharedPreferences.edit().putString(Key_Password,storageModel.password).apply()
        return true
    }

    override fun GetRegs(): StorageModel {
        val nameStringGet = sharedPreferences.getString(Key_UserName, "")?: ""
        val emailStringGet =sharedPreferences.getString(Key_Email, "")?: ""
        val passwordStringGet = sharedPreferences.getString(Key_Password, "")?:""

        return  StorageModel(userName = nameStringGet, email = emailStringGet, password = passwordStringGet)
    }

}