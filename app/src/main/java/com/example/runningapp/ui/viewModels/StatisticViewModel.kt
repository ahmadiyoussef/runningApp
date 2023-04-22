package com.example.runningapp.ui.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningapp.repository.MainRepository
import javax.inject.Inject

class StatisticViewModel @ViewModelInject constructor(
    repository: MainRepository
) : ViewModel() {


}