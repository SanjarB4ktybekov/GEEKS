package com.example.demo.controller;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("task")
public class TaskController {
    private final TaskRepository taskRepository;
    public TaskController(
            TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @PostMapping
    public void storePurchase(@RequestBody Task task) {
        taskRepository.storeTask(task);
    }
    @GetMapping
    public List<Task> findPurchases() {
        return taskRepository.findAllPurchases();
    }
}