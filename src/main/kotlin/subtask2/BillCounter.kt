package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
//        throw NotImplementedError("Not implemented")
        var sum = 0
        for (i in bill){
            sum += i
        }
        sum -= bill[k]
        if (sum/2 == b){
            return "Bon Appetit"
        }else  {
            return "${b-sum/2}"
        }

    }
}
