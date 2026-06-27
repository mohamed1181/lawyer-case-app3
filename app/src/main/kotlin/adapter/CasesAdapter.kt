package com.example.lawyercaseapp.adapter

import android.view.LayoutInflater
import android.view.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lawyercaseapp.R
import com.example.lawyercaseapp.database.CaseEntity

class CasesAdapter : RecyclerView.Adapter<CasesAdapter.CaseViewHolder>() {

    private var cases: List<CaseEntity> = emptyList()

    fun submitList(newCases: List<CaseEntity>) {
        cases = newCases
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_case, parent, false)
        return CaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CaseViewHolder, position: Int) {
        holder.bind(cases[position])
    }

    override fun getItemCount() = cases.size

    class CaseViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        private val caseNumber: TextView = itemView.findViewById(R.id.case_number)
        private val clientName: TextView = itemView.findViewById(R.id.client_name)
        private val caseStatus: TextView = itemView.findViewById(R.id.case_status)

        fun bind(caseEntity: CaseEntity) {
            caseNumber.text = "رقم القضية: ${caseEntity.caseNumber}"
            clientName.text = "الموكل: ${caseEntity.clientName}"
            caseStatus.text = "الحالة: ${caseEntity.status}"
        }
    }
}
