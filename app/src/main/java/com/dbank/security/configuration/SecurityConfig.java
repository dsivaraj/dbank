package src.main.java.com.dbank.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  /*
   * Enables x509 client authentication.
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // @formatter:off
   /* http
        .authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .x509()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.NEVER)
        .and()
        .csrf()
        .disable();
    // @formatter:on*/
   http.x509();
  }

  /*
   * Create an in-memory authentication manager. We create 1 user (localhost which
   * is the CN of the client certificate) which has a role of USER.
   */
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("localhost").password("none").roles("USER");
  }
}
