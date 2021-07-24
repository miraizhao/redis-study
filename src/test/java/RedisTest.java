import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-24  10:02
 * @Description:
 */
public class RedisTest {
    @Test
    public void testSet(){
        Jedis jedis=new Jedis("1.117.31.221",6379);
        jedis.auth("123456");
//        jedis.set("test","test");
        String a = jedis.get("a");
        System.out.println(a);
    }
    @Test
    public void testSet2(){
        RedisUtil.getRedisUtil().set("test2","test2");
    }
}
