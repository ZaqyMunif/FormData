package com.example.formulir

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.formulir.Data.ContactUiState

@Composable
fun HalamanDua(
    ContactUiState: ContactUiState,
    onClickButtonBack: () -> Unit
){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(text = "Nama")
        Text(text = ContactUiState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = ContactUiState.alamat)
        Spacer(modifier = Modifier.padding(16.dp))
        Divider()
        Text(text = "No Telepon")
        Spacer(modifier = Modifier.padding(16.dp))
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onClickButtonBack }) {
            Text(text = stringResource(id = R.string.back))
        }
    }
}