package com.appestan.integhealth

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun scenarioDto_smsNumber() {
        var scenario: Scenario = Scenario(9090)
        assertEquals(9090, scenario.smsNumber)

    }

    @Test
    fun stateDto_test() {
        var stateDto = StateDto("stateName")
        stateDto.outMsg = "2001"
        assertEquals("stateName", stateDto.stateName)
        assertEquals("2001", stateDto.outMsg)
    }

    @Test
    fun optionDto_test() {
        var optionDto = OptionDto("success", "sub")

    }

    class OptionDto {

        private var inputKeyword: String
        private var outputKeyword: String

        constructor(inputKeyword: String, outputKeyword: String) {
            this.inputKeyword = inputKeyword
            this.outputKeyword = outputKeyword

        }
    }

    class StateDto {

        lateinit var stateName: String
        lateinit var outMsg: String

        constructor(stateName: String) {
            this.stateName = stateName
        }

    }


    class Scenario {

        lateinit var smsNumber: Number

        constructor(smsNumber: Number) {
            this.smsNumber = smsNumber
        }
    }
}
