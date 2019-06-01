package com.cihon.changan.common.dao;

import com.cihon.changan.common.model.vo.Administrator;
import com.cihon.changan.common.model.vo.AdministratorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    long countByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int deleteByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int insert(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int insertSelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    List<Administrator> selectByExampleWithBLOBs(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    List<Administrator> selectByExample(AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    Administrator selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExample(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByPrimaryKeySelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Administrator record);
}