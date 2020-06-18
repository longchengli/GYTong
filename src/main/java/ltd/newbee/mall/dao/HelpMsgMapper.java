package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.HelpMsg;
import ltd.newbee.mall.util.PageQueryUtil;

import java.util.List;

public interface HelpMsgMapper {
    List<HelpMsg> findList(Integer helpCategoryId);
}
