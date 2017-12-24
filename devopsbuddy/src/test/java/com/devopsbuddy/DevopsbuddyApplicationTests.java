package com.devopsbuddy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.devopsbuddy.web.i18n.I18NService;

import org.junit.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DevopsbuddyApplication.class)
@WebAppConfiguration

public class DevopsbuddyApplicationTests {

	//@Test
	//public void contextLoads() {
	//}
	
	@Autowired
	private I18NService i18NService;
	
	@Test
	public void testMessageByLocaleService() throws Exception{
		String expectedResult = "Bootstrap template van Ron";
		String messageId="index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("De aangeboden en verwachtte String komen niet overeen", expectedResult, actual);
	}

}
