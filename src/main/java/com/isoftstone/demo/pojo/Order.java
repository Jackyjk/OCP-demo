package com.isoftstone.demo.pojo;

/**
 * 订单信息
 */
public class Order {
    private int id;    //订单编号
    private int flag;  //订单状态：0待审核、1已审核、2审核驳回、3取消、4待上传附件、5待复核、6复核驳回、7已复核、8成功
    private String remarks;    //审核信息备注
    private String appendix;   //附件地址
    private int firstOperatorId;    //初审运营人员id
    private int secondOperatorId;   //复审运营人员id
    private int agentUserId;    //经销商id
    private String createTime;  //创建时间
    private String updateTime;  //更新时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    public int getFirstOperatorId() {
        return firstOperatorId;
    }

    public void setFirstOperatorId(int firstOperatorId) {
        this.firstOperatorId = firstOperatorId;
    }

    public int getSecondOperatorId() {
        return secondOperatorId;
    }

    public void setSecondOperatorId(int secondOperatorId) {
        this.secondOperatorId = secondOperatorId;
    }

    public int getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(int agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
