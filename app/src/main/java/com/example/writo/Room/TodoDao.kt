package com.example.writo.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query
import com.example.writo.Room.Todo
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
interface TodoDao {

    @Query("SELECT * FROM TodoDatabase ORDER BY createdAt DESC")
    fun getAllTodos(): LiveData<List<Todo>>

    @Insert
     fun addTodo(todo: Todo)

    @Query("DELETE FROM TodoDatabase WHERE id = :id")
     fun deleteTodo(id: Int)
}
