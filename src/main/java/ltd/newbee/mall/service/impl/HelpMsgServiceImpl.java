package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.HelpMsgMapper;
import ltd.newbee.mall.entity.HelpMsg;
import ltd.newbee.mall.service.HelpMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelpMsgServiceImpl implements HelpMsgService {

    @Resource
    HelpMsgMapper helpMsgMapper;

    @Override
    public List<HelpMsg> findList(Integer helpCategoryId) {
        List<HelpMsg> list = new ArrayList<>();
        list=helpMsgMapper.findList(helpCategoryId);
        return list;
    }
}
