package wang.conge.springbase.util.test.bean;

import org.junit.Assert;
import org.junit.Test;

import wang.conge.springbase.util.BeanUtil;

/**
 * TODO
 * 
 * @author haozhan.wc
 * @since 2017-04-06
 */
public class BeanUtilTest {

	@Test
	public void testBeanCopy() {
		for (int i = 0; i <= 100000; i++) {
			final int index = i;

			new Thread(() -> {
				Other source = new Other();
				source.setAge(index);

				Myth target = new Myth();
				BeanUtil.copy(source, target);

				System.out.println(target.getAge());
				Assert.assertEquals(target.getAge(), source.getAge());
			}).start();
		}

	}

}
