package com.example.hippocentre.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _greeting = MutableLiveData<String>().apply {
        value = "Bonjour Thomas"
    }
    val greeting: LiveData<String> = _greeting

    private val _menuItems = MutableLiveData<List<String>>().apply {
        value = listOf("Dernières activités", "Stages à l'étranger", "Option Info-SI", "Double diplôme à KTH")
    }
    val menuItems: LiveData<List<String>> = _menuItems
}
