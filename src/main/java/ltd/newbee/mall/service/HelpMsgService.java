package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.HelpMsg;

import java.util.List;

public interface HelpMsgService {
    List<HelpMsg> findList(Integer helpCategoryId);
}
