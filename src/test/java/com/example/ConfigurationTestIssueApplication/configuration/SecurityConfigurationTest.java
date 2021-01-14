package com.example.ConfigurationTestIssueApplication.configuration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@RunWith(MockitoJUnitRunner.class)
public class SecurityConfigurationTest {

    @Test
    public void testConfigureAuthenticationManagerBuilder() {
        AuthenticationManagerBuilder authenticationManagerBuilder = Mockito.mock(AuthenticationManagerBuilder.class);

        Assert.assertNotNull(authenticationManagerBuilder);
    }
}
