package com.ll.mapper;

import com.ll.pojo.Trainer;
import com.ll.pojo.TrainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface TrainerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    long countByExample(TrainerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int deleteByExample(TrainerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int insert(Trainer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int insertSelective(Trainer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    List<Trainer> selectByExample(TrainerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    Trainer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") Trainer record, @Param("example") TrainerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByExample(@Param("record") Trainer record, @Param("example") TrainerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByPrimaryKeySelective(Trainer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trainer
     *
     * @mbg.generated Fri Dec 22 10:22:42 CST 2017
     */
    int updateByPrimaryKey(Trainer record);

    String selectCardByTrainerName(String trainerName);

    int selectIDByTrainerName(String trainerName);
}