package com.cihon.changan.common.model.vo;

public class AccountInfWithBLOBs extends AccountInf {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_inf.headimg
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String headimg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_inf.weixingAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String weixingaccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_inf.zhifubaoAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String zhifubaoaccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_inf.zhifubaoname
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String zhifubaoname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_inf.headimg
     *
     * @return the value of account_inf.headimg
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_inf.headimg
     *
     * @param headimg the value for account_inf.headimg
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_inf.weixingAccount
     *
     * @return the value of account_inf.weixingAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getWeixingaccount() {
        return weixingaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_inf.weixingAccount
     *
     * @param weixingaccount the value for account_inf.weixingAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setWeixingaccount(String weixingaccount) {
        this.weixingaccount = weixingaccount == null ? null : weixingaccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_inf.zhifubaoAccount
     *
     * @return the value of account_inf.zhifubaoAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getZhifubaoaccount() {
        return zhifubaoaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_inf.zhifubaoAccount
     *
     * @param zhifubaoaccount the value for account_inf.zhifubaoAccount
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setZhifubaoaccount(String zhifubaoaccount) {
        this.zhifubaoaccount = zhifubaoaccount == null ? null : zhifubaoaccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_inf.zhifubaoname
     *
     * @return the value of account_inf.zhifubaoname
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getZhifubaoname() {
        return zhifubaoname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_inf.zhifubaoname
     *
     * @param zhifubaoname the value for account_inf.zhifubaoname
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setZhifubaoname(String zhifubaoname) {
        this.zhifubaoname = zhifubaoname == null ? null : zhifubaoname.trim();
    }
}