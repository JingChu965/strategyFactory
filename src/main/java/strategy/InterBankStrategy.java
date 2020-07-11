package strategy;

import enumm.RechargeTypeEnum;

/**
 * @description: 网银充值
 * @author: 赵波
 * @createtime :2020-07-09 10:29:09
 **/
public class InterBankStrategy implements Strategy {
    public Double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return charge * 0.85;
    }
}
