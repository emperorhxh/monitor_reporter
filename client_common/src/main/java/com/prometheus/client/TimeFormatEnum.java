package com.prometheus.client;

/**
 * 时间转换枚举。
 */
public enum TimeFormatEnum {
    /**
     * 返回以秒为单位的时间
     */
    SECOND_TIME_FORMAT {
        @Override
        public double format(long nanosDuration) {
            return nanosDuration/Collector.NANOSECONDS_PER_SECOND;
        }
    },
    /**
     * 返回以毫秒为单位的时间
     */
    MILLIISECOND_TIME_FORMAT {
        @Override
        public double format(long nanosDuration) {
            return nanosDuration/Collector.NANOSECONDS_PER_MILLISECOND;
        }
    };
    public abstract double format(long nanosDuration);

}
