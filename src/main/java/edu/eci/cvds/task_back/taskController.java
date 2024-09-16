package edu.eci.cvds.task_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taskManager")
public class taskController {
    @Autowired
    private TaskService taskService;


    @GetMapping
    public List<Task> getTasks(@RequestParam String idUser) {
        return taskService.getTasksByUser(idUser);
    }
}
