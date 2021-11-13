package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.junit.Assert.*
import org.junit.Test

class StatisticsUtilsTest {

    @Test
    fun getActiveAndCompleteStats_noCompleted_returnsHundredZero() {
        // Create an active task
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false),
            Task("title", "desc", isCompleted = false)
        )

        // Call function
        val result = getActiveAndCompletedStats(tasks)

        // Verify the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 100f)

    }

    @Test
    fun getActiveAndCompleteStats_empty_returnsZeros(){
        val result = getActiveAndCompletedStats(emptyList())

        assertEquals(result.activeTasksPercent, 0f)
        assertEquals(result.completedTasksPercent, 0f)
    }
}