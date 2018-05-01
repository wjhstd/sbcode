package com.ityousee.springutis.annotationUtils;

import java.lang.annotation.*;

/**
 *@ClassName: Required
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/19 16:19
 **/

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {

}
