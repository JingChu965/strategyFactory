package factory;

import enumm.RechargeTypeEnum;
import strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 策略工厂 使用单例模式
 * @author: 赵波
 * @createtime :2020-07-09 10:34:11
 **/
public class StrategyFactory {
    private static StrategyFactory strategyFactory = new StrategyFactory();

    private StrategyFactory() {
    }

    private static Map<Integer, Strategy> strategyMap = new HashMap<Integer, Strategy>();

    static {
        strategyMap.put(RechargeTypeEnum.INTER_BANK.getValue(), new InterBankStrategy());
        strategyMap.put(RechargeTypeEnum.MERCHANT.getValue(), new MerchantStrategy());
        strategyMap.put(RechargeTypeEnum.PHONE.getValue(), new PhoneStrategy());
        strategyMap.put(RechargeTypeEnum.CARD.getValue(), new CardStrategy());
    }

    public Strategy creator(Integer type) {
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        return strategyFactory;
    }
}
