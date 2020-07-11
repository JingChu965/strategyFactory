import enumm.RechargeTypeEnum;

import java.text.DecimalFormat;

/**
 * @description: 测试策略模式+工厂模式去if
 * @author: 赵波
 * @createtime :2020-07-09 10:14:12
 **/
public class TestStrategyFactory {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Context context = new Context();
        Double money = context.calRecharge(0.1D, RechargeTypeEnum.INTER_BANK.getValue());
        System.out.println("网银充值100，需要支付：" + df.format(money));
        money = context.calRecharge(0.1D, RechargeTypeEnum.MERCHANT.getValue());
        System.out.println("商户充值100，需要支付：" + df.format(money));
        money = context.calRecharge(0.1D, RechargeTypeEnum.PHONE.getValue());
        System.out.println("电话卡充值100，需要支付：" + df.format(money));
        money = context.calRecharge(0.1D, RechargeTypeEnum.CARD.getValue());
        System.out.println("充值卡充值100，需要支付：" + df.format(money));
    }
}
