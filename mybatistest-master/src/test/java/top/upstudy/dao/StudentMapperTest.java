package top.upstudy.dao;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.upstudy.pojo.Student;
import top.upstudy.utils.MybatisUtils;

import java.util.List;

public class StudentMapperTest extends TestCase {

    @Test
    public void testfindStudent(){
        //获取连接
        SqlSession session = MybatisUtils.getSession();
        //绑定mapper接口
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //以id查询查询学生数据
        Student student = mapper.getStudent(1);
        System.out.print("id:"+student.getId());
        System.out.print("name:"+student.getName());
        System.out.print("major:"+student.getMajor());
        //关闭连接
        session.close();
    }
}