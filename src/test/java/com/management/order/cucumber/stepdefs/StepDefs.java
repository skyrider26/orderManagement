package com.management.order.cucumber.stepdefs;

import com.management.order.OrderManagementApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OrderManagementApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
