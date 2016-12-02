package com.isuwang.dapeng.pinpoint.plugin;

import com.navercorp.pinpoint.common.trace.*;
import com.sun.tools.classfile.Annotation;

/**
 * Created by tangliu on 16/12/5.
 */
public class DapengConstants {

    public static ServiceType DAPENG_PROVIDER_SERVICE_TYPE = ServiceTypeFactory.of(1999, "DAPENG_PROVIDER", ServiceTypeProperty.RECORD_STATISTICS);
    public static ServiceType DAPENG_CONSUMER_SERVICE_TYPE = ServiceTypeFactory.of(9999, "DAPENG_CONSUMER", ServiceTypeProperty.RECORD_STATISTICS);
    public static AnnotationKey DAPENG_ARGS_ANNOTATION_KEY = AnnotationKeyFactory.of(900, "dapeng.args");
    public static AnnotationKey DAPENG_RESULT_ANNOTATION_KEY = AnnotationKeyFactory.of(999, "dapeng.result");


}
