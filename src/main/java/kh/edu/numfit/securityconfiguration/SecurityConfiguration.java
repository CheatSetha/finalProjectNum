package kh.edu.numfit.securityconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Autowired
	private CustomTeacherDetailService teacherDetail;
//	@Autowired
//	public SecurityConfiguration(CustomTeacherDetailService detailService) {
//		this.teacherDetail = detailService;
//	}
//	@Bean
//	public UserDetailsService userDetailService() {
//		return new CustomTeacherDetailService();
//	}
//	 @Bean
//     public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//         return authenticationConfiguration.getAuthenticationManager();
//     }
//	@Bean
//	public UserDetailsService userDetailManager() {
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//		manager.createUser(User.withUsername("admin").password(getPasswordEncoder().encode("admin")).build());
//		manager.createUser(User.withUsername("user").password(getPasswordEncoder().encode("user")).build());
//		return manager;
//	}
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//		authProvider.setPasswordEncoder(getPasswordEncoder());
//		authProvider.setUserDetailsService(teacherDetail);
//		return authProvider;
//	}
	
//	protected void configure(AuthenticationManagerBuilder builder) throws Exception{
//		builder.authenticationProvider(authenticationProvider());
//	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.csrf(csrf->csrf.disable())
		.authorizeHttpRequests(auth->auth
				.requestMatchers("/","/css/**","/img/*","/js/**","/scss/**","/vendor/**").permitAll()
				.requestMatchers("/schedulehome","/login/**").permitAll()
				.requestMatchers("/admin/**").hasRole("ADMIN")
				.requestMatchers("/course/**").hasAnyRole("ADMIN","USER")
				.anyRequest().authenticated()
				)
		.formLogin().loginPage("/login")
		.usernameParameter("txtPhoneNumber")
		.passwordParameter("txtPassword")
		//.loginProcessingUrl("/login")
		//.defaultSuccessUrl("/")
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/")
		.deleteCookies("JSESSIONID")
		.invalidateHttpSession(true)
		.clearAuthentication(true)
		.and()
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
