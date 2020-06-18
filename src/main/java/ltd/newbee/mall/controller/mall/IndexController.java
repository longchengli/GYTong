package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.common.Constants;
import ltd.newbee.mall.common.IndexConfigTypeEnum;
import ltd.newbee.mall.controller.vo.NewBeeMallIndexCarouselVO;
import ltd.newbee.mall.controller.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.controller.vo.NewBeeMallIndexConfigGoodsVO;
import ltd.newbee.mall.entity.HotSearch;
import ltd.newbee.mall.service.HotSearchService;
import ltd.newbee.mall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.service.NewBeeMallCategoryService;
import ltd.newbee.mall.service.NewBeeMallIndexConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    private NewBeeMallCarouselService newBeeMallCarouselService;

    @Resource
    private NewBeeMallIndexConfigService newBeeMallIndexConfigService;

    @Resource
    private NewBeeMallCategoryService newBeeMallCategoryService;

    @Resource
    private HotSearchService hotSearchService;

    @GetMapping({"/index", "/", "/index.html"})
    public String indexPage(HttpServletRequest request) {
        logger.info("项目被访问，端口号："+request.getLocalPort());
        List<NewBeeMallIndexCategoryVO> categories = newBeeMallCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            return "error/error_5xx";
        }
        List<NewBeeMallIndexCarouselVO> carousels = newBeeMallCarouselService.getCarouselsForIndex(Constants.INDEX_CAROUSEL_NUMBER);
        List<NewBeeMallIndexConfigGoodsVO> hot_zf = newBeeMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_HOT.getType(), Constants.INDEX_GOODS_HOT_NUMBER);
        List<NewBeeMallIndexConfigGoodsVO> hot_czf = newBeeMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_NEW.getType(), Constants.INDEX_GOODS_NEW_NUMBER);
        List<NewBeeMallIndexConfigGoodsVO> recommendGoodses = newBeeMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_RECOMMOND.getType(), Constants.INDEX_GOODS_RECOMMOND_NUMBER);
        List<NewBeeMallIndexConfigGoodsVO> hot_job = newBeeMallIndexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_JOB.getType(), Constants.INDEX_GOODS_JOB_NUMBER);
        request.setAttribute("categories", categories);//分类数据
        request.setAttribute("carousels", carousels);//轮播图
        request.setAttribute("hot_zf", hot_zf);//热门整房
        request.setAttribute("hot_czf", hot_czf);//热门出租房
        request.setAttribute("recommendGoodses", recommendGoodses);//推荐二手
        request.setAttribute("hot_job", hot_job);//推荐职位


        //热门搜索关键字
        List<HotSearch> list = hotSearchService.hotList();
        List hotList1 = new ArrayList();
        List hotList2 = new ArrayList();
        List hotList3 = new ArrayList();
        for(HotSearch hotSearch : list){
            if(hotSearch.getHot_class()==1) {
                hotList1.add(hotSearch);
            }
            if(hotSearch.getHot_class()==2) {
                hotList2.add(hotSearch);
            }
            if(hotSearch.getHot_class()==3) {
                hotList3.add(hotSearch);
            }
        }
        request.setAttribute("hotList1", hotList1);
        request.setAttribute("hotList2", hotList2);
        request.setAttribute("hotList3", hotList3);

        return "mall/index";
    }
}
