package com.example.lawyercaseapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lawyercaseapp.database.CaseEntity
import com.example.lawyercaseapp.repository.CaseRepository
import kotlinx.coroutines.launch

class CaseViewModel(private val repository: CaseRepository) : ViewModel() {

    val allCases: LiveData<List<CaseEntity>> = repository.getAllCases()

    fun getCasesByStatus(status: String): LiveData<List<CaseEntity>> = repository.getCasesByStatus(status)

    fun searchCases(query: String): LiveData<List<CaseEntity>> = repository.searchCases(query)

    fun insertCase(caseEntity: CaseEntity) {
        viewModelScope.launch {
            repository.insertCase(caseEntity)
        }
    }

    fun updateCase(caseEntity: CaseEntity) {
        viewModelScope.launch {
            repository.updateCase(caseEntity)
        }
    }

    fun deleteCase(caseEntity: CaseEntity) {
        viewModelScope.launch {
            repository.deleteCase(caseEntity)
        }
    }

    fun getCaseById(id: Int, onResult: (CaseEntity?) -> Unit) {
        viewModelScope.launch {
            val case = repository.getCaseById(id)
            onResult(case)
        }
    }
}
