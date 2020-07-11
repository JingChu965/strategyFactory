package strategy;

import enumm.RechargeTypeEnum;

/**
 * @description: 手机充值
 * @author: 赵波
 * @createtime :2020-07-09 10:31:23
 **/
public class PhoneStrategy implements Strategy {
    public Double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return charge;
    }
}
