package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.HotSearchMapper;
import ltd.newbee.mall.entity.HotSearch;
import ltd.newbee.mall.service.HotSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotSearchServiceImpl implements HotSearchService {

    @Resource
    HotSearchMapper hotSearchMapper;

    @Override
    public List<HotSearch> hotList() {
        return hotSearchMapper.hotList();
    }
}
