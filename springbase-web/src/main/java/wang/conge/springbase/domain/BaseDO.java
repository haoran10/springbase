package wang.conge.springbase.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseDO implements Serializable{

	private static final long serialVersionUID = -6184463902665270217L;
	
	private Long id;
	
	private Integer rowStatus;
	
	private Integer rowVersion;
	
	private Date createTs;
	
	private Date updateTs;
}
