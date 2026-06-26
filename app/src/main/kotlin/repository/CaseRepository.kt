package com.example.lawyercaseapp.repository

import androidx.lifecycle.LiveData
import com.example.lawyercaseapp.database.CaseDao
import com.example.lawyercaseapp.database.CaseEntity

class CaseRepository(private val caseDao: CaseDao) {

    fun getAllCases(): LiveData<List<CaseEntity>> = caseDao.getAllCases()

    fun getCasesByStatus(status: String): LiveData<List<CaseEntity>> = caseDao.getCasesByStatus(status)

    fun searchCases(query: String): LiveData<List<CaseEntity>> = caseDao.searchCases(query)

    suspend fun insertCase(caseEntity: CaseEntity) = caseDao.insertCase(caseEntity)

    suspend fun updateCase(caseEntity: CaseEntity) = caseDao.updateCase(caseEntity)

    suspend fun deleteCase(caseEntity: CaseEntity) = caseDao.deleteCase(caseEntity)

    suspend fun getCaseById(id: Int): CaseEntity? = caseDao.getCaseById(id)
}
