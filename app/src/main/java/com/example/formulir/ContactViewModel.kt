package com.example.formulir

import androidx.lifecycle.ViewModel
import com.example.formulir.Data.ContactUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(ContactUiState())
    val stateUI: StateFlow<ContactUiState> = _stateUI.asStateFlow()

    fun setContact(listData: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                alamat = listData[1],
                telepon = listData[2]
            )
        }
    }
}