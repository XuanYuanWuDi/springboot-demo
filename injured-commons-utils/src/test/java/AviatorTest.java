import com.googlecode.aviator.AviatorEvaluator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zlu
 * @title: AviatorTest
 * @projectName injured
 * @description: TODO
 * @date 2019/7/1217:39
 */
public class AviatorTest {
    public static void main(String[] args) {
        String expersion = "medicalFee-IsMedicalInsurance-IrrelevantMedication";
        Map<String,Object> map = new HashMap<>();
        map.put("medicalFee",new BigDecimal(1000.25));
        map.put("IsMedicalInsurance",new BigDecimal(500.20));
        map.put("IrrelevantMedication",new BigDecimal(100.10));
        BigDecimal result = (BigDecimal) AviatorEvaluator.execute(expersion,map);
        System.out.println(result.setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}
