grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.ilal.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.ilal.UserRole'
grails.plugin.springsecurity.authority.className = 'com.ilal.Role'

//grails.plugin.springsecurity.auth.loginFormUrl = '/home/login'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/home'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/home/login',     access: ['permitAll']],
		[pattern: '/oauth2/**',      access: ['permitAll']],
		[pattern: '/login/**',       access: ['permitAll']],
		[pattern: '/logout/**',      access: ['permitAll']],
		[pattern: '/**/assets/**',   access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']]
]