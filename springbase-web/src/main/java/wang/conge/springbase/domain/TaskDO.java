package wang.conge.springbase.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class TaskDO extends BaseDO{
	private static final long serialVersionUID = -773050498573873500L;
	
	private String taskTitle;
	
	private String taskContent;
}
