package com.example.allowancetracker.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "purchase_table")
data class Purchase(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "cost") val cost: Double,
    @ColumnInfo(name = "date") val date: Date?,
    @ColumnInfo(name = "description") val description: String
) : Parcelable