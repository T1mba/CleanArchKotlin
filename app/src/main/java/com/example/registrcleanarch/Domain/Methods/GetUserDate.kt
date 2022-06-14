package com.example.registrcleanarch.Domain.Methods

import android.app.AlertDialog
import android.content.Context
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate
import com.example.registrcleanarch.Domain.Repository.RegsInterface

class GetUserDate(private val regs:RegsInterface) {
    fun execute(): UseDate
    {


            return regs.GetRegs()



    }

}