package oauth2

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser

class HomeController {

    def index() {
        // Ambil principal (user) yang sudah login
        def authentication = SecurityContextHolder.context.authentication
        def principal = authentication?.principal

        // Ambil nama pengguna dari OAuth2
        def username = principal instanceof OidcUser ? principal.name : 'Guest'
        def email = principal instanceof OidcUser ? principal.email : ''

        render(view: 'index', model: [username: username, email: email])
    }

    def login() {
        render(view: 'login')
    }
}