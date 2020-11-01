package com.example.apartmentmanage_android.ui.contract

import android.content.Intent
import com.example.apartmentmanage_android.app.Constants
import com.example.apartmentmanage_android.data.source.local.roompersistence.entity.ContractEntity
import com.example.apartmentmanage_android.ui.contract.dialog.CRUContractActivity
import com.example.apartmentmanage_android.utils.ActivityUtils
import javax.inject.Inject

interface ContractNavigator {
    fun navigateToAddContract()
    fun navigateToUpdateContract(contractEntity: ContractEntity)
}

class ContractNavigatorImpl @Inject constructor(private val fragment: ContractFragment) :
    ContractNavigator {
    override fun navigateToAddContract() {
        val intent = Intent(fragment.context, CRUContractActivity::class.java).apply {
            putExtra("REQUEST_ADD", Constants.REQUEST_ADD)
        }
        ActivityUtils.startActivityForResultSlideByFragment(
            fragment,
            fragment.context,
            intent,
            Constants.REQUEST_ADD
        )
    }

    override fun navigateToUpdateContract(contractEntity: ContractEntity) {
        val intent = Intent(fragment.context, CRUContractActivity::class.java).apply {
            putExtra("REQUEST_UPDATE", Constants.REQUEST_UPDATE)
            putExtra("contractEntity", contractEntity)
        }
        ActivityUtils.startActivityForResultSlideByFragment(
            fragment,
            fragment.context,
            intent,
            Constants.REQUEST_UPDATE
        )
    }
}