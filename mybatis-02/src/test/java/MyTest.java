import com.Dao.StudentMapper;
import com.Dao.TeacherMapper;
import com.pojo.Student;
import com.pojo.Teacher;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 517
 * @date 2021-03-10 - 14:55
 */
public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for (Student student: students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
