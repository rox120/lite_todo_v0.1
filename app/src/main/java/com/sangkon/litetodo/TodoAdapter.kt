package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding



class TodoAdapter: RecyclerView.Adapter<TodoAdapter.TodoHolder>() {

    private val todoList: MutableList<Todo> = mutableListOf()

    override fun getItemCount(): Int  = todoList.size

    class TodoHolder(private val binding: TodoCardViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun binData(todo: Todo) {
            binding.todo = todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val binding = TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.binData(todoList[position])
    }

    fun setTodoList(list: List<Todo>) {
        todoList.addAll(list)
    }
}