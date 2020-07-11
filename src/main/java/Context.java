import enumm.RechargeTypeEnum;
import factory.StrategyFactory;
import strategy.Strategy;

/**
 * @description: 充值场景类
 * @author: 赵波
 * @createtime :2020-07-09 10:32:53
 **/
public class Context {
    private Strategy strategy;

    public Double calRecharge(Double charge, Integer type) {
        strategy = StrategyFactory.getInstance().creator(type);
        Double money = strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
        return money;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
