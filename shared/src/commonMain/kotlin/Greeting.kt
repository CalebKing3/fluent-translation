class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Que Hora Es?, ${platform.name}!"
    }
}