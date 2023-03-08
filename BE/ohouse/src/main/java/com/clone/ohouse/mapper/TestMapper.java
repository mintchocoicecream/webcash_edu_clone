package com.clone.ohouse.mapper;

import com.clone.ohouse.domain.TestVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from test_table")
    List<TestVO> getTest() throws Exception;


}
