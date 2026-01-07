package com.example.writo

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.writo.Room.Todo
import java.time.Instant
import java.util.Date

object TodoManger {

    private val todoList = mutableListOf<Todo>()


    fun getAllTodo(): List<Todo> {
        return todoList
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(tittle: String) {
        todoList.add(
            Todo(
                System.currentTimeMillis().toInt(),
                tittle, Date.from(Instant.now())
            )
        )
    }

    fun deleteTodo(id: Int) {
        todoList.removeIf {
            it.id == id
        }
    }
}