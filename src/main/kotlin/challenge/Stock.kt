package challenge

internal object Main {
    // Function to find the maximum profit earned by buying and
    // selling shares any number of times
    fun findMaxProfit(price: IntArray): Int {
        // keep track of the maximum profit gained
        var profit = 0

        // initialize the local minimum to the first element's index
        var j = 0

        // start from the second element
        for (i in 1 until price.size) {
            // update the local minimum if a decreasing sequence is found
            if (price[i - 1] > price[i]) {
                j = i
            }

            // sell shares if the current element is the peak,
            // i.e., (`previous <= current > next`)
            if (price[i - 1] <= price[i] && (i + 1 == price.size || price[i] > price[i + 1])) {
                profit += price[i] - price[j]
                System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1)
            }
        }
        return profit
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val price = intArrayOf(1, 5, 2, 3, 7, 6, 4, 5)
        print(
            """
                
                Total profit earned is ${findMaxProfit(price)}
                """.trimIndent()
        )
    }
}