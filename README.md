# springbase
基于spring/spring boot 写的快速启动项目模版

# slf4j写日志
```
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoLogService {
	public void addLog(){
		log.info("just log");
	}
}

```
- 在类上面加入lombok.extern.slf4j.Slf4j注解
- 直接使用log变量记录日志

# lombok
- 减少代码