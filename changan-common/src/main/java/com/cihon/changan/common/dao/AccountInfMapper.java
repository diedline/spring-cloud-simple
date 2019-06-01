package com.cihon.changan.common.dao;

import com.cihon.changan.common.model.vo.AccountInf;
import com.cihon.changan.common.model.vo.AccountInfExample;
import com.cihon.changan.common.model.vo.AccountInfWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountInfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    long countByExample(AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int deleteByExample(AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int insert(AccountInfWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int insertSelective(AccountInfWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    List<AccountInfWithBLOBs> selectByExampleWithBLOBs(AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    List<AccountInf> selectByExample(AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    AccountInfWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") AccountInfWithBLOBs record, @Param("example") AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") AccountInfWithBLOBs record, @Param("example") AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByExample(@Param("record") AccountInf record, @Param("example") AccountInfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByPrimaryKeySelective(AccountInfWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(AccountInfWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    int updateByPrimaryKey(AccountInf record);
}