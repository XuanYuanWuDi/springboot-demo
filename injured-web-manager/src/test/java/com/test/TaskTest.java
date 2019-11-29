package com.test;

import com.injured.InjuredApplication;
import com.injured.project.compensat.service.DispatchedWorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zlu
 * @title: TaskTest
 * @projectName injured
 * @description: TODO
 * @date 2019/8/2913:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InjuredApplication.class)
public class TaskTest {


    @Autowired
    private DispatchedWorkerService dispatchedWorkerService;




    @Test
    public void task() throws Exception {
        dispatchedWorkerService.dispatchedWorker(76L);
    }
}
