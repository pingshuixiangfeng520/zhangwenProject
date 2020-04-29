import com.dao.StudentMapper;
import com.model.pojo.Student;
import com.service.IStudentService;
import com.utils.TestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring*.xml","classpath:spring-mybatis.xml"})
@Component
public class Test1 {


//    @Autowired
//    private TestService testService;

    @Resource
    private StudentMapper studentMapper;
//    @Autowired
//    private IStudentService studentService;

    @org.junit.Test
    public void testSpring(){
//        testService.view();
//        studentMapper.findStudent();

        List<Student> list = studentMapper.findStudent();

        for (Student s: list
             ) {
            System.out.println(s);

        }
    }



}
