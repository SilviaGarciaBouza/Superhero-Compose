package com.github.superherocompose

import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

import kotlinx.coroutines.runBlocking
import org.junit.*

class SuperheroListUseCaseTest {
   // @RelaxedMockK

}



/**
class AddTaskUseCaseTest {

    @RelaxedMockK
    private lateinit var taskRepository: TaskRepository
    lateinit var addTaskUseCase: AddTaskUseCase


    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        addTaskUseCase = AddTaskUseCase(taskRepository)
    }

    @Test
    fun verifyAddTask() = runBlocking{
        val task=  TaskModel (nameTask = "task")


        //Given
        // coEvery { taskRepository.addTask(task)}

        //When
        addTaskUseCase(task)

        //Then
        coVerify(exactly = 1) { taskRepository.addTask(task) }
    }

}

*/