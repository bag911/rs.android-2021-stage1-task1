package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
//        throw NotImplementedError("Not implemented")
        var arrayIsHappy = false
        val resArray = sadArray.toMutableList()

        while(!arrayIsHappy){
            arrayIsHappy = true
            for (item: Int in 1 until resArray.size){
                if (item >= resArray.size-1) break
                if (resArray[item]>(resArray[item+1]+resArray[item-1])){
                    arrayIsHappy = false
                    resArray.removeAt(item)
                }
            }
        }
        return resArray.toIntArray()
    }
}
