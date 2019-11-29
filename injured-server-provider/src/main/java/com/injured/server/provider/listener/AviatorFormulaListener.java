package com.injured.server.provider.listener;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import com.injured.server.provider.aviator.AviatorUtil;
import com.injured.server.api.entity.InjuredCalculationFormula;
import com.injured.server.api.entity.InjuredCalculationFormulaExample;
import com.injured.server.provider.mapper.InjuredCalculationFormulaMapper;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

/**
 * @author zlu
 * @title: AviatorFormulaListener
 * @projectName injured
 * @description: 初始化计算公式
 * @date 2019/7/2917:06
 */
public class AviatorFormulaListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        InjuredCalculationFormulaMapper mapper =
    contextRefreshedEvent.getApplicationContext().getBean(InjuredCalculationFormulaMapper.class);

        InjuredCalculationFormulaExample example = new InjuredCalculationFormulaExample();

        List<InjuredCalculationFormula> formulas = mapper.selectByExample(example);

        for (InjuredCalculationFormula formula:formulas) {
             Expression expression  = AviatorEvaluator.compile(formula.getCalculationFormula());
             AviatorUtil.MapPut(formula.getId(),expression);
        }
    }
}
