package oauth2

class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'home', action: 'login')
//        "/"(view: 'home/login')
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
