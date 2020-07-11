package strategy;

import enumm.RechargeTypeEnum;

/**
 * @description: 商户充值
 * @author: 赵波
 * @createtime :2020-07-09 10:30:33
 **/
public class MerchantStrategy implements Strategy {
    public Double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return charge * 0.90;
    }
}
