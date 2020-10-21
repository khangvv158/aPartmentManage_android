package com.example.apartmentmanage_android.data.source.local.roompersistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "Contract", primaryKeys = ["ContractID"])
data class ContractEntity (
    @ColumnInfo(name = "ContractID") val ID: String,
    @ColumnInfo(name = "ContractName") val name: String,
    @ColumnInfo(name = "ContractKind") val kind: String,
    @ColumnInfo(name = "EmployeeID") val employeeID: String,
    @ColumnInfo(name = "ApartmentID") val regionID: String,
    @ColumnInfo(name = "FamilyID") val familyID: String,
    @ColumnInfo(name = "SumCost") val sum: Float
)