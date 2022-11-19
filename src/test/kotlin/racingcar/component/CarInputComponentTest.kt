package racingcar.component

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize
import racingcar.store.CarStore

class CarInputComponentTest : FunSpec({
    context("커멘드 이벤트 리스너 테스트") {
        context("자동차 이름 입력 이벤트가 발생하면") {
            test("입력한 대수만큼 자동차를 생성하고 스토어에 저장한다.") {
                val sut = CarInputComponent()
                // when
                sut.onCommand("동구, 상근, 재혁, 주덕")
                // then
                val actual = CarStore.getState()
                actual shouldHaveSize 4
            }
        }
    }
})
