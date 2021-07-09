package com.arunveersingh.hazelcastmember

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HazelcastMemberApplication

fun main(args: Array<String>) {
	runApplication<HazelcastMemberApplication>(*args)
}
