package com.example.hippocentre.ui.cursus

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

    class CursusViewModel : ViewModel() {
        private val _cursusItems = MutableLiveData<List<CursusItem>>().apply {
            value = listOf(
                CursusItem("Options des cours", listOf("Options disciplinaires", "Options professionnelles")),
                CursusItem("Stages", listOf("CME à l'international", "CME en France", "Sting à l'international", "Sting en France", "PFE à l'international", "PFE en France")),
                // Add more CursusItem instances as needed
            )
        }
        val cursusItems: LiveData<List<CursusItem>> = _cursusItems
    }


