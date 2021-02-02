import redis.clients.jedis.Jedis;

/**
 * Created by InvincibleDudu on 05/16/2020 at 02:08
 */
public class Redis {


    public static void main(String[] args) {
        var jedis = new Jedis("47.115.53.242");
        jedis.auth("djc387499");
//        System.out.println(jedis.get("学校"));
        System.out.println(jedis.get("name"));
//        System.out.println(jedis.get("姓名"));
    }

}
