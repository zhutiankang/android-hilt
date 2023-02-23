package com.example.android.hilt.data

/**
 * LoggerDataSource
 *
 * @author tiankang
 * @description:
 * @date :2023/2/23 13:45
 */

interface LoggerDataSource {

    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}