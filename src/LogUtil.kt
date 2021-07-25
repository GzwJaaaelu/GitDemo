object LogUtil {
    var isOpen = false

    fun println(msg: String) {
        if (isOpen) {
            kotlin.io.println(msg)
        }
    }
}