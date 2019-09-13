package com.liferay.commerce.training.ditp;


import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = {
                "commerce.data.integration.process.type.key=" + CustomDITP.KEY,
                "commerce.data.integration.process.type.order=100"
        },
        service = ProcessType.class
)
public class CustomDITP implements ProcessType{

	public static final String KEY = "custom";
}
