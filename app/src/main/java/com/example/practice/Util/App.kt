package com.example.practice.Util

import android.text.TextUtils

object App {
    var TAG = ""
    var Name = ""
    var OwnNumber = ""

    fun Function(): String {
        val stackTraceElements =
            Throwable().stackTrace
        val splitter: TextUtils.StringSplitter = TextUtils.SimpleStringSplitter('.')
        splitter.setString(stackTraceElements[1].fileName)
        return splitter.iterator().next().toString() + "." + stackTraceElements[1].methodName + "()"
    }
}