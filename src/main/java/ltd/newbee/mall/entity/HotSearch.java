package ltd.newbee.mall.entity;

import org.omg.PortableInterceptor.INACTIVE;

public class HotSearch {
    private Integer id;

    private Integer hot_class;

    private String hot_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHot_class() {
        return hot_class;
    }

    public void setHot_class(Integer hot_class) {
        this.hot_class = hot_class;
    }

    public String getHot_name() {
        return hot_name;
    }

    public void setHot_name(String hot_name) {
        this.hot_name = hot_name;
    }
}
