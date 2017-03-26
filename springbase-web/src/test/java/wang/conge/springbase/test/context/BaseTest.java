package wang.conge.springbase.test.context;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 * 
 * @author haozhan.wc
 * @since 2017-03-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BaseContext.class)
public class BaseTest {

}
