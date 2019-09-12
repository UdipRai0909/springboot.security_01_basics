//package com.manageticket;
//
//import spring.boot.security.example01.config.MyAppUserDetailsService;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private MyAppUserDetailsService myAppUserDetailsService;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		
//				.antMatchers("/app/secure/**")
//				.hasAnyRole("ADMIN", "USER")
//				.and()
//				 
//				// login
//				.formLogin()
//				.loginPage("/app/login")
//				.loginProcessingUrl("/app-login")
//				.usernameParameter("app_username")
//				.passwordParameter("app_password")
//				.defaultSuccessUrl("/app/secure/article-details")
//				.and()
//				
//				// logout
//				.logout() 
//				.logoutUrl("/app-logout")
//				.logoutSuccessUrl("/app/login")
//				.and()
//				.exceptionHandling() // exception handling 
//				.accessDeniedPage("/app/error");
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		auth.userDetailsService(myAppUserDetailsService).passwordEncoder(passwordEncoder);
//	}
//}