package com.icanmobile.calllogger.data

import android.content.ContentResolver
import androidx.annotation.NonNull
import com.icanmobile.calllogger.data.calllog.CallLog
import com.icanmobile.calllogger.data.calllog.CallLogManager
import com.jakewharton.rxrelay2.BehaviorRelay
import javax.inject.Inject

class DataManager @Inject constructor(private val callLogManager: CallLogManager) {

    val callLogs = BehaviorRelay.createDefault(listOf<CallLog>())

    /**
     * load call histories from CallLogManager class and transfer the histories using reactive extensions.
     * @param contentResolver the content resolver
     * @param limit the max number of call histories
     */
    fun loadCallLogs(@NonNull contentResolver: ContentResolver, limit: Int) {
        callLogManager.loadCallLogs(contentResolver, limit) { logs ->
            callLogs.accept(logs)
        }
    }


    /**
     * update call histories from CallLogManager class and transfer the histories using reactive extensions.
     * @param contentResolver the content resolver
     */
    fun updateCallLogs(contentResolver: ContentResolver) {
        callLogManager.updateCallLogs(contentResolver) { logs ->
            callLogs.accept(logs)
        }
    }
}