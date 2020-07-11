package enumm;

/**
 * @description: 充值类型枚举类
 * @author: 赵波
 * @createtime :2020-07-09 10:18:58
 **/
public enum RechargeTypeEnum {

    //网银
    INTER_BANK(1, "网银充值"),
    //商户
    MERCHANT(2, "商户充值"),
    //手机充值
    PHONE(3, "手机充值"),
    //充值卡
    CARD(4, "充值卡充值");
    /**
     * value 类型
     * descripation 描述
     */
    private int value;
    private String description;

    /**
     * 构造函数
     * @param value 类型
     * @param description 描述
     */
    RechargeTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * 获得类型
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * 获取描述
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 判断类型在不在枚举中
     * @param value
     * @return
     */
    public static RechargeTypeEnum valueOf(int value){
        for(RechargeTypeEnum type: RechargeTypeEnum.values()){
            if(type.value==value){
                return type;
            }
        }
        return null;
    }
}
