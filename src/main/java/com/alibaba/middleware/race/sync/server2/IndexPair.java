package com.alibaba.middleware.race.sync.server2;

/**
 * Created by yche on 6/18/17.
 */
public class IndexPair {
    public long offset;
    public final short length;

    IndexPair(long offset, short length) {
        this.offset = offset;
        this.length = length;
    }
}
