import enumerators.MoneyEnum;
import enumerators.WeekEnum;

public class App {
    public static void main(String[] args) throws Exception {

        WeekEnum folga = WeekEnum.DOMINGO;
        System.out.println(folga);
        MoneyEnum nota01 = MoneyEnum.LOBO;
        MoneyEnum nota02 = MoneyEnum.ONCA;
        System.out.println(nota01);
        System.out.println(nota01.getValue() + nota02.getValue());
    }
}