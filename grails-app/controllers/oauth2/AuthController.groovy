package oauth2


class AuthController {
    def google(){
        redirect(uri: "/oauth2/authorization/google")
    }
}