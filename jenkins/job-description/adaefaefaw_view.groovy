 
listView('adaefaefaw Jobs') {
    description('adaefaefaw Jobs')
    jobs {
        regex('adaefaefaw_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
