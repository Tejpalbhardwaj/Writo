package com.example.writo

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.writo.Room.Todo
import com.example.writo.ui.theme.Poppins
import com.example.writo.ui.theme.White
import java.text.SimpleDateFormat
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TodoListPage(viewModel: TodoViewModel) {

//    object get viewModel from here after parameter
    val todoList by viewModel.todoList.observeAsState()

//    value for search field
    var inputText by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(8.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                placeholder = { Text(text = "Add A New Note...") })
            Button(onClick = {
                viewModel.addTodo(inputText)
                inputText = ""
            }) { Text(text = "Add") }
        }

        todoList?.let {
            LazyColumn(
                content =
                    {
                        itemsIndexed(it) { index: Int, item: Todo ->
                            TodoItem(item = item, viewModel = viewModel)
                        }
                    }
            )
        }
            ?: Text(text = "No Items Yet", modifier = Modifier
                .fillMaxWidth()
                .padding(9.dp) , textAlign = TextAlign.Center)

    }
}


@Composable
fun TodoItem(item: Todo, viewModel: TodoViewModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.inversePrimary)
            .padding(16.dp), verticalAlignment = Alignment.CenterVertically

    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = SimpleDateFormat("HH:mm:aa, dd/MM", Locale.ENGLISH).format(item.createdAt),
                fontFamily = Poppins,
                fontSize = 12.sp,
                color = Color.LightGray
            )
            Text(
                text = item.tittle, fontFamily = Poppins,
                fontSize = 18.sp,
                color = White
            )
        }

        IconButton({
            viewModel.deleteTodo(id = item.id)
        }) {
            Icon(
                painter = painterResource(id = com.example.writo.R.drawable.ic_delete),
                contentDescription = "",
                tint = Color.White
            )
        }

    }
}








