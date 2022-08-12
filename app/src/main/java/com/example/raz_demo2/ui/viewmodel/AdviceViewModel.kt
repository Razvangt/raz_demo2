package com.example.raz_demo2.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.raz_demo2.data.model.AdviceModel
import com.example.raz_demo2.domain.GetAdviceUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AdviceViewModel @Inject constructor(
    private val  getAdviceUseCase: GetAdviceUseCase
) : ViewModel() {
    val adviceModel  = MutableLiveData<AdviceModel?>()
    val isLoading  = MutableLiveData<Boolean>()
    fun randomAdvice(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getAdviceUseCase()
            if (result != null){
                adviceModel.postValue(result)
                isLoading.postValue(false)
            }
        }
    }
}