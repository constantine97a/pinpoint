/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.plugin.redis.jedis;

import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.*;

import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * 
 * @author jaehong.kim
 *
 */
public final class JedisConstants {
    private JedisConstants() {
    }

    public static final ServiceType REDIS = ServiceTypeFactory.of(8200, "REDIS", TERMINAL, RECORD_STATISTICS);
    public static final String REDIS_SCOPE = "redisJedisScope";

    public static final String END_POINT_ACCESSOR = "com.navercorp.pinpoint.plugin.redis.jedis.EndPointAccessor";

}
