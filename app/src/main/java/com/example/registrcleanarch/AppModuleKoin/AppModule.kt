package com.example.registrcleanarch.AppModuleKoin

import com.example.registrcleanarch.Data.Storage.DateSharedPref
import com.example.registrcleanarch.Domain.Activity.AuthActivity
import com.example.registrcleanarch.Domain.Activity.AuthViewModel
import com.example.registrcleanarch.Domain.Activity.MainViewModel
import com.example.registrcleanarch.Domain.Methods.GetUserDate
import com.example.registrcleanarch.Domain.Methods.MethodsMainWindow
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            saveUserDate = get(),
            context = get()


        )


    }
    viewModel<AuthViewModel>{
        AuthViewModel(
            getUserDate = get(),
            context = get()
        )
    }
}










