import com.alibaba.fastjson.JSON;
import com.tyd.entity.AcctUser;
import com.tyd.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;


/**
 * Created by ZKY on 2017-08-23 16:15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})

public class TestUserService
{
    private static final Logger LOGGER= Logger.getLogger(TestUserService.class);

    @Autowired
    private UserService userService;
    @Test
    public void testSave()
    {
        AcctUser acctUser = new AcctUser();

        acctUser.setId(UUID.randomUUID().toString().replaceAll("\\-",""));
        acctUser.setNickName("Abbot");
        acctUser.setTelephone("17858835210");
        acctUser.setRegisterDate(new Date());
        String id = userService.save(acctUser);
        LOGGER.info(JSON.toJSONString(id));
    }
}
