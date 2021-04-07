package moe.eldritch

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("moe.eldritch")
		.start()
}

