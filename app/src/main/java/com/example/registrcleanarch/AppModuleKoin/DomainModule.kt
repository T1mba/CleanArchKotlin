package com.example.registrcleanarch.AppModuleKoin

import com.example.registrcleanarch.Data.Repository.RegsImpl
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Methods.MethodsMainWindow
import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate
import org.koin.dsl.module


val domainModule = module {
    factory<MethodsMainWindow>{
        MethodsMainWindow(
            Regs = get()


        )
    }
    factory <GetUserDate>{
        GetUserDate(regs = get())
    }

}