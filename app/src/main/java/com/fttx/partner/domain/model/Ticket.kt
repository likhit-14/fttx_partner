package com.fttx.partner.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ticket(
    val id: String,
    val title: String,
    val time: String,
    val category: String,
    val status: String,
    val customer: Customer,
) : Parcelable
