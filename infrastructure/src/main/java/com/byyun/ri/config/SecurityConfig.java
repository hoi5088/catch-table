package com.byyun.ri.config;

import static org.springframework.security.config.Customizer.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@Configuration
//@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터 체인에 등록 된다.
public class SecurityConfig {
	private static final String[] PERMIT_URL_ARRAY = {
			/* swagger v2 */
			"/v2/api-docs",
			"/swagger-resources",
			"/swagger-resources/**",
			"/configuration/ui",
			"/configuration/security",
			"/swagger-ui.html",
			"/webjars/**",
			/* swagger v3 */
			"/v3/api-docs/**",
			"/swagger-ui/**"
	};

	//@Bean
	//public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		/*
		http
				.authorizeHttpRequests((authz) -> authz
						.anyRequest().authenticated()
				)
				.httpBasic(withDefaults());
		return http.build();

		 */
		/*
		http.authorizeHttpRequests().requestMatchers(
				new AntPathRequestMatcher("/swagger-ui/**")).permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/**").hasRole("USER")
				.requestMatchers("/admin/**").hasRole("ADMIN")
				.and()
				.formLogin(); // 로그인 화면 설정

		 */
		/*
		http
				.csrf().disable() // swagger API 호출시 403 에러 발생 방지
				.authorizeRequests()
				.requestMatchers(PERMIT_URL_ARRAY).permitAll() // 지정된 URL 은 인증 안해도 됨
				.anyRequest().authenticated()// 그 외 모든 URL은 인증 필요
				.and()
				.formLogin()// 로그인 화면 설정
				.and().headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN)); // X-Frame-Options 헤더 사용

		return http.build();

		 */
	//}
}
/*
@Configuration // 기존 WebSecurityConfigurerAdapter deprecate 되었으므로 사용하지 않음
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests((authz) -> authz
						.anyRequest().authenticated()
				)
				.httpBasic(withDefaults());
	}

}

 */
