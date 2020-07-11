package strategy;

import enumm.RechargeTypeEnum;

/**
 * @description: 充值卡充值
 * @author: 赵波
 * @createtime :2020-07-09 10:32:01
 **/
public class CardStrategy implements Strategy {
    public Double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return charge * 1.01;
    }
}
