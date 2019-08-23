package com.icanmobile.calllogger.ui.calllogger

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.icanmobile.calllogger.R
import com.icanmobile.calllogger.data.calllog.CallLog

class CallLoggerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val numberTextView: TextView
    val dateTextView: TextView
    val typeTextView: TextView

    init {
        numberTextView = itemView.findViewById(R.id.numberTextView)
        dateTextView = itemView.findViewById(R.id.dateTextView)
        typeTextView = itemView.findViewById(R.id.typeTextView)
    }

    fun configureWith(callLog: CallLog) {
        numberTextView.text = callLog.callNumber
        dateTextView.text = callLog.callDate
        typeTextView.text = callLog.callType
    }
}