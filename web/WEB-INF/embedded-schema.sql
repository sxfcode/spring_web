CREATE TABLE `user` (                                                          
          `id` double NOT NULL AUTO_INCREMENT,                                         
          `name` text COLLATE utf8_unicode_ci,                                         
          `password` text COLLATE utf8_unicode_ci,                                     
          `age` int(11) DEFAULT NULL,                                                  
          `sex` int(11) DEFAULT NULL,                                                  
          PRIMARY KEY (`id`)                                                           
        ) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci  
