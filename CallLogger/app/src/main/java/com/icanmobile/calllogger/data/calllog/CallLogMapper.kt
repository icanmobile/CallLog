package com.icanmobile.calllogger.data.calllog

import android.database.Cursor
import android.telephony.PhoneNumberUtils
import java.lang.Long
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class CallLogMapper @Inject constructor() {

    companion object {
        private const val DATE_FORMAT = "h:mm a MM/d/yy"
        private const val INCOMING = "Incoming"
    }

    fun toCallItem(cursor: Cursor): CallLog {
        val number = cursor.getString(cursor.getColumnIndex(android.provider.CallLog.Calls.NUMBER))
        val date = cursor.getString(cursor.getColumnIndex(android.provider.CallLog.Calls.DATE))

        var callNumber = PhoneNumberUtils.formatNumber(number, Locale.getDefault().country)
        var callDate = SimpleDateFormat(DATE_FORMAT).format(Date(Long.parseLong(date)))
        var callType = INCOMING
        return CallLog(callNumber, callDate, callType)
    }
}