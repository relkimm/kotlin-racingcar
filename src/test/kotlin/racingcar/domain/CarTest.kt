package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class CarTest {
    @Test
    fun is_go() {
        val car = Car("1")

        car.goStop(4)

        assertThat(car.position).isEqualTo(1)
    }

    @Test
    fun is_not_go() {
        val car = Car("1")

        car.goStop(3)

        assertThat(car.position).isEqualTo(0)
    }
}