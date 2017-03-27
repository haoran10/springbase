package wang.conge.springbase.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import wang.conge.springbase.domain.TaskDO;

@Slf4j
@Component
public class TaskService {
	public TaskDO createTask(String title,String content){
		log.info("create task:" + title);
		
		TaskDO taskDO = new TaskDO();
		taskDO.setTaskTitle(title);
		taskDO.setTaskContent(content);
		
		return taskDO;
	}
}
