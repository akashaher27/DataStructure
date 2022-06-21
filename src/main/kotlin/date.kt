import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.swing.text.DateFormatter

fun main() {
    var format = SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH)
    var date = format.parse("11-Feb-2022")
    print(dateToStringSimpleDate(date))
}

fun dateToStringSimpleDate(date: Date):String {
    var format = SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH)
    return format.format(date)
}