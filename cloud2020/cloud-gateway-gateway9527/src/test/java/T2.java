import java.time.ZonedDateTime;

/**
 * @author 西楚霸王
 * @date 2020/12/19 13:29
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); //默认时区
        System.out.println(zbj);
        //2020-12-19T13:30:39.260+08:00[Asia/Shanghai]
    }
}
