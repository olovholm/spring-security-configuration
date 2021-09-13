package net.lovholm.learningspringsecurity

import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {


    override fun configure(http: HttpSecurity?) {
        super.configure(http)
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        val userDetailsService = InMemoryUserDetailsManager()

        val user = User.withUsername("ola")
            .password("123")
            .authorities("read")
            .build()

        userDetailsService.createUser(user)
        auth?.userDetailsService(userDetailsService)
            ?.passwordEncoder(NoOpPasswordEncoder.getInstance())
    }
}