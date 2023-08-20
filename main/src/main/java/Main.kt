import org.luckypray.dexkit.DexKitBridge
import org.luckypray.dexkit.query.enums.StringMatchType
import java.io.File
import java.util.Locale

val isWindows
    get() = System.getProperty("os.name")
        .lowercase(Locale.getDefault())
        .contains("windows")

@Suppress("UnsafeDynamicallyLoadedCode")
fun loadLibrary(name: String) {
    try {
        System.loadLibrary(if (isWindows) "lib$name" else name)
    } catch (e: UnsatisfiedLinkError) {
        val libraryPath = File("main/build/library")
        libraryPath.listFiles()?.forEach {
            if (it.name.startsWith("lib$name")) {
                System.load(it.absolutePath)
            }
        }
    }
}

fun main() {
    loadLibrary("dexkit")
    println("current work dir: ${File("").absolutePath}")
    val file = File("apk/qq-8.9.2.apk")
    if (!file.exists()) {
        println("apk not found")
        return
    }
    doSearch(file.absolutePath)
}

fun doSearch(path: String) {
    DexKitBridge.create(path)?.use { bridge ->
        bridge
            .findClass {
                matcher {
                    className("seal.SealCloudRerankInfo\$CloudReRankInfo")
                }
            }
            .also {
                println("find class count: ${it.count()}")
                println("find class: ${it.first().name} -> \n")
            }
            .findField {}
            .also {
                println("find field count: ${it.count()}")
                it.forEach { println("field: $it") }
            }
            .first().getClass()!!
            .also {
                println("\nfield class: ${it.name} -> \n")
            }
            .getFields()
            .also {
                println("field count: ${it.count()}")
                it.forEach { println("field: $it") }
            }
    }
}
