package com.nextstep.jngcii.racingcar.view

import com.nextstep.jngcii.racingcar.domain.History
import com.nextstep.jngcii.racingcar.domain.Record
import com.nextstep.jngcii.racingcar.domain.Winners

object ResultView {
    private const val DASH = "-"
    private const val JOIN_SEPARATOR = ", "

    fun print(history: History, winners: Winners) {
        println("실행 결과")

        history.records
            .forEach(::printSingleRecord)

        val winnerNameList = winners.cars
            .joinToString(JOIN_SEPARATOR) { it.name }

        println("${winnerNameList}가 최종우승했습니다.")
    }

    private fun printSingleRecord(record: Record) {
        record.distanceByName
            .forEach(::printSingleCarDistance)
        println()
    }

    private fun printSingleCarDistance(name: String, distance: Int) {
        println("$name : ${DASH.repeat(distance)}")
    }
}