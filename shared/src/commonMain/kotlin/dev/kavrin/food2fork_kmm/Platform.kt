package dev.kavrin.food2fork_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform