package com.example.registrcleanarch.Domain.Repository

import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate

interface RegsInterface {
    fun regs(DateOfUserModel: DateOfUserModel): Boolean
    fun GetRegs(): UseDate


}