import bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by InvincibleDudu on 08/17/2020 at 16:47
 */

@Mapper
interface DBMapper {

    @Select("select * from app")
    List<Student> s();
}
