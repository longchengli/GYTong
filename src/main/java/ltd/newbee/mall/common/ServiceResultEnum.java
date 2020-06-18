package ltd.newbee.mall.common;


public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("success"),

    DATA_NOT_EXIST("未查询到记录！"),

    SAME_CATEGORY_EXIST("有同级同名的分类！"),

    SAME_LOGIN_NAME_EXIST("用户名已存在！"),

    LOGIN_NAME_NULL("请输入登录名！"),

    LOGIN_PASSWORD_NULL("请输入密码！"),

    LOGIN_VERIFY_CODE_NULL("请输入验证码！"),

    LOGIN_VERIFY_CODE_ERROR("验证码错误！"),

    GOODS_NOT_EXIST("信息不存在！"),

    GOODS_PUT_DOWN("信息已下架！"),

    SHOPPING_CART_ITEM_LIMIT_NUMBER_ERROR("超出最大数量！"),

    SHOPPING_CART_ITEM_TOTAL_NUMBER_ERROR("超出最大容量！"),

    LOGIN_ERROR("登录失败！"),

    LOGIN_USER_LOCKED("用户已被禁止登录！"),

    ORDER_NOT_EXIST_ERROR("用户不存在！"),

    NULL_ADDRESS_ERROR("信息不能为空！"),

    ORDER_PRICE_ERROR("异常！"),

    ORDER_GENERATE_ERROR("异常！"),

    SHOPPING_ITEM_ERROR("数据异常！"),

    SHOPPING_ITEM_COUNT_ERROR(""),

    ORDER_STATUS_ERROR("状态异常！"),

    OPERATE_ERROR("操作失败！"),

    DB_ERROR("database error");

    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
