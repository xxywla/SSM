import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestPage {
    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Page<Object> page = PageHelper.startPage(2, 2);

        List<Emp> empList = mapper.selectByExample(null);
        empList.forEach(System.out::println);

        PageInfo<Emp> pageInfo = new PageInfo<>(empList, 4);

        System.out.println("page = " + page);
        System.out.println("pageInfo = " + pageInfo);

    }
}
