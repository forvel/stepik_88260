package by.javastart.stepik_course_88260.controllers;

import by.javastart.stepik_course_88260.model.Task;
import by.javastart.stepik_course_88260.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    public Task create(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @GetMapping("/tasks")
    public Iterable<Task> findAll(){
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getById(@PathVariable Long id){
        return taskRepository.findById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task){
        task.setId(id);
        return taskRepository.save(task);
    }
    @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable Long id){
        taskRepository.deleteById(id);
    }

    @PatchMapping("/tasks/{id}")
    public void markAsDone(@PathVariable Long id, @RequestBody Task task){
        if (task.isDone()) taskRepository.markAsDone(id);
    }
}
