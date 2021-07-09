package com.arunveersingh.hazelcastmember

import com.hazelcast.core.Hazelcast
import com.hazelcast.config.Config

import org.springframework.stereotype.Component

@Component
class HazelcastConfig() {
    init {
        val cfg = Config()
        val instance = Hazelcast.newHazelcastInstance(cfg)
        val mapCustomers: MutableMap<Int, String> = instance.getMap("customers")
        mapCustomers[1] = "Joe"
        mapCustomers[2] = "Ali"
        mapCustomers[3] = "Avi"
        println("Customer with key 1: " + mapCustomers[1])
        println("Map Size:" + mapCustomers.size)
        val queueCustomers = instance.getQueue<Any>("customers")
        queueCustomers.offer("Tom")
        queueCustomers.offer("Mary")
        queueCustomers.offer("Jane")
        println("First customer: " + queueCustomers.poll())
        println("Second customer: " + queueCustomers.peek())
        //System.out.println("Queue size: " + queueCustomers.size())
    }
}