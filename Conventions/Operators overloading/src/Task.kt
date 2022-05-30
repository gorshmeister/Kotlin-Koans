import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

class RepeatedTimesInterval(val timeInterval: TimeInterval, val number: Int)
    operator fun TimeInterval.times(number: Int) =
        RepeatedTimesInterval(this, number)

operator fun MyDate.plus(timeInterval: RepeatedTimesInterval) = addTimeIntervals(timeInterval.timeInterval, timeInterval.number )




fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}
fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

