package com.example.registrcleanarch.Domain.Methods

import com.example.registrcleanarch.Data.Repository.RegsImpl
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Repository.RegsInterface

class MethodsMainWindow(private val Regs: RegsInterface) {
    private val   haveDate = Regs.GetRegs()
fun execute(save: DateOfUserModel): Boolean {

            if(haveDate.name == save.userString && haveDate.email == save.emailString && haveDate.password == save.passwordString){
                return true
            }

            val result = Regs.regs(DateOfUserModel = save)


        return  result

    }



}