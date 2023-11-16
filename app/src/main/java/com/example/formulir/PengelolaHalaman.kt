package com.example.formulir

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class PengelolaHalaman {
    Formulir,
    Detail,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactApp(
    viewModel: ContactViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        val uiState by viewModel.stateUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Formulir.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PengelolaHalaman.Formulir.name) {
                HalamanSatu(onSubmitButtonClick = {
                    viewModel.setContact(it)
                    navController.navigate(PengelolaHalaman.Detail.name)
                })
            }
            composable(route = PengelolaHalaman.Detail.name) {
                HalamanDua(ContactUiState = uiState,
                    onClickButtonBack = {
                        navController.popBackStack(PengelolaHalaman.Formulir.name, false)
                    })
            }
        }

    }
}