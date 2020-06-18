package ltd.newbee.mall.common;


public enum NewBeeMallOrderStatusEnum {

    DEFAULT(-9, "ERROR"),
    ORDER_PRE_PAY(0, "0"),
    OREDER_PAID(1, "1"),
    OREDER_PACKAGED(2, "2"),
    OREDER_EXPRESS(3, "3"),
    ORDER_SUCCESS(4, "4"),
    ORDER_CLOSED_BY_MALLUSER(-1, "-1"),
    ORDER_CLOSED_BY_EXPIRED(-2, "-2"),
    ORDER_CLOSED_BY_JUDGE(-3, "-3");

    private int orderStatus;

    private String name;

    NewBeeMallOrderStatusEnum(int orderStatus, String name) {
        this.orderStatus = orderStatus;
        this.name = name;
    }

    public static NewBeeMallOrderStatusEnum getNewBeeMallOrderStatusEnumByStatus(int orderStatus) {
        for (NewBeeMallOrderStatusEnum newBeeMallOrderStatusEnum : NewBeeMallOrderStatusEnum.values()) {
            if (newBeeMallOrderStatusEnum.getOrderStatus() == orderStatus) {
                return newBeeMallOrderStatusEnum;
            }
        }
        return DEFAULT;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
