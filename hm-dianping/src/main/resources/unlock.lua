if (redis.call('get', KEYS[1]) == ARGV[1]) then
    --释放锁 del
    return redis.call('del', KEYS[1])
end
return 0