package com.example.registrcleanarch.Data.Repository

import android.content.Context
import com.example.registrcleanarch.Data.Storage.DateSharedPref
import com.example.registrcleanarch.Data.Storage.StorageModel
import com.example.registrcleanarch.Data.Storage.UserDateStorage
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate
import com.example.registrcleanarch.Domain.Repository.RegsInterface
import java.util.*


class RegsImpl(private val userDateStorage: UserDateStorage) : RegsInterface {


    override fun regs(DateOfUserModel: DateOfUserModel): Boolean {

        val user = regsToStorage(DateOfUserModel)
        val result = userDateStorage.regs(user)
        return result
    }



    override fun GetRegs(): UseDate {
            val user = userDateStorage.GetRegs()

        return GetRegsToDomain(user)
    }
    private fun regsToStorage(DateOfUserModel: DateOfUserModel) : StorageModel{
      return  StorageModel(userName = DateOfUserModel.userString,email = DateOfUserModel.emailString,password = DateOfUserModel.passwordString)
    }
    private fun GetRegsToDomain(storageModel: StorageModel) : UseDate{
        return UseDate(name = storageModel.userName,email = storageModel.email,password = storageModel.password)
    }
}