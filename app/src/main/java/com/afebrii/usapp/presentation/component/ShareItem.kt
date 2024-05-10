package com.afebrii.usapp.presentation.component

import android.content.Context
import android.content.Intent
import com.afebrii.usapp.R

fun shareItem(context: Context) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.US_share))
        putExtra(Intent.EXTRA_TEXT, context.getString(R.string.share_message))
    }

    context.startActivity(
        Intent.createChooser(
            intent,
            "Universitas Siliwangi Application"
        )
    )
}