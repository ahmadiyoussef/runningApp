package com.example.runningapp.repository

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
     val runDao: RunDao
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunsByDate()

    fun getAllRunsByTimeInMillis() = runDao.getAllRunsByTimeInMillis()

    fun getAllRunsByDistanceInMeters() = runDao.getAllRunsByDistanceInMeters()

    fun getAllRunsByCaloriesBurned() = runDao.getAllRunsByCaloriesBurned()

    fun getAllRunsByAvgSpeedInKMH() = runDao.getAllRunsByAvgSpeedInKMH()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getDistanceInMeters() = runDao.getDistanceInMeters()

    fun getTotalAvgSpeedInKMH() = runDao.getTotalAvgSpeedInKMH()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

}