package com.example.emp.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
	private SimpleAuthenticationSuccessHandler successHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/all").hasRole("ADMIN")
                //.antMatchers("/user").hasAnyRole("ADMIN", "USER")
                .antMatchers("/admin*").hasRole("ADMIN")
                .antMatchers("/user").hasRole("ADMIN")
                .antMatchers("/all").hasRole("ADMIN")
                .antMatchers("/hod/timetable").hasRole("HOD")
                .antMatchers("/hod/sitAllocation").hasRole("HOD")
                .antMatchers("/staff/timetable").hasRole("STAFF")
                .antMatchers("/staff/result").hasRole("STAFF")
                .antMatchers("/student/examination").hasRole("STUDENT")
                .antMatchers("/student/home").hasRole("STUDENT")
                .antMatchers("/student/about").hasRole("STUDENT")
                .antMatchers(
                		"/",
                        "/assets/",
                        "/js/",
                        "/images/",
                        "/css/",
                        "/img/**").permitAll()
                .and().formLogin().successHandler(successHandler);
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
