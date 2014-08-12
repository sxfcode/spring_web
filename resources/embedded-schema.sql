CREATE TABLE `user` (                                                                                         
          `id` double NOT NULL AUTO_INCREMENT,                                                                        
          `name` text COLLATE utf8_unicode_ci,                                                                        
          `password` text COLLATE utf8_unicode_ci,                                                                    
          `age` int(11) DEFAULT NULL,                                                                                 
          `sex` int(11) DEFAULT NULL,                                                                                 
          PRIMARY KEY (`id`)                                                                                          
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC
        