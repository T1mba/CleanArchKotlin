package com.example.registrcleanarch.AppModuleKoin

import com.example.registrcleanarch.Data.Repository.RegsImpl
import com.example.registrcleanarch.Data.Storage.DateSharedPref
import com.example.registrcleanarch.Data.Storage.UserDateStorage
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Repository.RegsInterface
import org.koin.dsl.module



val dataModule = module {
    single <UserDateStorage>{
        DateSharedPref(context = get())
    }
    single <RegsInterface>{
        RegsImpl(userDateStorage = get())
    }


}