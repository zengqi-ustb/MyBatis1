package com.zeng.domain;

import org.apache.ibatis.type.Alias;

/**
 * Created by zeng on 17-2-28.
 */
public class Goods {
    //达成率
    int completePercent;
    //剩余时间
    int leftTime;
    //已筹金额
    int currentFund;
    //分类
    String fundType;
    //图片链接
    String imgUrl;
    //项目连接
    String projectUrl;
    //平台
    String platform;
    //项目名称
    String projectName;
    //状态
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(int completePercent) {
        this.completePercent = completePercent;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public int getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(int leftTime) {
        this.leftTime = leftTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getCurrentFund() {
        return currentFund;
    }

    public void setCurrentFund(int currentFund) {
        this.currentFund = currentFund;
    }

    @Override
    public String toString() {
        return "platform: "+platform+" and fund_type: "+fundType;
    }
}
