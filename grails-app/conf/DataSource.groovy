
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	//  cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
	development {
		grails{
			mongo {
			host = "localhost"
			port = 27017
			databaseName = "anandDev"
			username = "rathi"
			password = "rathi"
			}
		}
	}
	
	production {
		grails{
			mongo {
				host = "localhost"
				port = 27017
				databaseName = "anand"
				username = "rathi"
				password = "rathi"
			}
		}
	}
	
}
