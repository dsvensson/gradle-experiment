import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

object Test {
	@JvmStatic
	fun main() {
		val mapper = ObjectMapper().registerModule(KotlinModule())
		println("omg $mapper")
	}
}
