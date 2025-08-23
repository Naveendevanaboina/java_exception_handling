//package com.neoteric.security;
//
//
//    @Configuration
//    @EnableWebSecurity
//    public class SecurityConfig {
//
//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests()
//                    .requestMatchers("/admin").hasRole("ADMIN")
//                    .requestMatchers("/user").hasRole("USER")
//                    .anyRequest().authenticated()
//                    .and()
//                    .formLogin(); // Default login page
//
//            return http.build();
//        }
//
//        // In-memory user store (for testing)
//        @Bean
//        public InMemoryUserDetailsManager userDetailsService() {
//            UserDetails admin = User.withUsername("admin")
//                    .password("{noop}admin123")  // {noop} = no password encoder
//                    .roles("ADMIN")
//                    .build();
//
//            UserDetails user = User.withUsername("user")
//                    .password("{noop}user123")
//                    .roles("USER")
//                    .build();
//
//            return new InMemoryUserDetailsManager(admin, user);
//        }
//    }
//
//
//
//}
