package wang.conge.springbase.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wang.conge.springbase.domain.TaskDO;
import wang.conge.springbase.service.TaskService;

@RestController
public class TaskController {
	
	@Resource
	private TaskService taskService;
	
	@RequestMapping("/task/create")
	public TaskDO create(){
		return taskService.createTask("newTitle", "content");
	}
}
