package net.lovholm.learningspringsecurity

import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.core.Authentication

class MyCustomAuthenticationProvider : AuthenticationProvider {
    override fun authenticate(authentication: Authentication?): Authentication {
        TODO("Not yet implemented")
    }

    override fun supports(authentication: Class<*>?): Boolean {
        TODO("Not yet implemented")
    }
}