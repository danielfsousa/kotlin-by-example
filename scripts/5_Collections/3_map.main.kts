#!/usr/bin/env kotlin

// const val POINTS_X_PASS: Int = 15
val POINTS_X_PASS: Int = 15
val eZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val eZPassReport: Map<Int, Int> = eZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (eZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId")
        eZPassAccounts[accountId] = eZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    eZPassReport.forEach { (k, v) -> println("ID $k: credit $v") }
}

accountsReport()
updatePointsCredit(1)
updatePointsCredit(1)
updatePointsCredit(5)
accountsReport()
