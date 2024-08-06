package com.cg.security.DefaultSecurity;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig{
	
//	@Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/welcome","/books").hasAnyRole("USER","ADMIN")
//                .requestMatchers("/admin").hasRole("ADMIN")
//                .requestMatchers("/user","/books/**").hasRole("USER")
//                .and().formLogin()
//                .and().logout()
//                .and().httpBasic();
//             
//        return http.build();
//    }
//
//	@Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails abc = User.builder()
//                .username("abc")
//                .password("{noop}abc")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{noop}admin")
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(abc, admin);
//    }

}

