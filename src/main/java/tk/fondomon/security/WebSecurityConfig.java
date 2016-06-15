/**
 * 
 */
package tk.fondomon.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author miguel
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
	      .csrf().disable()
	      .authorizeRequests()
	        .antMatchers(HttpMethod.POST, "/members/**").hasRole("USER")
	        .antMatchers(HttpMethod.GET, "/members/**").hasRole("USER")
	        .antMatchers(HttpMethod.POST, "/requests/**").hasRole("USER")
	        .antMatchers(HttpMethod.GET, "/requests/**").hasRole("USER")
	        .antMatchers(HttpMethod.POST, "/topics/**").hasRole("USER")
	        .anyRequest().permitAll()
	        .and()
	      .httpBasic().and()
	      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
	      .withUser("").password("").roles("USER");
	}
}
