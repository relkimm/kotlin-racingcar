package racingcar.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class CarNameTest : FunSpec({
    context("자동차 이름 생성 테스트") {
        context("5 글자 이하의 이름이면") {
            test("자동차 이름을 생성할 수 있다.") {
                val carName = CarName(value = "동구")
                carName.value shouldBe "동구"
            }
        }

        context("5 글자 초과의 이름이면") {
            test("IllegalArgumentException 이 발생한다.") {
                val exception = assertThrows<IllegalArgumentException> { CarName(value = "relkimm") }
                exception.message shouldBe "자동차 이름은 5 글자를 초과할 수 없습니다."
            }
        }

        context("이름이 비어 있으면") {
            test("IllegalArgumentException 이 발생한다.") {
                val exception = assertThrows<IllegalArgumentException> { CarName(value = "") }
                exception.message shouldBe "자동차 이름은 비어 있을 수 없습니다."
            }
        }
    }
})