package com.example.registrcleanarch.Data.Storage

import com.example.registrcleanarch.Domain.Model.DateOfUserModel
import com.example.registrcleanarch.Domain.Model.UseDate

interface UserDateStorage {
    fun regs(storageModel: StorageModel): Boolean
    fun GetRegs(): StorageModel
}