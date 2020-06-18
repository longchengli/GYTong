package ltd.newbee.mall.entity;

import java.util.Date;

public class HelpMsg {
    private Integer helpId;
    private String helpName;
    private String helpMsg;
    private Integer helpCategoryId;
    private Integer helpUserId;
    private Date helpCtrateDate;

    public Integer getHelpId() {
        return helpId;
    }

    public void setHelpId(Integer helpId) {
        this.helpId = helpId;
    }

    public String getHelpName() {
        return helpName;
    }

    public void setHelpName(String helpName) {
        this.helpName = helpName;
    }

    public Integer getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(Integer helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    public String getHelpMsg() {
        return helpMsg;
    }

    public void setHelpMsg(String helpMsg) {
        this.helpMsg = helpMsg;
    }


    public Integer getHelpUserId() {
        return helpUserId;
    }

    public void setHelpUserId(Integer helpUserId) {
        this.helpUserId = helpUserId;
    }

    public Date getHelpCtrateDate() {
        return helpCtrateDate;
    }

    public void setHelpCtrateDate(Date helpCtrateDate) {
        this.helpCtrateDate = helpCtrateDate;
    }

    public Integer getHelpState() {
        return helpState;
    }

    public void setHelpState(Integer helpState) {
        this.helpState = helpState;
    }

    private Integer helpState;
}
