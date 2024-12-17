import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home/login", "/oauth2/**", "/error**").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login() // Aktifkan login OAuth2
                .defaultSuccessUrl("/home/index", true) // Redirect setelah login sukses
                .and()
                .logout()
                .logoutSuccessUrl("/") // Redirect setelah logout
        return http.build()
    }
}