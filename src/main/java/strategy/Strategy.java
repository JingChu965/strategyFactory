package strategy;

import enumm.RechargeTypeEnum;

/**
 * @description: 策略抽象类
 * @author: 赵波
 * @createtime :2020-07-09 10:16:52
 **/
public interface Strategy {
    /**
     * 策略行为方法：获得真实支付前述
     * @param charge 充值金额
     * @param rechargeTypeEnum 充值类型
     * @return
     */
     Double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum);
}
