package com.example.hippocentre.ui.cursus

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class CursusViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is cursus Fragment"
    }
    val text: LiveData<String> = _text

}