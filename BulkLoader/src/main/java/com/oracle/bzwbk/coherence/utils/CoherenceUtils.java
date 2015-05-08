package com.oracle.bzwbk.coherence.utils;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * Created by kkolodzi on 2015-05-04.
 */
public class CoherenceUtils {
    /**
     * Creates conection to coherence cache.
     * @param cacheName - Name of cache
     * @return NamedCache object
     */
    public  NamedCache createCacheConnection(String cacheName){
        NamedCache ccrRawCache = CacheFactory.getCache(cacheName);
        return ccrRawCache;
    }
}
