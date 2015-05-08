package com.oracle.bzwbk.coherence.dao;

/**
 * Created by kkolodzi on 2015-05-04.
 */

import com.tangosol.net.NamedCache;

import java.util.Map;

/**
 * Created by kkolodzi on 2015-02-03.
 */
public abstract class AbstractCacheDao {
    NamedCache cache;

    /**
     * Clear cache
     */
    public void clear(){
        cache.clear();
    }

    /**
     * get The Cache.
     * @return return NamedCache object
     */
    public NamedCache getCache() {
        return cache;
    }

    /**
     * Set the cache.
     * @param cdrRawDiameterPsCache namedCache to set.
     */
    public void setCache(NamedCache cdrRawDiameterPsCache) {
        this.cache = cdrRawDiameterPsCache;
    }

    /**
     * Check if cache is empty
     * @return
     */
    public boolean isEmpty(){
        return cache.isEmpty();
    }

    /**
     * Put object to cache
     * @param key - key
     * @param value - value
     */
    public void put(Object key, Object value){
        cache.put(key,value);
    }


    /**
     * Put object to cache
     * @param map - map of values
     */
    public void putAll(Map map){
        cache.putAll(map);
    }

    /**
     * Check if cache contains key
     * @param key - cache key to check
     * @return true if cache contains, false if no
     */
    public boolean containsKey(Object key){
        return cache.containsKey(key);
    }

    /**
     * Remove object from cache.
     * @param key
     */
    public void remove(Object key){
        if( cache.containsKey(key)) {
            cache.remove(key);
        }
    }
}

