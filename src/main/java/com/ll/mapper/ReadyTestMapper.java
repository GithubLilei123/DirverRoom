package com.ll.mapper;

import com.ll.pojo.ReadyTest;
import com.ll.pojo.ReadyTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ReadyTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    long countByExample(ReadyTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int deleteByExample(ReadyTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int insert(ReadyTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int insertSelective(ReadyTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    List<ReadyTest> selectByExample(ReadyTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    ReadyTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") ReadyTest record, @Param("example") ReadyTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByExample(@Param("record") ReadyTest record, @Param("example") ReadyTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByPrimaryKeySelective(ReadyTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ready_test
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByPrimaryKey(ReadyTest record);
}